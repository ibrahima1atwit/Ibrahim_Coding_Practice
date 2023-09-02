// Linked List
public class LinkedListExampleOne{
  Node head;

  public void add(int data) {
    //LL is empty
    if(this.head == null){
      this.head = new Node(data);
  } else {
  // LL is not empty
      Node nodeToAdd = new Node(data);
      nodeToAdd.next = this.head;
      this.head = nodeToAdd;
    }
  }

  public static void main(String[] args) {
    LinkedListExampleOne myList = new LinkedListExampleOne();
    myList.add(19);
    myList.add(74);
    System.out.println(myList.head.data);
    System.out.println(myList.head.next.data);
  } 
}

//Node
class Node {
  int data;
  Node next;

  Node(int d) {this.data = d;}
  }
