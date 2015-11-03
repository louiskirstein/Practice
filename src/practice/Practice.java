/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javax.swing.JOptionPane;

/**
 *
 * @author LK
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //    testCircle
        testRectangle();
        //testCylinder();
    }

    private static void testCircle() {

        double radius = Double.valueOf(JOptionPane.showInputDialog("How big should the radius be?"));

        System.out.println(Circle.getArea(radius));
        System.out.println(Circle.getDiameter(radius));
        System.out.println(Circle.getCircumference(radius));
    }

    private static void testRectangle() {
        System.out.println("Rectangle Test \n---------------");
        double length = Double.valueOf(JOptionPane.showInputDialog("Give me a Length"));
        double width = Double.valueOf(JOptionPane.showInputDialog("Give me a Width"));
        System.out.printf("Length       = %.1f\n", length);
        System.out.printf("Width        = %.1f\n", width);
        System.out.printf(" Area        = %.1f\n", Rectangle.getArea(length, width));
        System.out.printf(" Parimeter   = %.1f\n", Rectangle.getParimeter(length, width));
        System.out.printf("Is a square  = %s\n", Rectangle.isSquare(length, width));

    }

    private static void testCylinder() {
        System.out.println("Cylinder Test \n----------------");
        double radius = Double.valueOf(JOptionPane.showInputDialog("Give me a radius"));
        double height = Double.valueOf(JOptionPane.showInputDialog("Give me a height"));
        System.out.printf(" radius  = %.2f\n ",radius);
        System.out.printf("height  = %.2f\n ",height);
        System.out.printf("Volume  = %.2f\n ",Cylinder.getVolume(radius, height));
       
       
        
    }
        

}
