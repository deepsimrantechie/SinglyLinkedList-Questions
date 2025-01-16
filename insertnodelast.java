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

    // Method to calculate the length of the linked list
    public int lengthLinkedList() {
        int count = 0;
        ListNode current = head; // Initialize current with head
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
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

    Public ListNode Insertnodeatlast(){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head=newNode;
            return;

        }
        ListNode current= head;
        while(nul != current.next){
            current=current.next;
        }
        current.next=newNode;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(1);
        l1.append(2);
        l1.append(3);

        l1.printList(); // Output: 1 --> 2 --> 3 --> None
        System.out.println("The length of the linked list: " + l1.lengthLinkedList()); // Output: The length of the linked list: 3

        // Adding a new node to the end of the list
        l1.append(4);
        l1.printList(); // Output: 1 --> 2 --> 3 --> 4 --> None
        System.out.println("The length of the linked list: " + l1.lengthLinkedList()); // Output: The length of the linked list: 4

        Insertnodeatlast(10);
    }
}














//explationation

{/**We use two pointers (first and second) to solve this problem efficiently in one pass.

Step-by-Step Explanation
Add a Dummy Node:

Add a dummy node at the beginning of the list to handle edge cases (e.g., removing the head node).
New list: 0 -> 1 -> 2 -> 3 -> 4 -> 5
(0 is the dummy node, and 1 is the actual head of the list.)
Initialize Pointers:

Both first and second pointers start at the dummy node (0).
Move the first Pointer n + 1 Steps Ahead:

Move the first pointer 3 steps (n + 1 = 2 + 1 = 3):
Step 1: first points to 1
Step 2: first points to 2
Step 3: first points to 3
Move Both Pointers Until first Reaches the End:

Now, move both pointers one step at a time until first reaches the end of the list:
Move 1: first points to 4, second points to 1
Move 2: first points to 5, second points to 2
Move 3: first points to null (end of the list), second points to 3
Skip the Target Node:

At this point, second.next points to the node we want to remove (4).
Update second.next to second.next.next to skip node 4:
second.next = second.next.next
Return the Updated List:

The updated list is: 1 -> 2 -> 3 -> 5. */}