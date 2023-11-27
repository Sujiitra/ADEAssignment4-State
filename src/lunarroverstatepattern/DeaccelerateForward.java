/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lunarroverstatepattern;

/**
 *
 * @author sujiitramurukeshan
 * Implements the State interface,
 * Deaccelerates Forward ,
 * has two methods
 * action method- prints the action, returns 1,
 * toString method returns the state value as string
 */

public class DeaccelerateForward implements State {
    public int action(){
        System.out.println("DeaccelerateForward");
        return 1;
    }
    public String toString(){
        return "Deaccelerate Forward";
    }
}
