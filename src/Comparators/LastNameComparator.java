package Comparators;


import GroupPackage.Person;
import GroupPackage.Student;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Student > {
    @Override
    public int compare(Student p1, Student  p2) {
        return p1.getLastName().compareTo(p2.getLastName());
    }
}