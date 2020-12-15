package hbcu.stay.ready.baronsfarm.classes;

import java.util.ArrayList;
import java.util.Collections;

public class FarmHouse extends Farm {

    public FarmHouse(){
        super();
    }

    private ArrayList<Person> personArrayList;

    public FarmHouse(Person baron, Person baroness){
        personArrayList = new ArrayList<>();

        personArrayList.add(baron);
        personArrayList.add(baroness);
    }

    public void addPerson(Person person){
        Collections.addAll(personArrayList);
    }

    public ArrayList<Person> getPersonArrayList(){
        return personArrayList;
    }
}
