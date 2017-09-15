/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Danimen
 */
public class Test {
     public static void main(String []args){
       //membuat 2 objek
       Line line = new Line(1,2,3,4);
       Line line2 = new Line(5,6,7,8);
       //length objek 1 dan 2
       System.out.println("Panjang Angka Objek 1 = "+line.getLength());
       System.out.println("Panjang Angka Objek 2 = "+line2.getLength());
       System.out.println("");
       //perbandingan
       System.out.println("Perbandingan Objek 1 > Objek 2 = "+line.isGreater(line, line2));
       System.out.println("Perbandingan Objek 1 < Objek 2 = "+line.isLess(line, line2));
       System.out.println("Perbandingan Objek 1 = Objek 2 = "+line.isEqual(line, line2));
       }
}
