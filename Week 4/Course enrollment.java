public class CourseEnrollment {
    String studentName;
    String courseName;
    int duration;

    void display() {
        System.out.println("Student: " + studentName);
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
    }

    public static void main(String[] args) {
        CourseEnrollment c = new CourseEnrollment();

        c.studentName = "Rahul";
        c.courseName = "Java Programming";
        c.duration = 6;

        c.display();
    }
}
