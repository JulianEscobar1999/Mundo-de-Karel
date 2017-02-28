package Ejercicio5;
import becker.robots.*;

public class Nuggets {
    
    private Robot joe;
    private City unal;
    private Thing ball;
    private Wall pared;

    public Nuggets() {
        this.unal = new City(10,10);
        this.joe = new Robot(this.unal,4,4,Direction.NORTH);
        this.ball = new Thing(this.unal,4,5); 
        this.pared = pared;
    }
    
    public void ponerPared(){
     for(int i=0; i<4;i++){this.pared = new Wall(this.unal,1,i+2,Direction.NORTH);}
     
    }
    
    
    
    
}
