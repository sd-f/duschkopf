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
package at.tugraz.eegs.bge.business.services;

import at.tugraz.eegs.bge.business.Game;
import at.tugraz.eegs.bge.business.GameAction;
import at.tugraz.eegs.bge.business.GameObject;
import at.tugraz.eegs.bge.business.GameRule;
import at.tugraz.eegs.bge.business.GameRuleCondition;
import at.tugraz.eegs.bge.business.GameRun;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
@Stateful
public class GameRunnerImpl {

  Game game;

  public void setGame(Game game) {
    this.game = game;
  }

  /**
   * Laufzeit ist mies
   * <p>
   * @param gameRuleConditions
   * @return
   */
  private Boolean checkAllConditions(List<GameRuleCondition> gameRuleConditions) {
    for (GameRuleCondition condition : gameRuleConditions) {
      GameObject object = this.game.getGameObjects().get(this.game.getGameObjects().indexOf(condition.getObject()));
      if (!condition.isTrue(object)) {
        return false;
      }
    }
    return (!gameRuleConditions.isEmpty());
  }

  /**
   * gibt eine Rule zurück wenn alle Conditions aufgehen
   * <p>
   * @return
   */
  private GameRule getValidRule(Game game) {
    for (GameRule rule : game.getRules()) {
      if (checkAllConditions(rule.getConditions())) {
        return rule;
      }
    }
    return null;
  }

  public GameRun next() {
    GameRun gameRun = new GameRun();
    gameRun.setCurrentGame(this.game);
    List<GameAction> actions = new ArrayList<GameAction>();
    GameRule applicableRule = this.getValidRule(this.game);
    if (null != applicableRule) {
      actions.addAll(applicableRule.getActions());
      // actions ausführen
      this.executeAllActions(actions);
    }
    gameRun.getActions().addAll(actions);
    return gameRun;
  }

  private void executeAllActions(List<GameAction> actions) {

  }

}
