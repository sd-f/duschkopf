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



app.controller("GameController", function($scope, gameFactory, $location) {
  var init = function() {
    gameFactory.getGame().success(function(data) {
      $scope.game = data.game;
      
      $scope.objs = [];
      if (data.game.gameObjects !== undefined) 
        if (data.game.gameObjects["id"] === undefined)
          for (key in data.game.gameObjects)
            $scope.objs.push(data.game.gameObjects[key]);
        else
          $scope.objs.push(data.game.gameObjects);
    });
  };
  init();
  
  $scope.removeObject = function(id)
  {
    gameFactory.removeGameObject(id);
    $location.path("#/game");
  };
  
  $scope.addObject = function()
  {
    gameFactory.addGameObject($scope.gameObject);
    $location.path("#/game");
  };
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
      data = { gameObject: gameObject },
      {headers: {'Content-Type': 'application/json'}}
    );
  };
  
  return factory;
});
