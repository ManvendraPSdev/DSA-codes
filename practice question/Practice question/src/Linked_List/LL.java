package Linked_List;

public class LL {

    Node head;
    Node tail;
// Before Creating the Linked List we create the Node First
    class Node{
        int data;
        Node next;

        // Creating the Constructor 
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // If we have to add Node on the first position 

    public void First_Node(int data){

        //  To do so we have to Check is there any Linked List Exist or not 
        // If head is null means no Linked List is Exist, So in that case we Just create a node and make it as Head

        Node newNode = new Node(data);  // Create the new Node
        if(head == null){
            head = newNode;   // Make that Node as Head
            return ;
        }

        // If the head Exist then there must be a linked List 

        // We just linked the new node with the head of the linked list and after linking new node with head we metion our new node as head

        newNode.next = head;  // Link the newNode with head
        head = newNode ; // Now our New head is newNode 
    }


    // If we have to add Node on the last position 

    public void Last_Node(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;   // Create the new Node name currNode pointing to the head
        while(currNode.next != null){
            currNode = currNode.next;    // Updating the value of pointer (next) of the currNode untill it become Null
        }

        // When it equal to null then our 
        currNode.next = newNode;   // we know that newNode.next = null 
    }


    // If we have to print our Linked List

    public void printList(){

        if(head == null){
            System.out.println("Linked List Is Empty!");
            return;
        }

        Node currNode = head;   
        while(currNode != null){

            System.out.print(currNode.data+" ->");

            currNode = currNode.next;    
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL list = new LL(); // Creating the object of the class LL 
        list.First_Node(2);
        list.First_Node(4);
        list.First_Node(6);
        list.First_Node(8);
        list.printList();

        list.Last_Node(11);  // All these value are gonna add in the last of the list 
        list.Last_Node(12);
        list.Last_Node(13);
        list.Last_Node(14);
        list.printList();

    }
}
