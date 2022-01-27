import java.awt.*;

import javax.sound.midi.MidiDevice.Info;

public class Orca extends Critter {//giving orca access to all the methods and fields in critter.f yeah polymorphism <3
    private Color color;
    private int age;

    public Orca(){
       
        age = 0;
    }


    
    public Action getMove(CritterInfo info) {
        age ++; //everytime we call getmove the killer whale gets a year older, of thrres something it can infec t it wil;l, if neither are true it will turn to the left
    
        

        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } 
        if(info.getLeft() ==  Neighbor.OTHER ){//cheks if critter to left is facing us, if yes, try to hop away otherwise turn to try to infect it next turn
            
            if( info.getFront()  == Neighbor.EMPTY && info.getLeftDirection() == Direction.WEST){//makes sure we can actually go forward
                return Action.HOP;
            }
            else{
                return Action.LEFT;
            }
            
        }
        if(info.getRight() ==  Neighbor.OTHER ){//cheks if critter to left is facing us, if yes, try to hop away otherwise turn to try to infect it next turn
            if( info.getFront()  == Neighbor.EMPTY && info.getRightDirection() == Direction.EAST){
                return Action.HOP;
            }
            else{
                return Action.RIGHT;
            }
            
        }
        if(info.getBack() ==  Neighbor.OTHER ){//cheks if critter to left is facing us, if yes, try to turn left away otherwise turn to try to infect it next turn
            if( info.getFront()  == Neighbor.EMPTY && info.getBackDirection() == Direction.NORTH){
                return Action.HOP;
            }
            else{
                return Action.LEFT;
            }
            
        }
        if (info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }
        else{
            return Action.LEFT;
        }
    }

    public Color getColor() {
        return color.BLACK;//return whatever the color the bear is
    }

    public String toString() {//alternate beterwwn \and/
       
        return "#blackfish";
        
        

    }
    
}