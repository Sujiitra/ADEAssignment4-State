/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lunarroverstatepattern;

/**
 *
 * @author sujiitramurukeshan
 * Implements the State interface,
 * Constant Speed Forward state,
 * has two methods
 * action method- prints the action, returns 1,
 * toString method returns the state value as string
 */
//Implements the State interface

public class ConstantSpeedForward implements State{
     public int action(){
        System.out.println("ConstantSpeedForward");
        return 1;
    }
    public String toString(){
        return "Constant Speed Forward";
    }
}
