package at.tugraz.eegs.bge.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import at.tugraz.eegs.bge.business.actions.ActionPlugin;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class GameRule implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String name;

  private List<GameRuleCondition> conditions = new ArrayList<GameRuleCondition>();

  private List<GameAction> actions = new ArrayList<GameAction>();

  public GameRule() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @XmlElementWrapper
  public List<GameRuleCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<GameRuleCondition> conditions) {
    this.conditions = conditions;
  }

  @XmlElementWrapper
  public List<GameAction> getActions() {
    return actions;
  }

  public void setActions(List<GameAction> actions) {
    this.actions = actions;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final GameRule other = (GameRule) obj;
    if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
      return false;
    }
    return true;
  }

}
