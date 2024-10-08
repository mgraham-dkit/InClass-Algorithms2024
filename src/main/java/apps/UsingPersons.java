package apps;

import business.Person;

public class UsingPersons {
    public static void main(String[] args) {
        Person [] people = new Person[10];
        for (int i = 0; i < people.length; i++) {
            Person p = new Person("Ganon", "Aubrey", i);
            people[i] = p;
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
