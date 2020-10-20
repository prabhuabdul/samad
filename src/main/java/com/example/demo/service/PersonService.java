package com.example.demo.service;

import com.example.demo.data.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    List<Person> per_lst = new ArrayList();

    public List<Person> getPersonList(){
        Person person= new Person();
        person.setAge(12);
        person.setFirstName("prabhu");
        person.setLastName("samad");

        Person person1= new Person();
        person1.setAge(12);
        person1.setFirstName("prabhu");
        person1.setLastName("samad");

        Person person2= new Person();
        person2.setAge(12);
        person2.setFirstName("prabhu");
        person2.setLastName("samad");


        per_lst.add(person);
        per_lst.add(person1);
        per_lst.add(person2);

        return per_lst;
    }

}
