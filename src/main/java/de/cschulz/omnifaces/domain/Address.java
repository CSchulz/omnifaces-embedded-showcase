package de.cschulz.omnifaces.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

@Embeddable
public class Address implements Serializable {

  @Embedded
  private City city;
  
  protected Address() {
    // for frameworks
  }

  public Address(City city) {
    this.city = city;
  }
  
  public City getCity() {
    return city;
  }
}
