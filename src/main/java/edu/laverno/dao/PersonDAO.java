package edu.laverno.dao;

import edu.laverno.domain.Person;

public interface PersonDAO {

    Person findByName(String name);
}
