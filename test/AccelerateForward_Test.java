/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import lunarroverstatepattern.AccelerateForward;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 * tests AccelerateForward class,
 * assert equals 1 when the action is called
 */
public class AccelerateForward_Test {
    
    public AccelerateForward_Test() {
    }

     AccelerateForward r=new AccelerateForward();
   @Test
    public void action_test() {
    assertEquals(1,r.action());
    }
}
