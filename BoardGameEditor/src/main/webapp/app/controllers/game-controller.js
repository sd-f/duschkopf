/*
 * Copyright (C) 2014 Lucas Reeh <lreeh@tugraz.at>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

var xml;

var loadBoard = function($http) {
    // reload scene
    $http({
        method: 'POST',
        url: "rest/game/board/xml"
    }).success(function(data, status) {
        xml = $.parseXML(data);
        $("scene").append(xml.childNodes[0].childNodes);
        x3dom.reload();

    }).error(function(data, status) {
        alert("Error loading 3D-XML " + status)
    });
}

var updateGame = function($scope, data, $http) {
    $scope.game = data.game;
    $scope.objs = [];
    if (data.game.gameObjects !== undefined) {
        if (data.game.gameObjects["id"] === undefined) {
            for (key in data.game.gameObjects) {
                $scope.objs.push(data.game.gameObjects[key]);
            }
        }
        else {
            $scope.objs.push(data.game.gameObjects);
        }
    }
    if ($scope.objs.length) {
        loadBoard($http);
    }
};

app.controller("GameController", function($scope, $http, gameFactory, $location, $timeout) {
    //x3dom.reload();
    var init = function() {
        gameFactory.getGame().success(function(data) {
            updateGame($scope, data, $http);
        });
    };
    init();
    $scope.removeObject = function(id)
    {
        gameFactory.removeGameObject(id).success(function() {
            $location.path("#/game");
        });
    };
    $scope.addObject = function()
    {
        gameFactory.addGameObject($scope.gameObject).success(function() {
            $location.path("#/game");

        });
    };
    $scope.saveGame = function()
    {
        gameFactory.saveGame($scope.game).success(function(data) {
            updateGame($scope, data, $http);
            $location.path("/game");
        });
    };
    $scope.newGame = function()
    {
        gameFactory.newGame($scope.gameObject).success(function(data) {
            updateGame($scope, data, $http);
            $scope.game = data.game;
        });
    };
    $scope.newTestdata = function()
    {
        gameFactory.newTestdata($scope.gameObject).success(function(data) {
            updateGame($scope, data, $http);
            $scope.game = data.game;
        });
    }
    ;
});
app.factory('gameFactory', function($http) {
    var factory = {};
    factory.getGame = function() {
        return $http.get("rest/game");
    };
    factory.removeGameObject = function(gameObjectId) {
        return $http.post(
                "rest/game/object/" + gameObjectId + "/remove",
                data = gameObjectId,
                {headers: {'Content-Type': 'application/json'}}
        );
    };
    factory.addGameObject = function(gameObject) {
        return $http.post(
                "rest/game/newobject/save",
                data = {gameObject: gameObject},
        {headers: {'Content-Type': 'application/json'}}
        );
    };
    factory.saveGame = function(game) {
        return $http.post(
                "rest/game/save",
                data = {game: game},
        {headers: {'Content-Type': 'application/json'}}
        );
    };
    factory.newGame = function() {
        return $http.get("rest/game/new");
    };
    factory.newTestdata = function() {
        return $http.get("rest/game/new/testdata");
    };
    return factory;
});
