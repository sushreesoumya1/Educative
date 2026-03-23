package netflix.codingproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class MergeKSortedLists {

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        LinkedListNode l1 = LinkedList.createLinkedList(new int[]{1,3,3,5});
        LinkedListNode l2 = LinkedList.createLinkedList(new int[]{2,4,5,10});
        LinkedListNode l3 = LinkedList.createLinkedList(new int[]{3,8,9});
        LinkedListNode l4 = LinkedList.createLinkedList(new int[]{2,7,11,13,14});

        LinkedList.display(l1);
        LinkedList.display(l2);
        LinkedList.display(l3);
        LinkedList.display(l4);
        List<LinkedListNode> lists = new ArrayList<>();
        lists.add(l1); lists.add(l2);
        lists.add(l3); lists.add(l4);
        LinkedListNode mergedListNode = mergeKLists(lists);
        LinkedList.display(mergedListNode);
    }

    private static LinkedListNode mergeKLists(List<LinkedListNode> lists) {
        List<LinkedListNode> mergedList = null;
        LinkedListNode mergedListNode = null;

        for(int i = 0; i< lists.size(); i++) {
            mergedListNode = mergeTwoLists(lists.get(i), mergedListNode);
        }
        return mergedListNode;
    }

    private static LinkedListNode mergeTwoLists(LinkedListNode l1, LinkedListNode mergedNode){
        LinkedListNode temp = mergedNode;
        LinkedListNode l2 = mergedNode;
        LinkedListNode result = null;
        if(mergedNode == null){
            return l1;
        }
        while(l1 != null && l2 != null) {
            if(result == null){
                if (l1.data <= l2.data) {
                    result = l1;
                    l1 = l1.next;
                } else {
                    result = l2;
                    l2 = l2.next;
                }
            }
            if (l1.data <= l2.data) {
                result.next = l1;
                l1 = l1.next;
            } else {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }

        if(l1 == null){
            while(l2 != null) {
                result.next = l2;
                l2 = l2.next;
                result = result.next;
            }
        } else {
            while(l1 != null) {
                result.next = l1;
                l1 = l1.next;
                result = result.next;
            }
        }
        return temp;
    }
}

class LinkedListNode {
    public int key;
    public int data;
    public LinkedListNode next;
    public LinkedListNode arbitraryPointer;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public LinkedListNode(int key, int data) {
        this.key = key;
        this.data = data;
        this.next = null;
    }

    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    public LinkedListNode(int data, LinkedListNode next, LinkedListNode arbitraryPointer) {
        this.data = data;
        this.next = next;
        this.arbitraryPointer = arbitraryPointer;
    }
}



class LinkedList {

    public static LinkedListNode insertAtHead(LinkedListNode head, int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        newNode.next = head;
        return newNode;
    }

    public static LinkedListNode insertAtTail(LinkedListNode head, int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (head == null) {
            return newNode;
        }
        LinkedListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static LinkedListNode insertAtTail(LinkedListNode head, LinkedListNode node) {
        if (head == null) {
            return node;
        }
        LinkedListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    public static LinkedListNode createLinkedList(ArrayList<Integer> lst) {
        LinkedListNode head = null;
        LinkedListNode tail = null;
        for (Integer x : lst) {
            LinkedListNode newNode = new LinkedListNode(x);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }

    public static LinkedListNode createLinkedList(int[] arr) {
        LinkedListNode head = null;
        LinkedListNode tail = null;
        for (int i = 0; i < arr.length; ++i) {
            LinkedListNode newNode = new LinkedListNode(arr[i]);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }

    public static LinkedListNode createRandomList(int length) {
        LinkedListNode listHead = null;
        Random generator = new Random();
        for (int i = 0; i < length; ++i) {
            listHead = insertAtHead(listHead, generator.nextInt(100));
        }
        return listHead;
    }

    public static ArrayList<Integer> toList(LinkedListNode head) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        LinkedListNode temp = head;
        while (temp != null) {
            lst.add(temp.data);
            temp = temp.next;
        }
        return lst;
    }

    public static void display(LinkedListNode head) {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.printf("%d", temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.printf(", ");
            }
        }
        System.out.println();
    }


    public static LinkedListNode mergeAlternating(LinkedListNode list1, LinkedListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        LinkedListNode head = list1;

        while (list1.next != null && list2 != null) {
            LinkedListNode temp = list2;
            list2 = list2.next;

            temp.next = list1.next;
            list1.next = temp;
            list1 = temp.next;
        }

        if (list1.next == null) {
            list1.next = list2;
        }

        return head;
    }

    static boolean isEqual(LinkedListNode list1, LinkedListNode list2) {
        if (list1 == list2) {
            return true;
        }

        while (list1 != null && list2 != null) {
            if (list1.data != list2.data) {
                return false;
            }

            list1 = list1.next;
            list2 = list2.next;
        }

        return (list1 == list2);
    }
}

