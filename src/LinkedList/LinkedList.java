package LinkedList;
public class LinkedList {
    public Node head ;
    public Node tail ;
    public int size = 0 ;

    public void addNodeAtLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(size==0) {
            head = newNode;
            tail = newNode;
            size++;
        }else{
            System.out.println(head.next);
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}