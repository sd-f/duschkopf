var app = angular.module('gameEditorApp', ['ngRoute', 'ngAnimate']);

app.config(function($routeProvider) {
    $routeProvider
            .when('/game',
                    {
                        controller: 'GameController',
                        templateUrl: 'app/views/game.html'
                    })
            .when('/game/edit', {
                controller: 'GameController',
                templateUrl: 'app/views/game_mod.html'
            })
            .when('/game/newobject', {
                controller: 'GameController',
                templateUrl: 'app/views/gameobject_add.html'
            })
            .when('/game/object/:id', {
                controller: 'GameObjectController',
                templateUrl: 'app/views/gameobject.html'
            })
            .when('/game/object/:id/xml', {
                controller: 'GameObjectController',
                templateUrl: 'app/views/gameobject_mod_xml.html'
            })
            .when('/game/object/:id/edit', {
                controller: 'GameObjectController',
                templateUrl: 'app/views/gameobject_mod.html'
            })
            .when('/game/rules', {
                controller: 'GameRulesController',
                templateUrl: 'app/views/gamerules.html'
            })
            .when('/game/rule/:id/edit', {
                controller: 'GameRuleController',
                templateUrl: 'app/views/gamerule_mod.html'
            })
            .when('/game/rule/new', {
                controller: 'GameRuleController',
                templateUrl: 'app/views/gamerule_mod.html'
            })
            .otherwise({redirectTo: '/game'});
});