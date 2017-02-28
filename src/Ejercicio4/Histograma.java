package Ejercicio4;
import becker.robots.*;


public class Histograma {
    private Robot joe;
    private Thing balon;
    private City unal;

    public Histograma() {
        this.unal = new City(6,6);
        this.joe = new Robot(this.unal,0,1,Direction.SOUTH);
    }

    
    
    int a=0,b=0,c=0,d=0;
    
    public void numeros(){
        
        //para 3 en 1,1
        for(int i=0;i<3;i++){
        this.balon = new Thing(this.unal,1,1);
        }
        //para 2 en 2,1
        for(int i=0;i<2;i++){
        this.balon = new Thing(this.unal,2,1);
        }
        //para 5 en 3,1
        for(int i=0;i<5;i++){
        this.balon = new Thing(this.unal,3,1);
        }
        //para 4 en 4,1
        for(int i=0;i<4;i++){
        this.balon = new Thing(this.unal,4,1);
        }
               
    }
    
    public void contar(){
    joe.move();
    while(joe.canPickThing()){
        joe.pickThing();
        a++;
    }
    joe.move();
    while(joe.canPickThing()){
        joe.pickThing();
        b++;
    }
    joe.move();
    while(joe.canPickThing()){
        joe.pickThing();
        c++;
    }
    joe.move();
    while(joe.canPickThing()){
        joe.pickThing();
        d++;
    }
    
        System.out.println("a: "+a+"\n b: "+b+"\n c: "+c+"\n d: "+d);
         
    
    }
   
    
}
