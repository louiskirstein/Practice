/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author LK
 */
public class Rectangle {

    public static double getArea(double length, double width) {
        return (length * width);
    }

    public static double getParimeter(double length, double width) {
        return (2.0 * length) + (2.0 * width);
    }

    public static boolean isSquare(double lenght, double width) {
        return (lenght == width);
    }

}
