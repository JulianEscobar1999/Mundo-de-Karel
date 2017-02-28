package Ejercicio1;
import becker.robots.*;




public class Futbol {

    private Robot joe;
    private City unal;
    private Thing balon;

    public Futbol() {
        this.unal = new City(10,10);
        this.balon = new Thing(this.unal,9 ,9);
        this.joe = new Robot(this.unal,9,9,Direction.WEST,9);
    }
    public void advance(){
        joe.pickThing();
        joe.move();
        joe.putThing();
        joe.pickThing();
        joe.move();
        joe.putThing();
    }
    public void advanceLeft(){
        joe.pickThing();
        joe.turnLeft();
        joe.move();
        joe.putThing();
        joe.pickThing();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.putThing();
        joe.pickThing();
        joe.move();
        joe.putThing();
        joe.pickThing();
        joe.move();
        
    }
    public void advanceRight(){
        joe.pickThing();
        joe.move();
        joe.putThing();
        joe.pickThing();
        joe.move();
        joe.putThing();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.pickThing();
        joe.move();
        joe.putThing();
        joe.turnLeft();
        
    }
    
    
}
