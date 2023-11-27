/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import lunarroverstatepattern.DeaccelerateBackward;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 * tests DeaccelerateBackward class,
 * assert equals 1 when the action is called
 */
public class DeaccelerateBackward_Test {
    
    public DeaccelerateBackward_Test() {
    }

    DeaccelerateBackward r=new DeaccelerateBackward();
   @Test
    public void action_test() {
    assertEquals(1,r.action());
    }
}
