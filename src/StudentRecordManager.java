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
}
