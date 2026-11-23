/* 

To be tested using Junit 5 

COMPILATION: 
javac -cp full_path_to_.java_file_to_be_compiled:full_path_to_JUnit/junit4.10/junit-platform-console-standalone-1.7.2.jar file_to_be_compiled.java

Example:

javac -cp .:full_path_to_JUnit/junit4.10/junit-platform-console-standalone-1.7.2.jar TestMyCounter.java

EXECUTION:

java -jar full_path_to_JUnit/junit4.10/junit-platform-console-standalone-1.7.2.jar -cp full_paths_to_all_classess_involved --select-class test_class_name

Example:
javac -jar full_path_to_JUnit/junit4.10/junit-platform-console-standalone-1.7.2.jar -cp . --select-class TestMyCounter
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestMyCounter{

@Test
public void test_the_counter() {
Counter counter = new Counter();
counter.inc_x();
assertTrue(counter.x == 1);

 }
     }
