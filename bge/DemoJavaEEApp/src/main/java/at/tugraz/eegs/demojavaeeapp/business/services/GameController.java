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
package at.tugraz.eegs.demojavaeeapp.business.services;

import at.tugraz.eegs.demojavaeeapp.business.Game;
import at.tugraz.eegs.demojavaeeapp.business.Piece;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
@Stateful
public class GameController {

  private Game game;

  private Integer initCouter = 0;

  @PostConstruct
  public void init() {
    this.game = new Game();
    this.game.setName("Neues Game");
    this.game.addPiece(new Piece("Läufer 1"));
    this.game.addPiece(new Piece("Bauer 1"));
    this.game.addPiece(new Piece("Bauer 2"));
  }

  public void initGame() {

    this.initCouter++;
    this.game.setInitCounter(this.initCouter);
  }

  public Game getGame() {
    return game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

}
