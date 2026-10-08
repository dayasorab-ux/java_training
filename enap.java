class student {
    private String name;
    private int age;
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

}
public class enap {
    public static void main(String args[]) {
        student obj = new student();
        obj.setName("dayashankar");
        obj.setAge(20);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
