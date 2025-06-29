import java.util.Scanner;

class Student {
    private String name;
    private int marks;

    // Overloaded constructors
    public Student() {
        this("Unknown", 0);
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    // Display result
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        Student s = new Student(name, marks);
        s.display();
        sc.close();
    }
}