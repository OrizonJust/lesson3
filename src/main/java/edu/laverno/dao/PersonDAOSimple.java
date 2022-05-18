package edu.laverno.dao;

import edu.laverno.domain.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAOSimple implements PersonDAO {

    @Override
    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
