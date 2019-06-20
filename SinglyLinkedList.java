public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }   
    
    public void remove(){
        while(head.next != null) {
            if (head.next == null){
                head = null;
            }
        }
    }

    public void printValues(){
        if (head.next != null){}
        System.out.println(head.val);
    }

}