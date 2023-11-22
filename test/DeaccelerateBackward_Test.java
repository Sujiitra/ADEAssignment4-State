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
 */
public class DeaccelerateBackward_Test {
    
    public DeaccelerateBackward_Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    DeaccelerateBackward r=new DeaccelerateBackward();
   @Test
    public void action_test() {
    assertEquals(1,r.action());
    }
}
