package ua.pevzner.dao;

import org.springframework.stereotype.Component;
import ua.pevzner.model.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    public int id=0;
    ArrayList<Person> peopleList;

    {
        peopleList = new ArrayList<>();

        peopleList.add(new Person(++id,"Andrey", 13));
        peopleList.add(new Person(++id,"Andrey", 14));
    }


    public List<Person> getPeopleList(){
        return peopleList;
    }
    public Person getPerson(int id){

        Person person = null;
        for(Person x : peopleList){
            if(id == x.getId()){
                person = x;
                break;
            }
        }
        return person;
    }
}
