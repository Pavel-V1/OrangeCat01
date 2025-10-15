package FUSE;

class ListNode {
    int value;
    ListNode next;
    ListNode prev;

    ListNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public int getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public ListNode getPrev() {
        return prev;
    }
}

public class MLinkedList {
    private ListNode head;
    private ListNode tail;

    public MLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            ListNode d = tail; // эти 2 строки я
            tail.next = newNode;
            tail = tail.next;
            tail.prev = d; // добавил благодаря тестам
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

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.value == value) {
                ListNode d = cur.next.prev;
                cur.next = cur.next.next;
                cur.next.prev = d;
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    public ListNode get(int value) {
        if (head == null) return null;

        if (head.value == value) {
            return head;
        } else if (tail.value == value) {
            return tail;
        }

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.value == value) {
                return cur.next;
            }
            cur = cur.next;
        }
        return null;
    }

    public ListNode getHead() {
        return head;
    }

    public void printList() {
        ListNode cur = head;
        while (cur.next != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.print(cur.value);
        System.out.println();
    }

    public StringBuilder printList(int x) {
        StringBuilder str = new StringBuilder();
        ListNode cur = head;
        while (cur.next != null) {
            str.append(cur.value).append(" ");
            cur = cur.next;
        }
        str.append(cur.value);
        return str;
    }

    public int countMaxElements() {
        if (head == null) return 0;

        int maxValue = head.value;
        int maxCount = 1;
        ListNode cur = head.next;

        while (cur != null) {
            if (cur.value > maxValue) {
                maxValue = cur.value;
                maxCount = 1;
            } else if (cur.value == maxValue) {
                maxCount++;
            }
            cur = cur.next;
        }
        return maxCount;
    }
}