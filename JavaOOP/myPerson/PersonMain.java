package myPerson;

import cars.Car;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person[]persons={
                new Person("Janko"),
                new Person("Peter",120),
                new Person("Ondrej",50),
                new Person("Anna",30),
                new Person("Miso",40),
                new Person("Peter",20),

        };
        Arrays.sort(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);

        }
        System.out.println(persons[1] instanceof Comparable<?>);





//


    }
}
