package org.vanbart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit testing a Clojure-generated class.
 * @author Ton van Bart
 * @since 12/12/13 10:19 PM
 */
public class AfternoonTest {

    @Test
    public void testDefaultAfternoon() {
        Afternoon afternoon = new Afternoon();
        assertEquals("Good Afternoon, World!", afternoon.afternoon());
    }

    @Test
    public void testNamedAfternoon() {
        Afternoon afternoon = new Afternoon();
        System.out.println(afternoon.afternoon("Ton"));
        assertEquals("Good Afternoon, Ton", afternoon.afternoon("Ton"));
    }

}
