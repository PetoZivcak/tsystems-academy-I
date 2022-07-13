package persons;

import cars.Car;

public class Person implements CompareObject {
    public static final String JAHODA = "Jahoda";
    private String name; // = null;
    private int age; // = 0;
    private Car car;

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }


    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Person(String name) {
        this(name, 5);
    }

    public Person(String name, int age) {
        this.name = name;
        if (isValidAge(age)) {
            this.age = age;
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

    public void setAge(int age) {
        if (isValidAge(age)) {
            this.age = age;
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private boolean isValidAge(int ageNew) {
        return ageNew >= 0 && ageNew <= 150;
    }

    @Override
    public String toString() {
        return "MyPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                (car != null ? ", car=" + car : "") +
                '}';
    }

    @Override
    public int compareTo(CompareObject obj) {
        return 0;
    }
}