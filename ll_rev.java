class ll_rev{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String[]args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head
        Node previous = null;
        Node current = head;
        while(current != null){
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        head = previous;
        current = head;
        while(current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}