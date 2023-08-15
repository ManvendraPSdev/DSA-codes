package Linked_List;

public class Singly_LL_Kunal {
    Node head ;
    Node tail ;
    int size ;
    public Singly_LL_Kunal(){
        this.size = 0;
    }

    class Node{
        int value ;
        Node next ; 
        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }




    // Inserting the node in the First position
    public void insertFirst(int value){
        Node node = new Node(value);     // Creat the node 
        node.next = head;               // Pointer name next pointing to the head
        head = node;                   // Setting head equal to node 

        if(tail == null){
            // If tail is null means the First item is being Added
            tail = head;
        }
        size +=1;
    }




    // Inserting the node in the Last Position 
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return ;
        }
        Node node2 = new Node(value);
        tail.next = node2;
        tail = node2;
        size += 1;
    }




    // Inserting the node in the middle of the Linked List
    public void inser(int value , int index){
        if(index == 0){
            insertFirst(value);
            return ;
        }
        if(index == size){
            insertLast(value);
            return ;
        }
    }




    //Deleting the first Element
    public int deleteFirst(){
        // For deleting the first node we want to store the value in a variable of the first node Which is head  
        // And When the value of the head Store in the variable Then 2nd Node become the head of the Linked list 
        // So due to this reason head = head.next (means head pointing to the next node) Now next Node become head

        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null; 
        }
        size -- ;
        return val ;
    }




    //  Deleting the Last Element 
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2); // Now secondLast Node will point to the Second Last Element 
        int val2 = tail.value;
        tail  = secondLast;
        tail.next = null;
        size --;
        return val2;
    }
    // The code you provided is implementing a method called `deleteLast()` in the linked list. This method is responsible for deleting the last element from the linked list. Let's go through the code step-by-step to understand its functionality:

// 1. The method begins with an `if` condition `if(size <= 1)`, which checks if the linked list has one or zero elements. If the size of the linked list is one or zero, it means there is either one node or no node in the list.

// 2. If the above condition is true (i.e., size <= 1), the method calls the `deleteFirst()` method to delete the first node of the linked list. The `deleteFirst()` method is not provided in the code snippet you shared, but it should be a method that removes the first node and updates the `head` and `tail` pointers accordingly.

// 3. If the size of the linked list is greater than one (i.e., size > 1), the method proceeds to delete the last element.

// 4. To delete the last element, the method first needs to find the second-to-last node. The line `Node secondLast = get(size - 2);` is used to retrieve the second-to-last node in the linked list. The `get()` method is used to obtain the node at the specified index.

// 5. The method then stores the value of the last node (i.e., `tail.value`) in the variable `val2`. This value will be returned later to the caller, allowing them to access the value of the last element before it was deleted.

// 6. Next, the `tail` pointer is updated to point to the second-to-last node. This effectively removes the last node from the linked list.

// 7. The `tail.next` pointer is set to `null` to mark the new last node as the end of the list.

// 8. The `size` variable is decremented to reflect the updated size of the linked list after the deletion.

// 9. Finally, the method returns `val2`, which contains the value of the last element that was deleted.

// The `get(int index)` method is used to retrieve the node at the specified index. It starts from the `head` node and iterates through the linked list by following the `next` pointers until it reaches the desired index. The method then returns the reference to the node at that index.





    public Node get(int index){   // When you put any no in place of index it will return the refrence pointer of that node 
        Node node3 = head;
        for(int i=1 ; i<index ; i++){
            node3 = node3.next;
        }
        return node3;
     }


// Deleting the Middle Element 
public int delprevious(int index){      // While running we have to give the index
    if(index == 0 ){
        size -- ;
        return deleteFirst() ; 
    }


























    

    if(size == size-1){
        size --;
        return deleteLast();
    }

    Node previous = get(index -1);
    int val4 = previous.next.value ;
    previous.next = previous.next.next;
    return val4;
}




// Giving the value return the node
// Here in this Condition we give the value of the node and expecting the Node itself
public Node findNode(int value){
    Node temp = head ;
    while(temp != null){
        if(temp.value == value){
            return temp ;
        }
        
        temp = temp.next;
    }
    return  null ;
}




    // Printing 
    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
