package Ejercicio2;

import becker.robots.*;
public class Cuartos {
    
    private Robot joe;
    private City unal;
    private Thing balon;
    
    public void identificar(){
        int o=0, s=0,c=0, f=0, c2=0, ind=0;
        //Subir
        for(int i =0;i<5;i++){
        this.joe.move();
        //contar
        if(joe.canPickThing()){o++;}
        }
    //girar avanzar der 1
    joe.turnLeft();
    joe.move();
    joe.turnLeft();
    
    //contar col 0        
    if(joe.canPickThing())
    {s++;}    
    for(int i=0;i<4;i++){
    joe.move();
    if(i==1&&joe.canPickThing())
    /*para 2 y 5*/ {ind=1;} 
    if(joe.canPickThing())
    {s++;}
    }
    
    //mover
    joe.turnLeft();
    for(int i=0;i<2;i++){
    joe.move();
    }
    
    joe.turnLeft();
    
    //contar col 2        
    if(joe.canPickThing())
    {c2++;}
    for(int i=0;i<4;i++){
    joe.move();
    if(joe.canPickThing())
    {c2++;}
    }
    
    if(o==0){
        System.out.println("El Numero es 1");
    }
    if(o==2){
        System.out.println("El Numero es 0");
    }   
    if(o==3&&s==5&&c2==5&&ind==0){
        System.out.println("El Numero es 2");
    }
    if(o==3&&s==3){
        System.out.println("El numero es 3");
    }
    if(o==1&&s==3){
        System.out.println("El Numero es 4");
    }
    if(o==3&&s==4&&c2==4&&ind==1){
        System.out.println("El Numero es 5");
    }
    if(o==3&&s==5&&c2==4){
        System.out.println("El Numero es 6");               
    }
    if(o==1&&s==1){
        System.out.println("El Numero es 7");
    }
    if(o==3&&s==5&&c2==5){
        System.out.println("El Numero es 8");
    }
    if(o==0&&s==5&&c2==4){
        System.out.println("El numero es 9");
    }
    
    joe.turnLeft();
    joe.move();
    joe.turnLeft();
    for(int i=0; i<5;i++){
        joe.move();
    }
    
    //joe sale y se ubica en la otra
    joe.turnLeft();
    joe.move();
    joe.move();
    joe.move();
    joe.turnLeft();
    }
    
    
    public Cuartos() {
        
    
        this.unal = new City(10,10);
        
        this.balon = new Thing(this.unal,2,4 );
        for(int i =0 ; i<5; i++){
            for(int j=0; j<3;j++){
            if(j==0||j==2){
            this.balon = new Thing(this.unal,i,j);
            this.balon = new Thing(this.unal,i,j+6);            
            if(i>0&&i<3){
                if(j==0){
                this.balon = new Thing(this.unal,i,j+3);
                }
                if(j==2){
                this.balon = new Thing(this.unal,i+1,j+3);    
                }
            }
                         
            }
            
            if(i==0||i==4){
                this.balon = new Thing(this.unal,i,j);
                this.balon = new Thing(this.unal,i,j+3);
                this.balon = new Thing(this.unal,i,j+6);
            }
            
            
            }
       }
        
        this.joe = new Robot(this.unal,5,1,Direction.NORTH,9); 
    }   
    
       
    
}