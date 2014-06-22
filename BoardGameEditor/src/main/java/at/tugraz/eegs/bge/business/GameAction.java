package at.tugraz.eegs.bge.business;

import java.io.Serializable;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
public class GameAction implements Serializable {

  private String id;

  public GameAction() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
