package FUSE;

class NListNode {
    ListNode node;
    NListNode next;
    NListNode prev;

    NListNode(ListNode node) {
        this.node = node;
        this.next = null;
        this.prev = null;
    }

    public ListNode getNode() {
        return node;
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

    public void add(ListNode node) {
        NListNode newNode = new NListNode(node);
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

    public boolean remove(ListNode node) {
        if (head == null) return false;

        if (head.node == node) {
            head = head.next;
            if (head != null && head.prev != null) {
                head.prev = null;
            }
            return true;
        } else if (tail.node == node) {
            tail = tail.prev;
            if (tail != null && tail.next != null) {
                tail.next = null;
            }
            return true;
        }

        NListNode cur = head;
        while (cur.next != null) {
            if (cur.next.node == node) {
                NListNode d = cur.next.prev;
                cur.next = cur.next.next;
                cur.next.prev = d;
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    public NListNode get(ListNode node) {
        if (head == null) return null;

        if (head.node == node) {
            return head;
        } else if (tail.node == node) {
            return tail;
        }

        NListNode cur = head;
        while (cur.next != null) {
            if (cur.next.node == node) {
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