package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSoma() {
        assertEquals(5.0, calc.soma(2.0, 3.0));
    }

    @Test
    void testSubtracao() {
        assertEquals(1.0, calc.subtracao(4.0, 3.0));
    }

    @Test
    void testMultiplicacao() {
        assertEquals(6.0, calc.multiplicacao(2.0, 3.0));
    }

    @Test
    void testDivisao() {
        assertEquals(2.0, calc.divisao(6.0, 3.0));
    }

    @Test
    void testPotenciacao() {
        assertEquals(8.0, calc.potenciacao(2.0, 3.0));
    }
}
