/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 * 
 */

public class Bicicleta {
    
    private FiguraGeometrica ruedas[];
    private FiguraGeometrica plato;
    private FiguraGeometrica marco[];

    public Bicicleta(FiguraGeometrica[] ruedas, FiguraGeometrica plato, FiguraGeometrica[] marco) {
        this.ruedas = ruedas;
        this.plato = plato;
        this.marco = marco;
    }
    
    public double area(){
        double area = (ruedas[0].area()+ruedas[1].area()+plato.area()+marco[0].area()+marco[1].area()+marco[2].area());
        return area;
    }
    
}
