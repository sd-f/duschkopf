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

app.controller("GameObjectController", function($scope, $routeParams, $location, gameObjectFactory) {
    var init = function() {
        gameObjectFactory.getGameObject($routeParams.id).success(function(data) {
            $scope.gameObject = data.gameObject;
        });

        gameObjectFactory.getGameObjectXML($routeParams.id).success(function(data) {
            xmlData = $.parseXML(data);
            xml = $(xmlData);
            $scope.gameObjectXML = $('<div>').append(xml.find('Shape').clone()).html();
        });
    };
    init();

    $scope.saveObject = function()
    {
        gameObjectFactory.saveGameObject($scope.gameObject).success(function(data) {
            $location.path("#/game/object/" + $scope.gameObject.id + "/");
        });
    };

    $scope.saveGameObjectXML = function()
    {
        gameObjectFactory.saveGameObjectXML($scope.gameObject.id, $scope.gameObjectXML).success(function(data) {
            $location.path("#/game/object/" + $scope.gameObject.id + "/");
        });
    };
});

app.factory('gameObjectFactory', function($http) {
    var factory = {};
    factory.getGameObject = function(id) {
        return $http.get("rest/game/object/" + id);
    };

    factory.getGameObjectXML = function(id) {
        return $http({
            url: "rest/game/object/" + id,
            dataType: 'xml',
            method: 'GET',
            data: '',
            headers: {
                "Accept": "application/xml"
            }

        });
    };

    factory.saveGameObject = function(gameObject) {
        return $http.post(
                "rest/game/object/" + gameObject.id + "/save",
                data = {gameObject: gameObject},
        {headers: {'Content-Type': 'application/json'}}
        );
    };

    factory.saveGameObjectXML = function(id, gameObjectXML) {
        return $http({
            url: "rest/game/object/" + id + "/xml/save",
            dataType: 'xml',
            method: 'POST',
            data: gameObjectXML,
            headers: {
                "Accept": "application/xml"
                , "Content-Type": "application/xml"
            }

        });
    };

    return factory;
});

// $("scene").append($.parseXML(dataXML).childNodes[0].childNodes)

