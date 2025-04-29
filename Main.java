class Student {
    String name;
    int birthDay, birthMonth, birthYear;

    Student(String n, int d, int m, int y) {
        name = n;
        birthDay = d;
        birthMonth = m;
        birthYear = y;
    }

    void showAge(int currDay, int currMonth, int currYear) {
        int age = currYear - birthYear;
        if (currMonth < birthMonth || (currMonth == birthMonth && currDay < birthDay)) {
            age--;
        }
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Bob", 12, 5, 2006); 
        s.showAge(29, 4, 2025); 
    }
}
