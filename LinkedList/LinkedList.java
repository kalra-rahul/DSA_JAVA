package LinkedList;



public class LinkedList {

    int size;

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = tail = newNode;
           size++;
           return;
        }
        newNode.next = head;
        head = newNode;
        size++;
        return;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = tail = newNode;
           size++;
           return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
        return;
    }

    public void print(){
        //System.out.println(head);
        Node temp  = head;
        while(temp !=null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data){
        Node newNode = new Node(data);
        Node temp  = head;

        int pointer = 0;
        while(pointer < index-1){
            temp = temp.next ;
            pointer++;
        }
        // i = idx-1; temp=prev
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int size(){
        int size = 0;
        Node temp  = head;

        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void RemoveFirst(){
        head = head.next;
        size--;
    }

    public void RemoveLast(){
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        // while (prev.next != tail) { // Stop at second last node
        //     prev = prev.next;
        // }
        prev.next = null;
        tail = prev;
        size--;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while (temp.next != null) { 
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        
        return -1;
    }

    public int recursiceSearch(int key, int index, Node temp){
        if(temp == null){
            temp = head;
        }
        if(temp.next == null) {
            if(temp.data == key) return index;
            return -1;
        }
        if(temp.data == key) return index;
        return recursiceSearch(key, index+1, temp.next);
    }

    public void reverselist(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        for (int i = 0; i < size; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        System.out.println("Reverse data: " + prev.data);
        head = prev; 
    }



    public static void main(String args[]){
        LinkedList l1 = new LinkedList();
        l1.print();
        l1.addFirst(2);
        l1.print();
        l1.addFirst(1);
        l1.print();
        l1.addLast(4);
        l1.print();
        l1.addLast(5);
        l1.print();
        l1.add(2,3);
        l1.print();
        System.out.println("Size Linklist: " + l1.size);
        // l1.RemoveFirst();
        // l1.print();
        // l1.RemoveLast();
        // l1.print();
        // System.out.println("itrSearch -:" + l1.itrSearch(1));
        // System.out.println("RecSearch -:" + l1.recursiceSearch(5,0,null));
        l1.reverselist();
        l1.print();
    }
    
}
