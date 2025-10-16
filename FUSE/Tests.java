package FUSE;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testMLinkedList() {
        MLinkedList list = new MLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        assertNotNull(list.get(10));
        assertNull(list.get(40));

        assertFalse(list.remove(40));
        assertTrue(list.remove(20));
        assertNull(list.get(20));

        assertEquals(10, list.getHead().value);

        ListNode current = list.getHead();
        assertEquals(current.getValue(), current.value);
        assertEquals(current.getNext(), current.next);
        assertEquals(current.getPrev(), current.prev);
        assertEquals(30, current.getNext().getValue());
        assertNull(current.getPrev());
        current = current.getNext();
        assertEquals(10, current.getPrev().getValue());
        assertNull(current.getNext());

        list.add(10);
        assertEquals(1, list.countMaxElements());

        String expectedOutput = "10 30 10";
        assertEquals(expectedOutput, list.printList(0).toString());

        // какой-то перевод потока вывода в буфер и обратно во время вызова метода,
        // чтобы получить то что было бы в консоли
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outputStreamCaptor);
        System.setOut(ps);

        list.printList();

        System.setOut(originalOut);

        String printedOutput = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutput, printedOutput);

        assertFalse(list.remove(40));
        list.remove(10);
        list.remove(30);
        list.remove(10);
        assertNull(list.getHead());
    }

    @Test
    public void testNLinkedList() {
        NLinkedList list = new NLinkedList();

        list.add(new ListNode(10));
    }
}