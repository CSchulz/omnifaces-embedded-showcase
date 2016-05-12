package de.cschulz.omnifaces.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author Christian Schulz - open knowledge GmbH
 */
@Embeddable
public class Name implements Serializable {
  private String value;

  public Name(String name) {
    value = name;
  }

  public String getValue() {
    return value;
  }
}
