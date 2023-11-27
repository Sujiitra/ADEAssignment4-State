/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import lunarroverstatepattern.AccelerateBackward;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 * tests AccelerateBackward class,
 * assert equals 1 when the action is called
 */
public class AccelerateBackward_Test {
    
    public AccelerateBackward_Test() {
    }

    AccelerateBackward r=new AccelerateBackward();
   @Test
    public void action_test() {
    assertEquals(1,r.action());
    }
}
