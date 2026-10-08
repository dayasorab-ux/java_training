class Student {
    private final int rollNumber;
    private final String name;
    private final String email;

    Student(int rollNumber, String name, String email) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.email = email;
    }

    void display() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    int add(int first, int second) {
        return first + second;
    }
    int subtract(int first, int second) {
        return first - second;
    }
    int multiply(int first, int second) {
        return first * second;
    }
    int divide(int first, int second) {
        return first / second;
    }
    int remainder(int first, int second) {
        return first % second;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        Student student = new Student(1, "dayashankar", "dayasorab@gmail.com");
        student.display();
        System.out.println(student.add(5, 10));
        System.out.println(student.subtract(10, 5));
        System.out.println(student.multiply(5, 2));
        System.out.println(student.divide(10, 2));
        System.out.println(student.remainder(10, 3));
    }
}