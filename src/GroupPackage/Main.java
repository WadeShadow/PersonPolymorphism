package GroupPackage;

public class Main {
    public static void main(String[] args) {

        /*=========================TASK3==========================*/

        Student s0, s1, s2, s3, s4, s5, s6, s7, s8, s9;
        s0 = new Student("Alejandra", "Cummings", 158, 61, "female", "bachelor", "actor");
        s1 = new Student("Candace", "Beattie", 175, 63, "female", "bachelor", "interior designer");
        s2 = new Student("Dusty", "Kevins", 182, 22, "male", "bachelor", "industrial technician");
        s3 = new Student("Ali", "Hutson", 186, 54, "male", "bachelor", "domestic personnel");
        s4 = new Student("Rodney", "Bloxham", 189, 35, "female", "bachelor", "toxicologist");
        s5 = new Student("Robert", "Mendez", 168, 29, "male", "bachelor", "painter and decorator");
        s6 = new Student("Heather", "Hill", 165, 30, "female", "bachelor", "photographer");
        s7 = new Student("Felicia", "Bulloch", 161, 32, "female", "bachelor", "tailor");
        s8 = new Student("James", "Jackson", 167, 47, "male", "bachelor", "spiritist");
        s9 = new Student("Clara", "Shaffer", 161, 66, "female", "bachelor", "loan officer");


        Group group = new Group("Strangers");
        Student[] students = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9};
        try {
            for (Student student : students) {
                group.add(student);
            }
        } catch (Group.GroupOverflowException | Group.AlreadyRegisteredStudentException ex) {
            System.out.println(ex);
        }

        System.out.println(group);

        /*try {
            group.add(s1);
        } catch (Group.GroupOverflowException | Group.AlreadyRegisteredStudentException ex) {
            System.out.println(ex);
        }*/                     //This action will produce an AlreadyRegistered exception

        try {
            Student s10 = new Student("Igor", "Vasilovich", 175, 63, "female", "bachelor", "interior designer");
            group.add(s10);
        } catch (Group.GroupOverflowException | Group.AlreadyRegisteredStudentException ex) {
            System.out.println(ex);
        }                       //This one produces GroupOverflow exception


        /*===================================TASK4============================================*/

        group.sortBy("height");
        MilitaryCommittee mCommittee = group;
       for( Student student:mCommittee.recruit())
           System.out.println(student);
       group.manuallAdd();



    }
}
