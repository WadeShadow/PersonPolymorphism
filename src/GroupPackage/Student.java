package GroupPackage;

import java.util.Objects;

public class Student extends Person {
    private String degree;
    private String specialization;

    public Student(String firstName, String lastName, int height, int age, String gender, String degree, String specialization) {
        super(firstName, lastName, height, age, gender);
        this.degree = degree;
        this.specialization = specialization;
    }

    public Student enterUniversity(Person person, String degree, String specialization) {        //Factory method that can return a student from a person
        return new Student(person.getFirstName(), person.getLastName(), person.getHeight(), person.getAge(), person.getGender(), degree, specialization);
    }

    @Override
    public String toString() {
        return super.toString() + ", degree = '" + degree + '\''
                + ", specialization = '" + specialization + '\'';
    }

    public String getDegree() {
        return degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(degree, student.degree) &&
                Objects.equals(specialization, student.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), degree, specialization);
    }
}
