package com.kodilla.exercise1_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        final String firstName = person.getFirstName();
        final String lastName = person.getLastName();
        final LocalDate dateOfBirth = person.getDateOfBirth();

        final Person processedPerson = new Person(firstName, lastName, dateOfBirth);

        log.info("Converting (" + person + ") into (" + processedPerson + ")");

        return processedPerson;
    }

}