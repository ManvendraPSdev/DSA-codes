package Linked_List;

public class practice_LL {
    Node head;
    Node tail;
    int size;
    public practice_LL(){ // Constructor 
        this.size = 0;
    }
    class Node{
        int data;
        Node next;
        public Node(int data){ // Constructor
            this.data = data ;
            this.next = null ;
        }
    }

    // Inserting the node in the 1st position
    public void insertFirst(int data){
        // Creating the node
        Node node = new Node(data);

        // if(head == null){
        //     head = node ;
        //     return ;
        // }
        // node.next = head;
        // head = node;
// You can  use any 
        node.next = head;
        head = node;
        if(tail == null){
            // If tail is null it means we have the empty linked list
            tail = head ;
        }
        size+=1 ;
    }

    // Inserting in the last

    public void insertLast(int data){
        // When tail is null
        if(tail == null){
            insertFirst(data);
            return ;
        }
        // When tail is not null
        Node node2 = new Node(data);
        tail.next = node2;
        tail = node2;
        size+= 1;
    }

    // Deleting the first Element

    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size --;
        return val;
    }

    // Printing the node 
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;  // After printing temp would be Storing the value of Next node and for that we write temp = temp.next
                              // Because next is the pointer which is Storing the address of Next Node  
        }
    }
    public static void main(String[] args) {
        practice_LL list = new practice_LL();
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertFirst(15);
        
        list.insertLast(16);

        list.display();

        System.out.println(list.deleteFirst());
        list.display();

    }
}
