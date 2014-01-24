package org.vanbart
import org.junit.Before
import org.junit.Test

import static groovy.util.GroovyTestCase.assertEquals
/**
 *
 * @author Ton van Bart
 * @since 12/12/13 9:40 PM
 */
class GoodbyeTest {

    Goodbye goodbye

    @Before
    void setup() {
        goodbye = new Goodbye()
    }

    @Test
    void testDefaultGoodbye() {
        assertEquals("Goodbye, World!", goodbye.greet())
    }

    @Test
    void testNamedGoodbye() {
        assertEquals("Goodbye, Ton!", goodbye.greet("Ton"))
    }

}
