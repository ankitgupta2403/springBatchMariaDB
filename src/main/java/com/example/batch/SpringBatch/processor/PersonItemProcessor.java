package com.example.batch.SpringBatch.processor;

import com.example.batch.SpringBatch.model.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person,Person> {

    @Override
    public Person process(Person person) throws Exception {
        return person;
    }
}
