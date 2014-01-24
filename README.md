## Mixed language experiment
This is a quick experiment mixing and matching different languages in a Maven-based project:
"production" classes in Java, Groovy and Clojure, and test code in Java and Groovy.
The only functionality provided is a super simple "Hello {insert name here}", nothing exciting going on.

The project builds from the commandline (<code>mvn clean install</code>), and the unit
tests all run in IntelliJ, even though the test for the Clojure-generated class will appear to give a compile error.