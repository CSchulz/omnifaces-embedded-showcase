package de.cschulz.omnifaces.presentation;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import de.cschulz.omnifaces.domain.Name;

/**
 * @author Christian Schulz - open knowledge GmbH
 */
@FacesConverter(forClass = Name.class)
public class NameConverter implements Converter {

  public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
    if (s != null) {
      return new Name(s);
    } else {
      return null;
    }
  }

  public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
    if (o != null) {
      return ((Name)o).getValue();
    } else {
      return null;
    }
  }
}
