class student {
    private String name;
    private int age;
    private String branch;
    private int rollNo;
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
   public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getBranch() {
        return branch;
    
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


}
public class stdemo {
    public static void main(String args[]) {
        student student1 = createStudent("Dayashankar", 20, "Computer Science", 12345);
        student student2 = createStudent("Anita", 21, "Information Technology", 12346);
        student student3 = createStudent("Rahul", 19, "Mechanical Engineering", 12347);
        student student4 = createStudent("Priya", 22, "Electronics", 12348);
        student student5 = createStudent("Vikram", 20, "Civil Engineering", 12349);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
        printStudent(student4);
        printStudent(student5);
    }

    private static student createStudent(String name, int age, String branch, int rollNo) {
        student newStudent = new student();
        newStudent.setName(name);
        newStudent.setAge(age);
        newStudent.setBranch(branch);
        newStudent.setRollNo(rollNo);
        return newStudent;
    }

    private static void printStudent(student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Branch: " + student.getBranch());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println();
    }
}
