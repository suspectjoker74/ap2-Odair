package listaSimplesmenteEncadeada;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import listaSimplesmenteEncadeada.EmptySLinkedList;

import listaSimplesmenteEncadeada.SLinkedList;

class SLinkedListTest {

    @Test
    void testAdddHead() {
        SLinkedList s = new SLinkedList();
        assertEquals("[]", s.toString(), "Deve imprimir []");
        s.addHead("BOS");
        assertEquals("[BOS]", s.toString());
        s.addHead("ATL");
        assertEquals("[ATL, BOS]", s.toString());
        s.addHead("MSP");
        assertEquals("[MSP, ATL, BOS]", s.toString());
        s.addHead("LAX");
        assertEquals("[LAX, MSP, ATL, BOS]", s.toString());
    }

    @Test
    void testAddTail() {
        SLinkedList s = new SLinkedList();
        assertEquals("[]", s.toString());
        s.addTail("MSP");
        assertEquals("[MSP]", s.toString());
        s.addTail("ATL");
        assertEquals("[MSP, ATL]", s.toString());
        s.addTail("BOS");
        assertEquals("[MSP, ATL, BOS]", s.toString());
        s.addTail("MIA");
        assertEquals("[MSP, ATL, BOS, MIA]", s.toString());
    }

    @Test
    void testRemoveFirst() {
        SLinkedList s = new SLinkedList();
        assertEquals("[]", s.toString());
        s.addTail("MSP");
        assertEquals("[MSP]", s.toString());
        s.addTail("BOS");
        assertEquals("[MSP, BOS]", s.toString());
        s.removeFirst();
        assertEquals("[BOS]", s.toString());
        s.removeFirst();
        assertEquals("[]", s.toString());
        assertThrows(EmptySLinkedList.class, s::removeFirst);
    }
}
