// StudentDetails.java
public class StudentDetails {

    // Define Student class
    static class Student {
        // Properties
        String name;
        int marks;

        // Method to display details
        void displayDetails() {
            System.out.println("Student Name: " + name);
            System.out.println("Marks: " + marks);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student();

        // Set properties
        student1.name = "Akash Mathew";
        student1.marks = 87;

        // Call the method to display details
        student1.displayDetails();
    }
}
