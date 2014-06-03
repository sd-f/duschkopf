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



app.controller("GameController", function($scope, gameFactory) {
  var init = function() {
    gameFactory.getGame().success(function(data) {
      $scope.game = data.game;
    });
  };
  init();
});



app.factory('gameFactory', function($http) {
  var factory = {};
  factory.getGame = function() {
    return $http.get("rest/game");
  };
  return factory;
});
