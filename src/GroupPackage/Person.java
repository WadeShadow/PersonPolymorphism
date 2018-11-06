package GroupPackage;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int height;
    private int age;
    private String gender;

    public Person(String firstName, String lastName, int height, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "lastname = '" + lastName + '\'' +
                        ", firstname = '" + firstName + '\'' +
                        ", height = " + height +
                        ", age = " + age;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person person = (Person) obj;
        return height == person.height &&
                age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, height, age);
    }
}
