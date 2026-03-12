package netflix.feature5;

public class Node {

    int key;
    int data;
    Node prev;
    Node next;

    /**
     * Create NEW node
     * @param key
     * @param data
     */
    public Node(int key, int data){
        this.key = key;
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
