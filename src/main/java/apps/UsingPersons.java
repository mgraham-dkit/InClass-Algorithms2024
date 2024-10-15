package apps;

import business.Person;

import java.util.Scanner;

public class UsingPersons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person [] people = new Person[5];
        for (int i = 0; i < people.length; i++) {
            System.out.println("First name: ");
            String first = input.nextLine();

            System.out.println("Last name: ");
            String last  = input.nextLine();

            System.out.println("Age: ");
            int age = input.nextInt();
            input.nextLine();

            Person p = new Person(last, first, age);
            people[i] = p;
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
