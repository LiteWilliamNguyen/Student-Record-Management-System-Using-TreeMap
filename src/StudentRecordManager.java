import java.util.Map;
import java.util.TreeMap;

public class StudentRecordManager {
    private TreeMap<Integer,Student> studentRecords = new TreeMap<>();

    //Add student into record
    public boolean addStudent(int id, String name, double gpa) {
        if(studentRecords.containsKey(id)){
            System.out.println("Error, Student ID existed");
            return false
        }
        studentRecords.put(id, new Student(id,name,gpa));
        return true;
    }

    //Delete a student from record
    public boolean deleteStudent(int id){
        if (studentRecords.remove(id) != null){
            return true;
        } else {
            System.out.println("Error, Student Id not found");
            return false;
        }
    }

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

    //Display all student record
    public void displayAllRecords() {
        for(Map.Entry<Interger,Student> entry : studentRecords.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    //Find Student with GPA
    public void displayStudentAboveGpa(double threshold) {
        studentRecords.values().stream().filter(student -> student.getGpa() > threshold).forEach(System.out::println);
    }
}
