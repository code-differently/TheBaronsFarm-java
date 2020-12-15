package hbcu.stay.ready.baronsfarm.Classes.Housing;

import hbcu.stay.ready.baronsfarm.Classes.Person;

import java.util.ArrayList;

public class FarmHouse {
    private ArrayList<Person> personList = new ArrayList<Person>();


        public Person addPerson(Person person){
            personList.add(person);
            return person;
        }

        public ArrayList<Person> getPerson(){
            return personList;
        }


    }

