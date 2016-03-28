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
public class Herencia {

    
    public static void main(String[] args) {
        
        FiguraGeometrica c1 = new Circulo("rojo", 8);
        FiguraGeometrica c2 = new Circulo("negro", 8);
        FiguraGeometrica ruedas[] = new Circulo[2];
        ruedas[0]=c1;
        ruedas[1]=c2;
        FiguraGeometrica plato = new Circulo("plateado", 2);
        FiguraGeometrica t1 = new Triangulo("azul", 12);
        FiguraGeometrica t2 = new Triangulo("azul", 10);
        FiguraGeometrica t3 = new Triangulo("azul", 15);
        FiguraGeometrica marco[] = new Triangulo[3];
        marco[0]= t1;
        marco[1]= t2;
        marco[2]= t3;
        
        Bicicleta b1 = new Bicicleta(ruedas, plato, marco);
        System.out.println(b1.area());
    }
    
}
