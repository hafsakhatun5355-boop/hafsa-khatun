class Student {
    String name;
    int roll;
    double marks;

    Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }
}

public class Q22_StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student("Rahim", 1, 85.5);
        Student s2 = new Student("Karim", 2, 78.0);
        Student s3 = new Student("Salma", 3, 92.5);
        s1.display();
        s2.display();
        s3.display();
    }
}
