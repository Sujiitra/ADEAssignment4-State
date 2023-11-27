/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import lunarroverstatepattern.AtRest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 * tests AtRest class,
 * assert equals 1 when the action is called
 */
public class AtRest_Test {
    
    public AtRest_Test() {
    }

    AtRest r= new AtRest();
     @Test
    public void action_test() {
    assertEquals(1,r.action());
    }
}
