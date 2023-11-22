/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lunarroverstatepattern;

/**
 *
 * @author sujiitramurukeshan
 */
public class LunarRoverStatePattern {

    /**
     * @param args the command line arguments
     */
    Context context= new Context();
   protected State currentState = new AtRest();

    LunarRoverStatePattern() {}

    protected void pressRightPedalOnce() {
        
        switch (this.currentState.toString()) {
            case "Accelerate Forward":
               
                this.currentState = new DeaccelerateForward (); // current state becomes state DeaccelerateForward
                context.setState(this.currentState);
                currentState.action();
                break;
            case "Accelerate Backward":
              
                    this.currentState = new DeaccelerateBackward(); // current state becomes state DeaccelerateBackward
                context.setState(this.currentState);
                currentState.action();
                break;
              case "Constant Speed Forward":
               
                    this.currentState = new DeaccelerateForward (); // current state becomes state DeaccelerateForward
                context.setState(this.currentState);
                currentState.action();
                break;
            case "Constant Speed Backward":
              
                    this.currentState = new DeaccelerateBackward(); // current state becomes state DeaccelerateBackward
                context.setState(this.currentState);
                currentState.action();
                break;  
             
            default:
                System.out.println("Error: Can only press Right Pedal when in Accelerate Forward or Accelerate Backward States.\nUnable to move.");
                break;
        }
    }

    protected void pressRightPedal3Secs() {
        
        switch (this.currentState.toString()) {
            case "Accelerate Forward":
               
                    this.currentState = new ConstantSpeedForward (); // current state becomes state ConstantSpeedForward
                context.setState(this.currentState);
                currentState.action();
                break;
            case "Accelerate Backward":
              
                    this.currentState = new ConstantSpeedBackward(); // current state becomes state ConstantSpeedBackward
                context.setState(this.currentState);
                currentState.action();
                break;
            default:
                System.out.println("Error: Can only press Right Pedal when in Accelerate Forward or Accelerate Backward States.\nUnable to move.");
                break;
        }
    }
    
    protected void pressBothPedalsOnce() {
        
        switch (this.currentState.toString()) {
            case "Deaccelerate Forward":
               
                    this.currentState = new AtRest(); // current state becomes state AtRest
                context.setState(this.currentState);
                currentState.action();
                break;
            case "Deaccelerate Backward":
              
                    this.currentState = new AtRest(); //current state becomes state AtRest
                context.setState(this.currentState);
                currentState.action();
                break;
            default:
                System.out.println("Error: Can only press Both Pedals when in Deaccelerate Forward or Deaccelerate Backward States.\nUnable to move.");
                break;
        }
    }

    protected void pressLeftPedalOnce() {
        
        switch (this.currentState.toString()) {
            case "At Rest":
               
                    this.currentState = new AccelerateForward(); // current state becomes state AccelerateForward
                context.setState(this.currentState);
                currentState.action();
                break;

            default:
                System.out.println("Error: Can only press Left Pedal Once when in At Rest States.\nUnable to move.");
                break;
        }
    }

    protected void pressLeftPedal3Secs() {
        
        switch (this.currentState.toString()) {
            case "At Rest":
               
                    this.currentState = new AccelerateBackward(); // current state becomes state AccelerateBackward
                context.setState(this.currentState);
                currentState.action();
                break;

            default:
                System.out.println("Error: Can only press Left Pedal for 3secs when in At Rest States.\nUnable to move.");
                break;
        }
    }
    

    

    public static void main(String[] args) {
        
        LunarRoverStatePattern rover = new LunarRoverStatePattern();

        // Move Forward State 
        rover.pressLeftPedalOnce(); // Move Forward - Accelerate
        rover.pressRightPedal3Secs(); //ConstantSpeed
        rover.pressRightPedalOnce(); //Decelerate
        rover.pressBothPedalsOnce(); //AtRest
        rover.pressRightPedal3Secs(); //Error
        rover.pressLeftPedalOnce(); // Accelerate
        

        // Transition to At Rest
        rover.pressRightPedalOnce(); //Decelerate
        rover.pressBothPedalsOnce(); // At Rest
      

        // Move Backward State
        rover.pressLeftPedal3Secs(); // Move Backward - Accelerate
        rover.pressRightPedal3Secs(); // ConstantSpeed
        rover.pressRightPedalOnce(); // Decelerate
        rover.pressBothPedalsOnce(); // At Rest
        rover.pressRightPedal3Secs(); // Error
        rover.pressLeftPedal3Secs(); // Accelerate
        rover.pressRightPedalOnce(); //Decelerate
        rover.pressBothPedalsOnce(); // At Rest
    }
    
}
