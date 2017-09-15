
package latihan4;

public class triangle extends Shape {
    private int base;
    private int height;
    
public triangle (String color, int base, int height){
super(color);
this.base = base;
this.height = height;
}
public String toString(){
return "Triagle[base=" + base + ", height=" + height + ", "
        + super.toString() + "]";
}
public double getArea(){
return 0.5*base*height;
}
    
}
