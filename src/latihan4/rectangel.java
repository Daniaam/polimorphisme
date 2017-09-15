/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Danimen
 */
public class rectangel extends Shape {
    private int length;
    private int width;
    
public rectangel (String color, int length, int width){
super(color);
this.length = length;
this.width = width;
}

public String toString(){
return "Rectangel[length=" + length + ",width="+ width + ", " + super.toString() + "]";
}
public double getArea(){
return length*width;
}
}
