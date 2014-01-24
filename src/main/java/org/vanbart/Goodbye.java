package org.vanbart;

/**
 * @author Ton van Bart
 * @since 12/12/13 9:39 PM
 */
public class Goodbye {

    public String greet() {
        return "Goodbye, World!";
    }

    public String greet(String name) {
        return String.format("Goodbye, %s!", name);
    }

}
