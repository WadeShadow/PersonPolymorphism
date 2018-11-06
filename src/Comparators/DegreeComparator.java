package Comparators;
import GroupPackage.Student;

import java.util.Comparator;

public class DegreeComparator implements Comparator<Student> {
    @Override
    public int compare(Student  p1, Student  p2) {
        return p1.getDegree().compareTo(p2.getDegree());
    }
}