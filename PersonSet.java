// Name: Robert Vanderburg
// Email: rvanderburg@unm.edu
// Assignment: PersonSet.java (Human Resources)
// Purpose: Human Resource Parts 1 and 2. provide mechanisms for inheritance, 
// inerfaces, polymorphism, and file io.

import java.util.ArrayList;

class PersonSet implements PersonList {
    private ArrayList<Person> personList = new ArrayList<>();

    public Person get(int index) {
        return this.personList.get(index);
    }

    public int countPeople() {
        return this.personList.size();
    }

    public void add(Person personToAdd) {
        char found = 'N';
        if (!this.personList.isEmpty()) {
            String name = personToAdd.getName();
            for (int i = 0; i < this.personList.size(); ++i) {
                if (
                    personToAdd.getHeight() == this.personList.get(i).getHeight()
                    && personToAdd.getWeight() == this.personList.get(i).getWeight()
                    && name.equals(this.personList.get(i).getName())
                ) {
                    found = 'Y';
                } 
            }
            if (found == 'N') {        
                    this.personList.add(personToAdd);
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
