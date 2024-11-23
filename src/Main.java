public class Main {
    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();
        //Create a main method to test all functionalities.
        //Add at least 5 student records.
        //Display all records to ensure they are sorted.
        //Update the GPA of a student and show the updated list.
        //Delete a student record and display the remaining records.
        //Show all students with a GPA higher than 3.0.
        // Adding students
        manager.addStudent(101, "Alice", 3.5);
        manager.addStudent(102, "Bob", 2.8);
        manager.addStudent(103, "Charlie", 3.9);
        manager.addStudent(104, "Diana", 4.0);
        manager.addStudent(105, "Eve", 3.2);

        // Display all records
        System.out.println("All Records:");
        manager.displayAllRecords();

        // Update a student's GPA
        System.out.println("\nUpdating GPA for ID 102:");
        manager.updateStudentGpa(102, 3.1);
        manager.displayAllRecords();

        // Delete a student
        System.out.println("\nDeleting student ID 103:");
        manager.deleteStudent(103);
        manager.displayAllRecords();

        // Display students with GPA > 3.0
        System.out.println("\nStudents with GPA > 3.0:");
        manager.displayStudentsAboveGpa(3.0);
    }
}