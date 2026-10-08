class linked{
    int data;
    linked next;
}
public class LinkedList{
    public static void main(String []args){
        linked first = new linked();
        first.data = 10;
        //first.next = null;
        linked second = new linked();
        second.data = 20;
        second.next = null;
        first.next = second;

        linked third =  new linked();
        third.data = 30;
        second.next = third;

        linked fourth = new linked();
        fourth.data = 40;
        third.next = fourth;

        linked fifth = new linked();
        fifth.data = 50;
        fourth.next = fifth;


        System.out.println(first.data);
        System.out.println(first.next.data);
        System.out.println(first.next.next.data);
        System.out.println(first.next.next.next.data);
        System.out.println(first.next.next.next.next.data);
    }
}