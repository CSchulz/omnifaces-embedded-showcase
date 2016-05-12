package de.cschulz.omnifaces.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 * @author Christian Schulz - open knowledge GmbH
 */
@Entity
public class Person {
  @Embedded
  private Name firstname;

  @Embedded
  private Name lastname;

  @Embedded
  private Address address;

  public Name getFirstname() {
    return firstname;
  }

  public void setFirstname(Name firstname) {
    this.firstname = firstname;
  }

  public Name getLastname() {
    return lastname;
  }

  public void setLastname(Name lastname) {
    this.lastname = lastname;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
