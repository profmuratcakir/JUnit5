package org.junit;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HesapMakinasiTest {

    @Test
    @DisplayName("iki sayiyi toplar")
    void topla() {
        assertEquals(4, HesapMakinasi.topla(2,2));
        assertEquals(2, HesapMakinasi.topla(3,-1));
        assertEquals(-1, HesapMakinasi.topla(-2,1));
        assertEquals(-5, HesapMakinasi.topla(-2,-3));
    }
    @Test
    @DisplayName("iki sayiyi carpar")
    void carp() {
        assertAll(() -> assertEquals(4, HesapMakinasi.carp(2,2)),
                    () -> assertEquals(-3, HesapMakinasi.carp(3,-1)),
                    () -> assertEquals(-2, HesapMakinasi.carp(-2,1)),
                    () -> assertEquals(6, HesapMakinasi.carp(-2,-3)));
    }
}