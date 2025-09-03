class LL{
    Node head;
    public int size;

    LL(){
        this.size = 0;
    }

    class Node{
        String Data;
        Node next;//next node
        
        Node(String Data){
            this.Data=Data;
            this.next=null;
            size++;
        }
    }

    //addFirst
    public void addFirst(String Data){
        Node newNode = new Node(Data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }

    //addLast
        public void addLast(String Data){
        Node newNode = new Node(Data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deletelast(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast = head;
        Node last= head.next;
        while(last.next!=null){
            secondLast= secondLast.next;
            last=last.next; 
        }
        secondLast.next=null;
    }

    //print
    public void Print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.Data+" --> ");
            currNode=currNode.next;

        }
        System.out.println("NULL");
    }

    //size
    public int getSize(){
        return size;
    }

    //reverse using iterate
    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    //using recursion
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}

public class Linked_List1{
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        list.Print();
        list.deleteFirst();
        list.Print();
        list.deletelast();
        list.Print();
        System.out.println(list.getSize());
        list.addFirst("This");
        // list.reverseIterate();
        // list.Print();
        list.head = list.reverseRecursive(list.head);
        list.Print();

    }
}