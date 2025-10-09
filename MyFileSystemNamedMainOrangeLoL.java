import java.util.HashMap;

public class MyFileSystemNamedMainOrangeLoL {
    private MLinkedList mainList = new MLinkedList();
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    public void create(Pointer pointer) {
        mainList.add(pointer); // в значениях value будут храниться адреса
    }

    public boolean open() {

        return false;
    }

    public StringBuilder read(String path) {
        StringBuilder str = new StringBuilder();
        int value = Integer.valueOf(map.get(path).toString());
        ListNode node = mainList.get(value);
//        while (mainList.getNext(node) ... ) {
            str.append(node.data.toString()); // надо сделать разделение чтобы читать только нужный файл
            node = mainList.getNext(node);
//        }

        return str;
    }

    public void delete(Pointer pointer) {
        mainList.remove(pointer);
    } // то есть по сути просто теряем ссылку на файл, но он не удалится же сам?
}
