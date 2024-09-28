package Dto.Student;

public class dto {
    private int studentID;
    private String name;
    private String email;
    private String course;

    // Constructor
    public dto(int studentID, String name, String email, String course) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getters and Setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
