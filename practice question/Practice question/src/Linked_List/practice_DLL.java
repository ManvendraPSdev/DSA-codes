package Linked_List;

public class practice_DLL {
    Node head ;
    Node tail ;
    class Node{
        int value ;
        Node next ;
        Node prev ;

        public Node (int value){   // Constructor
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    // Adding the node on the First Position
    public void AddFirst(int value){
        Node node = new Node(value);
        node.next = head ;
        node.prev = null ;
        if(head != null){
            head.prev = node;
        }
        head= node;
    }

    // Printing 
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        practice_DLL LL = new  practice_DLL();
        LL.AddFirst(11);
        LL.AddFirst(12);
        LL.AddFirst(13);
        LL.AddFirst(14);
        LL.AddFirst(15);
        LL.display();
    }
}
