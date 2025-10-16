package FUSE;

class NListNode {
    MLinkedList lnode;
    NListNode next;
    NListNode prev;

    NListNode(MLinkedList lnode) {
        this.lnode = lnode;
        this.next = null;
        this.prev = null;
    }

    public MLinkedList getNode() {
        return lnode;
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

    public void add(MLinkedList lnode) {
        NListNode newNode = new NListNode(lnode);
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

    public boolean remove(MLinkedList lnode) {
        if (head == null) return false;

        if (head.lnode == lnode) {
            head = head.next;
            if (head != null && head.prev != null) {
                head.prev = null;
            }
            return true;
        } else if (tail.lnode == lnode) {
            tail = tail.prev;
            if (tail != null && tail.next != null) {
                tail.next = null;
            }
            return true;
        }

        NListNode cur = head;
        while (cur.next != null) {
            if (cur.next.lnode == lnode) {
                NListNode d = cur.next.prev;
                cur.next = cur.next.next;
                cur.next.prev = d;
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    public NListNode get(MLinkedList lnode) {
        if (head == null) return null;

        if (head.lnode == lnode) {
            return head;
        } else if (tail.lnode == lnode) {
            return tail;
        }

        NListNode cur = head;
        while (cur.next != null) {
            if (cur.next.lnode == lnode) {
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