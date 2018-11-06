package Comparators;

import GroupPackage.Student;

import java.util.Comparator;

public class GenderComparator implements Comparator<Student> {
    @Override
    public int compare(Student  p1, Student  p2) {
        return p1.getGender().compareTo(p2.getGender());
    }
}
