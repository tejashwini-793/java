public class StudentRecord {
    public static void main(String[] args) {
        String[][] semesters = {
            {"Math", "85", "Physics", "78", "Chemistry", "90"},
            {"Biology", "88", "English", "92", "Computer", "95"}
        };

        for (int i = 0; i < semesters.length; i++) {
            System.out.println("Semester " + (i + 1));
            for (int j = 0; j < semesters[i].length; j += 2) {
                System.out.println("Course: " + semesters[i][j] + ", Marks: " + semesters[i][j + 1]);
            }
            System.out.println();
        }
    }
}