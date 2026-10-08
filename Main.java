class dayashankar { 
    String name; 
    int age; 
    8

    dayashankar(String n, int a) { 
        name = n; 
        age = a; 
    } 

    void Display() { 
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
    } 
} 

public class Main { 
    public static void main(String[] args) { 
        dayashankar d1 = new dayashankar("Dayashankar", 20); 
        System.out.println("Name: " + d1.name); 
        System.out.println("Age: " + d1.age);
        d1.Display(); 

    } 
}
