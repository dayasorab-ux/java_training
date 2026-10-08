class ll_cyclic{
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
        head.next.next.next.next = new Node(50);
        //head.next.next.next.next.next = head.next.next;
        Node current = head;
        while(current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        Node slow = head;
        Node fast = head;
        boolean isCyclic = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCyclic = true;
                break;
            }
        }if(!isCyclic){
            System.out.println("cyclic.");   
        }else{
            System.out.println("not cyclic.");
        }
    }
}
