import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentRecordManagerTest {
    StudentRecordManager manager = new StudentRecordManager();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAddStudent(){
        assertTrue(manager.addStudent(101,"Erica",3.5)); //should add
        assertFalse(manager.addStudent(101,"Bob",2.8));//False to Duplicate ID
    }

    @Test
    void testDeleteStudent(){
        manager.addStudent(201,"Justina",3.4);
        assertTrue(manager.deleteStudent(201));
        assertFalse(manager.deleteStudent(202));// no student assign to 202
    }

    @Test
    void testDisplayStudentsAboveGpa(){
        manager.addStudent(201,"Justice",3.6);
        manager.addStudent(202,"Bobby",2.8);

        manager.displayStudentsAboveGpa(3.0);
    }

    @Test
    void testEdgeCases(){
        StudentRecordManager manager = new StudentRecordManager();

        //Edge Case Add student at 0.0 GPA value
        assertTrue(manager.addStudent(101,"Alice",0.0));

    }

    @Test
    void testDeleteNonExistentStudent() {
        StudentRecordManager manager = new StudentRecordManager();
        manager.addStudent(101, "Alice", 3.5);

        assertFalse(manager.deleteStudent(999)); // Non-existent ID
        assertFalse(manager.deleteStudent(102)); // Another non-existent ID
    }

    @Test
    void testUpdateNonExistentStudentGpa() {
        StudentRecordManager manager = new StudentRecordManager();
        manager.addStudent(101, "Alice", 3.5);

        assertFalse(manager.updateStudentGpa(999, 3.9)); // Non-existent ID
        assertFalse(manager.updateStudentGpa(102, 4.0)); // Another non-existent ID
    }
}