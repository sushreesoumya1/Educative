package netflix.feature5;

import java.util.HashMap;

public class DoublyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void moveNodeToTail(Node node){
        if(node != null && tail.key != node.key) {
            if (node.prev != null) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                node.next = null;
                this.tail.next = node;
                node.prev = this.tail;
                this.tail = node;
            } else {
                moveHeadToTail();
            }
        }
    }

    public void moveHeadToNext(Node head){
        if(head != null && head.next != null){
            this.head = head.next;
        }
    }

    public void moveHeadToTail(){
        Node temp = head;
        tail.next = temp;
        temp.prev = tail;
        temp.next = null;
        tail = temp;
        head = head.next;
    }
    public void addNode(Node node, int capacity, HashMap<Integer, Node> cacheMap){
        if(size >= capacity) {
            cacheMap.remove(head.key);
            moveHeadToNext(head);
            size--;
        }
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            node.next = null;
            this.tail = node;
        }
        this.size++;

    }

    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node temp = head;
        while(temp != null){
            sb.append(temp.key).append("-").append(temp.data).append("  ");
            temp = temp.next;
        }
        return sb.toString();
    }
}
