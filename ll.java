class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ll{
    public static void main(String[]args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        int position = 2;
        Node newNode = new Node(90);
        Node current = head;
        for(int i = 0; i < position - 1; i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        current = head;
        while(current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}