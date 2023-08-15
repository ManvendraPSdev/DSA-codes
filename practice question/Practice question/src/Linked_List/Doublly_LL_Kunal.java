package Linked_List;

public class Doublly_LL_Kunal {
    Node head ;
    Node tail ;

    class Node{
        int value ;
        //Since in Doubly Linked List we can move in forward also and BackWard also Therefore we have next node and prev node  
        Node next ;
        Node prev ;

        public Node(int value){
            this.value = value ;
            this.next = null ;
            this.prev = null ;
        }
    }

//  Inserting the Node in the First Position  
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null ;

        // There is one Corner Case that if you are inserting any node for the very First time ,  head maybe null  
        //hence this line (head.prev = node ;)  will give Error therefore if (head != null) then only perform head.prev = node ;
        if(head != null ){
            head.prev = node ;
        }

        head = node ;
    }

    // Inseritng the Node in the position
    public void insertLast(int value){
        Node temp2 = new Node(value);
        tail.next = temp2 ;
        temp2.prev=tail ;
        temp2.next = null ;
        if(head == null){
            tail = temp2;
            head = temp2 ;
            return ;
        }
    }

    // Printing 

    public void display(){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next ; 
        }
        System.out.println("END");
    }
}
