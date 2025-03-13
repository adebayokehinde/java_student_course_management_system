from Validator import Validator;

public class Course {
    private String courseId;
    private String courseName;
    private String courseDescription;
    private String instructorId;

    public Course(String courseId, String courseName, String courseDescription, String instructorId) {
        this.setCourseId(courseId);
        this.setCourseName(courseName);
        this.setCourseDescription(courseDescription);
        this.setInstructorId(instructorId);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        if (!Validator.validateInput(courseId)) {
            throw new IllegalArgumentException("Course ID is invalid.");
        }
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (!Validator.validateInput(courseName)) {
            throw new IllegalArgumentException("Course name is invalid.");
        }
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        if (!Validator.validateInput(courseDescription)) {
            throw new IllegalArgumentException("Course description is invalid.");
        }
        this.courseDescription = courseDescription;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        if (!Validator.validateInput(instructorId)) {
            throw new IllegalArgumentException("Instructor ID is invalid.");
        }
        this.instructorId = instructorId;
    }
}
