package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CounterTest {

    @Test
    void newCounterInitializedToZero() {
        Counter c = new Counter();
        assertEquals(0, c.getValue());
    }

    @Test
    void IncIncreasesValue() {
        Counter c = new Counter();
        c.inc();
        assertEquals(1, c.getValue());
        //Dorra
    }




}
