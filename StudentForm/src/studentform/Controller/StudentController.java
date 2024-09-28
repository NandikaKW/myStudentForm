package studentform.Controller;

import Dto.Student.dto;
import studentform.Model.StudentModel;
import studentform.View.Student;

import java.sql.SQLException;

/**
 *
 * Controller class to manage Student data.
 */
public class StudentController {

    private final StudentModel studentModel;

    // Constructor
    public StudentController() {
        this.studentModel = new StudentModel();
    }

    // Retrieve a student by ID and return it as a dto object
    public dto getStudentByID(int studentID) {
        Student student = studentModel.getStudentByID(studentID);
        if (student != null) {
            // Use student.getStudentID() to retrieve the value, not setStudentID()
            return new dto(student.getStudentID(), student.getName(), student.getEmail(), student.getCourse());
        }
        return null;
    }


    // Update student details
    public static boolean updateStudent(dto studentDTO) {
        int studentID = studentDTO.getStudentID();
        String name = studentDTO.getName();
        String email = studentDTO.getEmail();
        String course = studentDTO.getCourse();
        return StudentModel.updateStudent(studentID, name, email, course);
    }
}
