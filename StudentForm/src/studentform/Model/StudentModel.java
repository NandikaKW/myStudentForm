package studentform.Model;

import studentform.DBConnection.DBConnection;
import studentform.View.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentModel {

    // Retrieve a student record based on the studentID from the database
    public Student getStudentByID(int studentID) {
        Student student = null;
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            String query = "SELECT * FROM students WHERE studentID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, studentID);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                student = new Student();
                student.setStudentID(rs.getInt("studentID"));
                student.setName(rs.getString("name"));
                student.setEmail(rs.getString("email"));
                student.setCourse(rs.getString("course"));
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    // Update student information based on the studentID
    public static boolean updateStudent(int studentID, String name, String email, String course) {
        boolean isUpdated = false;
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            String query = "UPDATE students SET name = ?, email = ?, course = ? WHERE studentID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, course);
            pstmt.setInt(4, studentID);

            int rowsAffected = pstmt.executeUpdate();
            pstmt.close();

            isUpdated = rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }
}
