package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CounterTest {
    static Counter createCounterWithValueOne() {
        Counter counter = new Counter();
        counter.inc();
        return counter;
    }
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

    @Test
    void DecDecreasesValue() {
        Counter c = createCounterWithValueOne();
        c.dec();
        assertEquals(0, c.getValue());
    }
}
