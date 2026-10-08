import java.util.Collections;
import java.util.ArrayList;

public class std_marks2{
    public static void main(String[]args){
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(50);
        marks.add(20);
        marks.add(60);
        marks.add(10);
        marks.add(10);
        int maxMarks = Collections.max(marks);
        System.out.println("Maximum Marks: " + maxMarks);
        int minMarks = Collections.min(marks);
        System.out.println("Minimum Marks: " + minMarks);
        Collections.sort(marks);
        System.out.println("Sorted Marks: " + marks);
        Collections.reverse(marks);
        System.out.println("Reversed Marks: " + marks);
        int frequency = Collections.frequency(marks, 10);
        System.out.println("Frequency of 10: " + frequency);
    }
}