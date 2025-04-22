 package Detail;
 public class Student {

    // Define a Student class to hold student data
    static class StudentDetails {
        String name;
        int age;
        String rollNo;
        String course;

        // Constructor to initialize student details
        public StudentDetails(String name, int age, String rollNo, String course) {
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
            this.course = course;
        }

        // Method to display student details
        public void displayDetails() {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        // Create a new student object with details
        StudentDetails student = new StudentDetails("John Doe", 20, "S12345", "Computer Science");

        // Display the student details
        student.displayDetails();
    }
}
