package at.tugraz.eegs.bge.business;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import at.tugraz.eegs.bge.business.actions.Action;
import at.tugraz.eegs.bge.business.actions.ActionPlugin;
import at.tugraz.eegs.bge.business.actions.ActionSetObjectState;
import at.tugraz.eegs.bge.business.actions.ActionShowMessage;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
@XmlRootElement(name = "gameAction")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlSeeAlso({ActionPlugin.class, ActionShowMessage.class, ActionSetObjectState.class})
public class GameAction implements Serializable {

  private static final long serialVersionUID = 1L;

  private Action action;

  private List<String> parameters;

  public GameAction() {
  }

  @XmlAnyElement
  public Action getAction() {
    return action;
  }

  public void setAction(Action action) {
    this.action = action;
  }

  public List<String> getParameters() {
    return parameters;
  }

  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }

}
