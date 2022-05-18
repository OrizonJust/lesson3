package edu.laverno.service;

import edu.laverno.dao.PersonDAO;
import edu.laverno.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDAO dao;

    @Autowired
    public PersonServiceImpl(PersonDAO dao) {
        this.dao = dao;
    }

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
