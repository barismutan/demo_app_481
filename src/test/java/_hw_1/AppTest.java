/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package _hw_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testFound() {
       ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
       assertTrue(App.search_three(array, 1,2,3));
     }
 
     @Test
     public void testNotFound() {
       ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
       assertFalse(App.search_three(array, 4,5,6));
     }
 
     @Test
     public void testEmptyArray() {
       ArrayList<Integer> array = new ArrayList<>();
       assertFalse(App.search_three(new ArrayList<Integer>(), 1,2,3));
     }
 
     @Test
     public void testNull() {
       assertFalse(App.search_three(null, 1,1,1));
     }
 


}
