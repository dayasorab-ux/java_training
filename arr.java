public class arr{
    public static void main(String[]args){
        //int marks[] = new int[50]; 
        int marks[] = {80,90,70,85,95};
        for(int i = 0;i<marks.length;i++){
            System.out.println("before replacement "+marks[i]);
        }
        System.out.println("======================");
        marks[2] = 100;
        for(int i = 0;i<marks.length;i++){
        System.out.println("Afther replacement "+marks[i]);
        }
       //System.out.println(marks[5]);
       //System.out.println(marks.length-1);
    }   
}