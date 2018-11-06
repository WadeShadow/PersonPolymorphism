package Comparators;

import java.util.Comparator;

public interface ComparatorFactory {
    /**
     * Creates a comparator for any field name in Student or Person. Not an OOP-style, but i couldn't make up any better idea (it would be nice if you can offer something)
     * @param fieldName
     * @return returns a Comparator that is a functional interface for sorting
     */
    static Comparator getComparator(String fieldName) {
        if (fieldName.equalsIgnoreCase("height"))
            return new HeightComparator();

        if (fieldName.equalsIgnoreCase("age"))
            return new AgeComparator();

        if (fieldName.equalsIgnoreCase("Gender"))
            return new GenderComparator();

        if (fieldName.equalsIgnoreCase("specialization"))
            return new SpecializationComparator();

        if (fieldName.equalsIgnoreCase("degree"))
            return new DegreeComparator();

        if (fieldName.equalsIgnoreCase("lastname") ||
                fieldName.equalsIgnoreCase("last name"))
            return new LastNameComparator();

        if (fieldName.equalsIgnoreCase("firstname") ||
                fieldName.equalsIgnoreCase("first name"))
            return new FirstNameComparator();

        return null;

    }
}
