package FUSE;

class NListNode {
    int value;
    NListNode next;
    NListNode prev;

    NListNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public int getValue() {
        return value;
    }

    public NListNode getNext() {
        return next;
    }

    public NListNode getPrev() {
        return prev;
    }
}

public class NLinkedList {
    private NListNode head;
    private NListNode tail;

    public NLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int value) {
        NListNode newNode = new NListNode(value);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            NListNode d = tail;
            tail.next = newNode;
            tail = tail.next;
            tail.prev = d;
        }
    }

    public boolean remove(int value) {
        if (head == null) return false;

        if (head.value == value) {
            head = head.next;
            if (head != null && head.prev != null) {
                head.prev = null;
            }
            return true;
        } else if (tail.value == value) {
            tail = tail.prev;
            if (tail != null && tail.next != null) {
                tail.next = null;
            }
            return true;
        }

        NListNode cur = head;
        while (cur.next != null) {
            if (cur.next.value == value) {
                NListNode d = cur.next.prev;
                cur.next = cur.next.next;
                cur.next.prev = d;
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    public NListNode get(int value) {
        if (head == null) return null;

        if (head.value == value) {
            return head;
        } else if (tail.value == value) {
            return tail;
        }

        NListNode cur = head;
        while (cur.next != null) {
            if (cur.next.value == value) {
                return cur.next;
            }
            cur = cur.next;
        }
        return null;
    }

    public NListNode getHead() {
        return head;
    }
}