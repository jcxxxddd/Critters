import java.awt.*;

public class Bear extends Critter {//giving bear access to all the methods and fields in critter.f yeah polymorphism <3
    private Color color;
    private int age;

    public Bear(boolean polar){
        if (polar)
        {
            color = Color.WHITE;
        }
        else{
            color = Color.BLACK;      
         }
        age = 0;//bear is zero years old
    }


    
    public Action getMove(CritterInfo info) {
        age ++; //everytime we call getmove the bear gets a year older, of thrres something it can infec t it wil;l, if neither are true it will turn to the left
    
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } 
        if (info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }
        else{
            return Action.LEFT;
        }
    }

    public Color getColor() {
        return color;//return whatever the color the bear is
    }

    public String toString() {//alternate beterwwn \and/
       
        if(age % 2 == 0){
            return "/";
        }
        else{
            return "\\";
        }
        
        

    }
    
}