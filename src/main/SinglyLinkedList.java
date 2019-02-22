package main;

public class SinglyLinkedList {

    private Node head=null;
    private int size=0;
    // method to add a new node at the head
    public void insert(int value){
        head=new Node(value, this.head);
        size++;
    }

    public void insert(int value, Node node){
        node.next=new Node(value,node.next);
        size++;
    }


    @Override
    public String toString(){
        StringBuilder result=new StringBuilder();

        result.append("[");
        Node temp=this.head;
        while(temp!=null) {
        result.append(temp.data);
        if(temp.next!=null)
 {
     result.append("==>");
 }
    temp = temp.next;
}
        result.append("]");

        return result.toString();
    }

    public static void main(String[] args) {

        SinglyLinkedList linkedList=new SinglyLinkedList();
        for (int i = 0; i< 5; i++) {
            linkedList.insert(i+1);
        }


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
            this.data=data;
            this.next=null;
        }

    }
}
