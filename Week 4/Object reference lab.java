public class ObjectReferenceLab {
    String name;

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ObjectReferenceLab obj1 = new ObjectReferenceLab();
        ObjectReferenceLab obj2 = obj1;

        obj1.name = "Java";

        System.out.println("Using obj1:");
        obj1.display();

        System.out.println("Using obj2:");
        obj2.display();

        System.out.println("Same object: " + (obj1 == obj2));
    }
}
