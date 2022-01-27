import java.awt.*;

public class Giant extends Critter {//giving bear access to all the methods and fields in critter.f yeah polymorphism <3
    private Color color;
    private int age;
    private String label;
    private int wordNum;

    public Giant(){
        
        age = 0;//critter is zero years old
        label = "fee";
    }


    
    public Action getMove(CritterInfo info) {
        age ++; //everytime we call getmove the bear gets a year older, of thrres something it can infec t it wil;l, if neither are true it will turn to the left
    
        changeLabel();


        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } 
        if (info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }
        else{
            return Action.RIGHT;
        }
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
       
        return label;//returns current label
        
        

    }
    public void changeLabel(){
        if (age % 6 == 0){//every 6 years, incriments word numb by 1 and if 3, sets wordnum back to zerop
            wordNum ++;
            if (wordNum > 3 ){
                wordNum = 0;
            }
        }
        if(wordNum == 0){
            label = "fee";
        }
        if(wordNum == 1){
            label = "fie";
        }
        if(wordNum == 2){
            label = "foe";
        }
        if(wordNum == 3){
            label = "fum";
        }
    }
    
}