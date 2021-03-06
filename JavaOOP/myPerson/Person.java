package myPerson;

import persons.ArraySort;

import java.lang.reflect.Array;

public class Person  implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name) {
        this(name, 0);
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        if (isValidAge(age)) {
            this.age = age;
        }else{
            System.out.println("neplatný vek");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    private boolean isValidAge ( int ageNew){
        return ageNew >= 0 && ageNew <= 150;
    }

    public void setAge(int age) {
       if (isValidAge(age)) {
            this.age = age;
        }else{
           System.out.println("neplatný vek");
       }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name)==0){
           return this.age-o.age;
        }
        return  this.name.compareTo(o.name);
    }
}
