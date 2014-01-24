package org.vanbart;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Ton van Bart
 * @since 12/12/13 9:32 PM
 */
public class HelloTest {

    @Test
    public void testDefaultGreeting() {
        Hello hello = new Hello();
        assertThat(hello.greet(), is("Hello, World!"));
    }

    @Test
    public void testNamedGreeting() {
        Hello hello = new Hello();
        assertThat(hello.greet("Ton"), is("Hello, Ton!"));
    }

}
