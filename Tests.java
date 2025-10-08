public class Tests {
    public void testMLinkedList() {
        MLinkedList mlist = new MLinkedList();
        mlist.remove(1);
        mlist.remove(0);
        System.out.println("t1");
        mlist.add(0);
        mlist.remove(0);
        System.out.println("t2");
        mlist.add(00000000000);
        mlist.add(01);
        mlist.add(2147483647);
        mlist.remove(0000);
        System.out.println("t3");
        mlist.remove(2147483647);
        System.out.println("t4");
        for (int i = 0; i < 100; i++) {
            mlist.add(7);
            mlist.add(5);
        }
        System.out.println("t5");
        mlist.remove(5);
        System.out.println("1 nice");
        System.out.println(mlist.printList(0));
        mlist.printList();
        mlist.printList(0);
        System.out.println("2 nice");
        System.out.println(mlist.countMaxElements());
        System.out.println(mlist.getHead());
        System.out.println("3 nice");
        for (int i = 0; i < 100; i++) {
            System.out.println(mlist.remove(5));
        }
        mlist.printList();
        System.out.println("4 nice");
    }
}
