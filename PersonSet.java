import java.util.ArrayList;

interface PersonList {
    void add(Person personToAdd);
    Person get(int personIndex);
}

class PersonSet implements PersonList {
    private ArrayList<Person> personList = new ArrayList<>();

    public Person get(int index) {
        return this.personList.get(index);
    }

    public void add(Person personToAdd) {

        if (!this.personList.isEmpty()) {
            for (int i = 0; i < this.personList.size(); ++i) {
                if (
                    personToAdd.getHeight() == this.personList.get(i).getHeight()
                    && personToAdd.getWeight() == this.personList.get(i).getWeight()
                    && personToAdd.getName().matches(this.personList.get(i).getName())
                ) {
                    this.personList.add(personToAdd);
                }
            }
        } else {
            this.personList.add(personToAdd);
        }
    }
}
