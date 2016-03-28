/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
public class Triangulo extends FiguraGeometrica{

    private double lado;
    
    public Triangulo(String color, double lado) {
        super(color);
        this.lado = lado;
    }
    
    public double area(){
        return (this.lado*this.lado*Math.sqrt(3))/4;
    }
}
