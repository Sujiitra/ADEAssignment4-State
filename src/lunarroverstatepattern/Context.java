/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lunarroverstatepattern;

/**
 *
 * @author sujiitramurukeshan
 * Context class,
 * Acts as a getter and setter of the state of Lunar rover
 */
public class Context {
    private State state;
    public Context(){
        state=null;
    }
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return state;
    }
}
