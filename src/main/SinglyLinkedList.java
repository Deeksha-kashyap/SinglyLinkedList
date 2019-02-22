package main;

public class SinglyLinkedList {

    private Node head=null;
    private int size=0;

    @Override
    public String toString(){
        StringBuilder result=new StringBuilder();

        result.append("[");
Node temp=this.head;
while(temp!=null) {
 reult.append(temp.data);
    temp = temp.next;
}
        result.append("]");
    }

    public static void main(String[] args) {

        SinglyLinkedList linkedlist=new SinglyLinkedList();
        System.out.println(linkedlist);
    }

    private static class Node{
     private int data;
     private Node next;

        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(int data){
            this.date=date;
            this.next=null;
        }

    }
}
