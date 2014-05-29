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

var ajApp = angular.module("ajApp", []);

// hinzufügen eines Controllers zum Modul
ajApp.controller("NavigationController", function($scope, $http) {
  $scope.active = "home";
  $scope.hideBoard = true;
  $scope.navClick =
          function(navItem) {
            $scope.title = navItem;
            $scope.active = navItem;
            switch (navItem) {
              case "main":
                $scope.hideBoard = false;
                $http({
                  method: 'POST',
                  url: "xml3d/cube.xml"
                }).success(function(data, status) {
                  $("scene").append(data);
                }).error(function(data, status) {
                  alert("Error loading 3D-XML " + status)
                });

                break;
              default:
                $scope.hideBoard = true;
                $scope.content = "Home";
                break;
            }
          };
});