import java.util.Arrays;

public class Group {
    private static final int groupCapacity = 10;
    private String groupName;
    private Student[] students = new Student[0];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void add(Student newStudent) throws GroupOverflowException, AlreadyRegisteredStudentException {
        if (newStudent == null) return;
        for (Student groupStudent : students) {
            if (groupStudent.equals(newStudent))
                throw new AlreadyRegisteredStudentException();      //If we try to add an already present student
        }
        if (students.length < groupCapacity) {
            Student[] tempStudents;
            tempStudents = Arrays.copyOf(students, students.length+1); //As long as students are just bundles of primitives and strings we can rely on copyOf
            tempStudents[students.length] = newStudent;
            students = tempStudents;
            return;
        }
        throw new GroupOverflowException();
    }

    public void delete(Student student) {        //Deletes the first student with specified parameters ( We assume that there are no more than 1 equal students )
        if (student == null) return;
        for (int i = 0; i < students.length; ++i) {
            if (students[i].equals(student)) {
                students[i] = students[students.length - 1];     //Last student in group array replaces the one we have to delete ( In case the last is the one that has to be deleted it will be eliminated in the next line )
                students = Arrays.copyOf(students, students.length - 1);
                return;
            }
        }
    }


    @Override
    public String toString() {
        Student[] tempStudents = Arrays.copyOf(students, students.length);

        Arrays.sort(tempStudents, (Student student1, Student student2) -> {             //Sorting structure that sorts according to last name, first name lexicographic order
            if (student1.getLastName().compareTo(student2.getLastName()) < 0) return -1;
            if (student1.getLastName().compareTo(student2.getLastName()) > 0) return 1;
            if (student1.getFirstName().compareTo(student2.getLastName()) < 0) return -1;
            if (student1.getFirstName().compareTo(student2.getFirstName()) > 0) return 1;
            return 0;
        });
        StringBuilder result = new StringBuilder(groupName + '\n');
        for (Student student : tempStudents) {
            result.append(student.toString());
            result.append('\n');
        }
        return new String(result);
    }

    class GroupOverflowException extends Exception {
        @Override
        public String getMessage() {
            return "Group cannot contain more than " + groupCapacity + " students ";
        }

        @Override
        public String toString() {
            return "Exception: " + getMessage();
        }
    }

    class AlreadyRegisteredStudentException extends Exception {
        @Override
        public String getMessage() {
            return "Such a student is already present in this group";
        }

        @Override
        public String toString() {
            return "Exception: " + getMessage();
        }
    }

}



