import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class HighestMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }

        int highest = students.stream()
                              .mapToInt(s -> s.marks)
                              .max()
                              .orElse(Integer.MIN_VALUE);

        for (Student s : students) {
            if (s.marks == highest) {
                System.out.println(s.name + " " + s.marks);
            }
        }

        sc.close();
    }
}
