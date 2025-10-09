public class Tests {
    public void testMLinkedList() {
        MLinkedList mlist = new MLinkedList();
        mlist.remove(1);
        mlist.remove(0);
        System.out.println("t1");
        mlist.add(0);
        mlist.remove(0);
        System.out.println(mlist.get(0));
        System.out.println(mlist.printList(0) + " t2");
        mlist.add(00000000000);
        mlist.add(01);
        mlist.add(2147483647);
        System.out.println(mlist.printList(0));
        System.out.println(mlist.get(000));
        mlist.remove(0000);
        System.out.println(mlist.get(000));
        System.out.println(mlist.printList(5) + " t3");
        System.out.println(mlist.get(2147483647));
        mlist.remove(2147483647);
        System.out.println(mlist.get(2147483647));
        System.out.println(mlist.printList(0) + " t4");
        mlist.remove(5);
        mlist.remove(1);
        System.out.println(mlist.get(0));
        System.out.println(mlist.printList(0) + " 1 nice");
        mlist.printList();
        mlist.printList(0);
        System.out.println("2 nice");
        mlist.add(45747);
        System.out.println(mlist.countMaxElements());
        System.out.println(mlist.getHead() + " - getHead\n---");
        System.out.println(mlist.get(45747) + " - get");
        mlist.remove(45747);
        System.out.println(mlist.countMaxElements());
        System.out.println(mlist.getHead());
        System.out.println("\nAll OK");
    }
}
