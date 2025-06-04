// Name: Robert Vanderburg
// Email: rvanderburg@unm.edu
// Assignment: PersonSet.java (Human Resources)
// Purpose: Human Resource Parts 1 and 2. provide mechanisms for inheritance, 
// inerfaces, polymorphism, and file io.

import java.util.ArrayList;

class PersonSet implements PersonList {

    // instantiate ArrayList to hold Person objects.
    private ArrayList<Person> personList = new ArrayList<>();

    // gets a Person object from the ArrayList at the index position.
    public Person get(int index) {
        return this.personList.get(index);
    }

    // helper method. ArrayList is private and cannot use ArrayList.size().
    public int countPeople() {
        return this.personList.size();
    }

    // adds a Person object to the ArrayList.
    // verifies a person match does not already exist in the list.
    public void add(Person personToAdd) {

        boolean found = false;

        // if the list is not empty, proceed with checking for duplicates.
        if (!this.personList.isEmpty()) {

            String name = personToAdd.getName();

            // check that the list does not already contain personToAdd.
            for (int i = 0; i < this.personList.size(); ++i) {
                if (!this.personList.contains(personToAdd)) {
                    this.personList.add(personToAdd);
                }
            }
        } else {
            this.personList.add(personToAdd);
        }
    }

    @Override
    public String toString() {
        String stringToReturn = "";

        for (int i = 0; i < this.personList.size(); ++i) {
            double height = this.personList.get(i).getHeight();
            double weight = this.personList.get(i).getWeight();
            String name = this.personList.get(i).getName();
            stringToReturn = stringToReturn + name + " " + weight + " " + height + "\n";
        }
        return stringToReturn;
    }
}
