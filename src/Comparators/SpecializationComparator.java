package Comparators;
import GroupPackage.Student;

import java.util.Comparator;

public class SpecializationComparator implements Comparator<Student> {
    @Override
    public int compare(Student  p1, Student  p2) {
        return p1.getSpecialization().compareTo(p2.getSpecialization());
    }
}