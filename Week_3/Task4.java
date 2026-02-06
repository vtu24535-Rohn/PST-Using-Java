import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

        if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }

        int nameCompare = s1.getFname().compareTo(s2.getFname());
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(s1.getId(), s2.getId());
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String fname = sc.next();
            double cgpa = sc.nextDouble();
            students.add(new Student(id, fname, cgpa));
        }

        Collections.sort(students, new StudentComparator())
        for (Student s : students) {
            System.out.println(s.getFname());
        }
    }
}
