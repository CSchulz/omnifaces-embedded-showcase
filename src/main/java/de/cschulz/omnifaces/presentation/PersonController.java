package de.cschulz.omnifaces.presentation;

import de.cschulz.omnifaces.domain.Address;
import de.cschulz.omnifaces.domain.City;
import de.cschulz.omnifaces.domain.Name;
import de.cschulz.omnifaces.domain.Person;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * @author Christian Schulz - open knowledge GmbH
 */
@ApplicationScoped
@Named
public class PersonController implements Serializable {

  private Person person;

  @PostConstruct
  protected void postConstruct() {
    person = new Person();
    person.setFirstname(new Name("First"));
    person.setLastname(new Name("Last"));
    person.setAddress(new Address(new City(new Name("city"))));
  }

  public Person getPerson() {
    return person;
  }

  public void checkValues() {

  }
}
