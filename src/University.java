public class University {
    String universityName;
    int numberOfStudents;

    public static void main(String[] args) {
        University FloridaState = new University();
        University UniversityOfMiami = new University();

        FloridaState.universityName = "Florida State";
        FloridaState.numberOfStudents = 80000;

        UniversityOfMiami.universityName = "University of Miami";
        UniversityOfMiami.numberOfStudents = 60000;

        System.out.println(FloridaState.universityName);
        System.out.println(FloridaState.numberOfStudents);

        System.out.println(UniversityOfMiami.universityName);
        System.out.println(UniversityOfMiami.numberOfStudents);
    }
}
