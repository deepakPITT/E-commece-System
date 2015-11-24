/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person createAndAddPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
}
