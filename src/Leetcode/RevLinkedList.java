package Leetcode;

import java.util.ArrayList;

/*
I learnt That whenever we make something using new Node it allocates some space in the memory ,
while this allocation becomes redundant if we assign the value of  new Node to head as we can directly do
Node newNode = head; here newNode will store location to head and any change that we make to newNode will directly affect
head node as well , while Node newNode = new Node(); is useful for creation or allocation of new Nodes.
 */
public class RevLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printNode(head);
        System.out.println("*****************************");
        printNode(reverseList(head));
    }
    private static Node reverseList(Node head) {
        Node prevNode = null;
        while (head!=null){
            Node nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        return prevNode;
    }
    private static Node revLinkedListPart2(Node head , int left , int right){

        return  null;
    }
    private static void printNode(Node head){
        Node current = head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    private static boolean palindromeList(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }
        Node revList = reverseList(head);
        for (int i = 0; i < list.size(); i++) {
            if (revList.data != list.get(i)) {
                return false;
            }
            revList = revList.next;
        }
        return true;
    }

}
class Node{
    int data;
    Node next;
    public Node(){}
    public Node(int data){
        this.data = data;
    }
}
