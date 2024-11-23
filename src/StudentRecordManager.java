import java.util.Map;
import java.util.TreeMap;

//Create a Java project and add a new class named StudentRecordManager.
//Define a TreeMap<Integer, Student> to store student records. The key will be the student ID.
public class StudentRecordManager {
    private TreeMap<Integer,Student> studentRecords = new TreeMap<>();

    //Implement methods for adding, deleting, updating, and displaying records as described in the requirements.
    //Use appropriate TreeMap operations like put(), get(), remove(), and looping through entries to implement these functionalities.

    //Add student into record
    //Implement a method to add a new student record to the TreeMap. The method should take student ID, name, and GPA as parameters.
    //Ensure that the student ID is unique before adding the record.
    public boolean addStudent(int id, String name, double gpa) {
        if(studentRecords.containsKey(id)){
            System.out.println("Error, Student ID existed");
            return false;
        }
        studentRecords.put(id, new Student(id,name,gpa));
        return true;
    }
    //Implement a method to remove a student record from the TreeMap using the student ID.
    //Delete a student from record
    public boolean deleteStudent(int id){
        if (studentRecords.remove(id) != null){
            return true;
        } else {
            System.out.println("Error, Student Id not found");
            return false;
        }
    }
    //Implement a method to update the GPA of a student given their ID.
    //update student GPA
    public boolean updateStudentGpa(int id, double gpa){
        Student student = studentRecords.get(id);
        if (student != null){
            student.setGpa(gpa);
            return true;
        } else {
            System.out.println("Error, Student ID not found");
            return false;
        }
    }
    //Implement a method to display all student records sorted by student ID.
    //Display all student record
    public void displayAllRecords() {
        for(Map.Entry<Integer,Student> entry : studentRecords.entrySet()){
            System.out.println(entry.getValue());
        }
    }
    //Implement a method to display all students whose GPA is above a specified value.
    //Find Student with GPA
    public void displayStudentsAboveGpa(double threshold) {
        studentRecords.values().stream().filter(student -> student.getGpa() > threshold).forEach(System.out::println);
    }
}
