package netflix.feature5;


import java.util.HashMap;

/**
 * create new node, assign head and tail
 *
 *    put-->
 *    1- if node exist, move node to tail ELSE create new node and insert at tail.
 *    2- if moved node was head, then update head to the next node.
 *    3- if size is full and a new node needs to be added, remove head then update head to the next node.
 *    get-->
 *    1- if node exist, get node then move node to tail ELSE return null
 *    2- if moved node was head, then update head to the next node.
 */
public class MostRecentlyWatchedTitles {

    int capacity;
    DoublyLinkedList cacheList;
    HashMap<Integer, Node> cacheMap;

    public MostRecentlyWatchedTitles(int capacity){
        this.capacity = capacity;
        cacheList = new DoublyLinkedList();
        cacheMap = new HashMap<>(capacity);
    }
    public void put(int key, int data){
        System.out.println("put" + key);
        Node node = cacheMap.get(key);
        if(node != null){
            node.data = data;
            cacheList.moveNodeToTail(node);
        } else {
            node = new Node(key, data);
            cacheList.addNode(node, capacity, cacheMap);
            cacheMap.put(key, node);
        }

    }
    public Node get(int key){
        Node node = cacheMap.get(key);
        cacheList.moveNodeToTail(node);
        return node;
    }
    public int recent(){
        return cacheList.tail.key;
    }
    public int size(){
        return cacheList.size;

    }

    @Override
    public String toString() {
        return cacheList.toString() + "\ncacheMap: " + cacheMap;
    }
}
