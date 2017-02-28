package Ejercicio3;
import becker.robots.*;
import java.awt.Color;



public class Hello {
    private Robot h,e,l1,l2,o;
    private City unal;
    private Thing balon;
    
    public Hello(){
    this.unal = new City(7,24);
    this.h = new Robot(this.unal,5,3,Direction.NORTH,14);
    this.e = new Robot(this.unal,5,7,Direction.NORTH,14);
    this.l1 = new Robot(this.unal,5,11,Direction.NORTH,14);
    this.l2 = new Robot(this.unal,5,15,Direction.NORTH,14);
    this.o = new Robot(this.unal,5,19,Direction.NORTH,14);
    }
    
    public void setco(){
    
    h.setColor(Color.green);
    e.setColor(Color.green);
    l1.setColor(Color.white);
    l2.setColor(Color.WHITE);
    o.setColor(Color.black);
    }
    public void hacerH(){
       
        for(int i =0; i<5;i++){
            h.move();
            h.putThing();
        }      
       h.turnLeft();
       h.move();
       h.move();
       h.turnLeft();
       
       for(int i =0; i<4;i++){
            h.putThing();
            h.move();
            if(i==3){
                h.putThing();
            }
        }
       
       h.turnLeft();
       h.move();
       h.turnLeft();
       for(int i =0; i<4;i++){
        h.move();
        if(i==1){
           h.putThing();
        }
        }
        
        h.turnLeft();
        h.turnLeft();
        for(int i=0; i<5; i++){
            h.move();
        }
        
    }
    
    
    public void hacerE(){
        
        for(int i=0; i<5;i++){
            e.move();
            if(i==0||i==2||i==4){
                e.putThing();
            }
        }
        e.turnLeft();
        e.move();
        e.move();
        e.turnLeft();
        for(int i=0; i<5;i++){
            e.putThing();
            if(i<4){e.move();};
            
        }
        e.turnLeft();
        e.move();
        e.turnLeft();
        for(int i=0; i<5;i++){
        if(i==0||i==2||i==4){
            e.putThing();
            }            
        if(i<4){e.move();};
        }
        e.turnLeft();
        e.turnLeft();
        for(int i=0; i<5; i++){
            e.move();
        }
    }
    
    public void hacerL1(){
       l1.move();
       l1.turnLeft();
       for(int i =0; i<2;i++){
           l1.putThing();
           l1.move();
       }             
      for(int i=0;i<3;i++){l1.turnLeft();}                    
      
      l1.putThing();
      for(int i =0; i<4;i++){
           l1.move();
           l1.putThing();
      }
      for(int i=0;i<3;i++){l1.turnLeft();}                    
      l1.move();
      for(int i=0;i<3;i++){l1.turnLeft();}
      for(int i =0; i<5;i++){
           l1.move();         
      }
    }
    
    public void hacerL2(){
       
       l2.move();
       l2.turnLeft();
       for(int i =0; i<2;i++){
           l2.putThing();
           l2.move();
       }             
      for(int i=0;i<3;i++){l2.turnLeft();}                    
      
      l2.putThing();
      for(int i =0; i<4;i++){
           l2.move();
           l2.putThing();
      }
      for(int i=0;i<3;i++){l2.turnLeft();}                    
      l2.move();
      for(int i=0;i<3;i++){l2.turnLeft();}
      for(int i =0; i<5;i++){
           l2.move();         
      }
    }
    
    public void hacerO(){
       
       for(int i=0; i<5; i++){
           o.move();
           o.putThing();           
       }
       o.turnLeft();
       for(int i=0; i<2; i++){
           o.move();
           o.putThing();           
       }
       o.turnLeft();
       for(int i=0; i<4; i++){
           o.move();
           o.putThing();           
       }
       o.turnLeft();
       o.move();
       o.putThing();
       for(int i=0;i<3;i++){o.turnLeft();}
       o.move();
       
    }
}
