import java.awt.*;
import java.util.Random;

public class Lion extends Critter {//giving bear access to all the methods and fields in critter.f yeah polymorphism <3
    private Color color;
    private int age;
    private Random random = new Random();//initialise

    public Lion(){
        
        age = 0;//critter is zero years old
    }


    
    public Action getMove(CritterInfo info) {
        age ++; //everytime we call getmove the lion gets a year older, of thrres something it can infec t it wil;l, if neither are true it will turn to the left
        changeColor();
        if (info.getFront() == Neighbor.OTHER) {//checks if it can infect
            return Action.INFECT;
        } 
        if(info.getFront() == Neighbor.WALL  || info.getRight() == Neighbor.WALL){//checks for walla
            return Action.LEFT;
        }
        if (info.getFront() == Neighbor.SAME){//if lion go right
            return Action.RIGHT;
        }
        else{
            return Action.HOP;//goes forward if non is true
        }
    }

    public Color getColor() {

        return color;//return whatever the color the bear is
    }
    public void changeColor(){
        if(age % 3 == 0){
            int randomNumber = random.nextInt(3);
            if (randomNumber == 0){
                color = Color.RED;
            }
            if (randomNumber == 1){
                color = Color.GREEN;
            }
            if (randomNumber == 2){
                color = Color.BLUE;
            }
        }
    }

    public String toString() {//alternate beterwwn \and/
       
        return "L";
        
        

    }
    
}