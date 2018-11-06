package Comparators;


import GroupPackage.Person;
import GroupPackage.Student;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student p1, Student p2) {
        return p1.getFirstName().compareTo(p2.getFirstName());
    }
}
