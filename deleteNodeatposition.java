// Define the ListNode class
class ListNode {
    int data;
    ListNode next;

    // Constructor
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the LinkedList class
class LinkedList {
    ListNode head;

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to add a node to the end of the list
    public void append(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print the linked list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("None");
    }

    public void deletenodeatPosition(){
        if(position ==1){
            head=head.next;
        }else{
            ListNode previous = head;
            int count =1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }

        }
        ListNode current = previous.next;
        previous.next= current.next;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(1);
        l1.append(2);
        l1.append(3);

        l1.printList();  // Output: 1 --> 2 --> 3 --> None
        deletenodeatPosition(3);
    }
}
