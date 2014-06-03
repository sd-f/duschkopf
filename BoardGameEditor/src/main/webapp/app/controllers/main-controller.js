var app = angular.module('gameEditorApp', ['ngRoute', 'ngAnimate']);

app.config(function($routeProvider) {
  $routeProvider
          .when('/game',
                  {
                    templateUrl: 'app/views/game.html'
                  })
          .when('/object/:id', {
            templateUrl: 'app/views/gameobject.html'
          }).otherwise({redirectTo: '/game'});
});