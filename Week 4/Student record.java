public class StudentRecord {
    String name;
    int rollNo;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        StudentRecord s = new StudentRecord();

        s.name = "Rahul";
        s.rollNo = 101;
        s.marks = 87.5;

        s.display();
    }
}
