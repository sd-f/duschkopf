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

app.controller("GameRulesController", function($scope, gameRulesFactory, $location) {
    $scope.rules = [];

    var init = function() {
        gameRulesFactory.getGameRules().success(function(data) {
            //updateRules($scope, data);
            $scope.rules = data.gameRule;
        });
    };
    init();
    $scope.removeRule = function(id)
    {
        gameRulesFactory.removeGameRule(id).success(function() {
            $location.path("/game/rules");
        });
    };

});
app.factory('gameRulesFactory', function($http) {
    var factory = {};
    factory.getGameRules = function() {
        return $http.get("rest/game/rules");
    };
    factory.removeGameRule = function(id) {
        return $http.post("rest/game/rule/" + id + "/remove", data = '', {headers: {'Content-Type': 'application/json'}});
    };
    return factory;
});

app.controller("GameRuleController", function($scope, $routeParams, $location, gameRuleFactory) {

    var init = function() {
        gameRuleFactory.getGameRule($routeParams.id).success(function(data) {
            $scope.gameRule = data.gameRule;
        });
    };
    init();
    $scope.saveGameRule = function()
    {
        gameRuleFactory.saveGameRule($routeParams.id, $scope.gameRule).success(function() {
            $location.path("/game/rules");
        });
    };

});
app.factory('gameRuleFactory', function($http) {
    var factory = {};
    factory.getGameRule = function(id) {
        return $http.get("rest/game/rule/" + id);
    };
    factory.saveGameRule = function(id, gameRule) {
        return $http.post(
                "rest/game/rule/" + id + "/save",
                data = {gameRule: gameRule},
        {headers: {'Content-Type': 'application/json'}}
        );
    };
    return factory;
});
