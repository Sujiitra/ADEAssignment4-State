/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import lunarroverstatepattern.DeaccelerateForward;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 * tests DeaccelerateForward class,
 * assert equals 1 when the action is called
 */
public class DeaccelerateForward_Test {
    
    public DeaccelerateForward_Test() {
    }
     DeaccelerateForward r=new DeaccelerateForward();
   @Test
    public void action_test() {
    assertEquals(1,r.action());
    }
}
