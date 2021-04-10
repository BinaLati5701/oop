package ListAssignment;

import java.sql.SQLOutput;

public class SinglyLinkedList {

    public Node head;

    public SinglyLinkedList() {

        this.head = null;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            System.out.println("Added to the head- " + newNode.value);
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            System.out.println("Added to the end- " + newNode.value);
            runner.next = newNode;

        }

    }

    //return the value of the removed node
    public Integer remove(){
        if(head == null){
            System.out.println("Nothing in our list");
            return null;
        }
        else {
            Node runner = head;
            while(runner.next.next != null){
                runner = runner.next;


            }
            Node removed = runner.next;
            runner.next = null;
            return  removed.value;

        }

    }
    public void sort(){
        int temp;
        Node current = head, index = null;
        if(head==null){
            return;
        }
        else {
            while(current != null){
                index = current.next;
                while(index!= null){
                    if(current.value >index.value){
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }
                    index = index.next;
                }
                current  = current.next;

            }
        }

    }

    public void printValues(){
      Node temp = head;
      while(temp != null){
          System.out.println(temp.value + " ");
          temp = temp.next;
          System.out.println(temp);
      }



    }



}




