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

app.controller("GameObjectController", function($scope, $routeParams, gameObjectFactory) {
  
  gameObjectFactory.getGameObject($routeParams.id).success(function(data){
    $scope.gameObject = data.gameObject;
  });

  $scope.saveObject = function()
  {
    gameObjectFactory.saveGameObject($scope.gameObject);
  };
});

app.factory('gameObjectFactory', function($http) {
  var factory = {};
  factory.getGameObject = function(id) {
    return $http.get("rest/game/object/" + id);
  };
  
  factory.saveGameObject = function(gameObject) {
    return $http.post(
      "rest/game/object/" + gameObject.id + "/save", 
      data = gameObject,
      {headers: {'Content-Type': 'application/json'}}
    );
  };
  
  return factory;
});

// $("scene").append($.parseXML(dataXML).childNodes[0].childNodes)

