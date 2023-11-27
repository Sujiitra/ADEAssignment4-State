/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import lunarroverstatepattern.ConstantSpeedForward;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 * tests ConstantSpeedForward class,
 * assert equals 1 when the action is called
 */
public class ConstantSpeedForward_Test {
    
    public ConstantSpeedForward_Test() {
    }

    ConstantSpeedForward r=new ConstantSpeedForward();
   @Test
    public void action_test() {
    assertEquals(1,r.action());
    }
}
