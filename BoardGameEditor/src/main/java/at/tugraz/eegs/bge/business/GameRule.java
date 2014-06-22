package at.tugraz.eegs.bge.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
public class GameRule implements Serializable {

  private String id;

  private List<GameRuleCondition> conditions = new ArrayList<GameRuleCondition>();

  private GameAction action;

  public GameRule() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<GameRuleCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<GameRuleCondition> conditions) {
    this.conditions = conditions;
  }

  public GameAction getAction() {
    return action;
  }

  public void setAction(GameAction action) {
    this.action = action;
  }

}
