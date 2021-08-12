import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class SinglyLinkedList {
    public Node head;//the address of the first house

    //constructor
    public SinglyLinkedList() {
        this.head = null;
    }

    //methods
    public void addFront(int value) {//adds to the front
        Node newNode = new Node(value);
        if(this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(int value) {//adds to the back
        Node newNode = new Node(value);
        if(this.head == null) {
            this.head = newNode;
            } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove() {
        if(head == null) {
            System.out.println("Nothing to remove -_-");
        }  else if (head.next == null){
            System.out.println("There is only 1 item... it's removed now.");
            head = null;
        } else {
            Node runner = head;
            while(runner.next.next != null) {
                runner = runner.next;
        }
        runner.next = null;
        }
    }

    public void printValues() {
        if(head == null) {
            System.out.println("This is EMPTY!");
        } else{
            Node runner = head;
            while(runner.next != null) {
                System.out.println(runner.value + ">> ");
                runner = runner.next;
            }
            System.out.println(runner.value);
        }
    }

    public Node find(int value){
        Node runner = head;
        if(head == null) {
            System.out.println("This is EMPTY!");
        } else {
            while(runner.next != null) {//needed to stop at the end of the list
                if(runner.value == value){
                    System.out.println(runner.value + " found!!");
                    return runner;
                }
                runner = runner.next;
            }
            if(runner.value == value){
                System.out.println(runner.value + " found!!");
                return runner;
            }
        }
        System.out.println("It's not here!");
        return runner;
    }

    public void removeAt(int value){
        Node runner = head;
        if(head == null) {
            System.out.println("This is EMPTY -_-!");
        } else {
            while(runner.next != null) {//needed to stop at the end of the list
                if(runner.next.value == value){
                    System.out.println(runner.next.value + " deleted!!");
                    runner.next = runner.next.next;//connects 1 to 3 (123 -->13)
                } else {
                runner = runner.next;
                }
            }
            //if you want to remove a node then you would 
            //connect a runner to an index in a for loop then 
            //use the index to locate the position of a node (1st node 2nd node etc)
        }
        //try to reverse a linked list
    }
}
