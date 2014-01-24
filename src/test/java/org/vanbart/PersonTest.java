package org.vanbart;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Ton van Bart
 * @since 12/13/13 9:42 AM
 */
public class PersonTest {

    @Test
    public void getAndSet() throws Exception {
        Person person = new Person();
        person.setFirstName("Pietje");
        person.setLastName("Puk");
        person.setAge(35);

        assertThat(person.getFirstName(), is("Pietje"));
        assertThat(person.getLastName(), is("Puk"));
        assertThat(person.getAge(), is(35));
    }
}
