
package sueldo.y.comision.de.empleado;

import java.util.Scanner;

public class SueldoYComisionDeEmpleado {

  
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner (System.in);
        int opc = 0;
        double sueldo, t_comision, total, ventas ;
        do {
            System.out.println("ingrese el sueldo del empleado:"); sueldo=Teclado.nextDouble ();    
            System.out.println("ingrese el valor de las ventas del mes del empleado:"); ventas=Teclado.nextDouble();
            t_comision = ventas * 10 /100;
            
            System.out.print("la comision del empleado es: :"+ Math.round(t_comision));
            System.out.println("pesos");
            total =  t_comision+sueldo;
            System.out.print("el sueldo mas comisiones del empleado es: :"+total);
            System.out.println("pesos");
            System.out.println("Desea ingresar otro empleado: S=1..N=0");opc=Teclado.nextInt();
        }while (opc ==1);


       
    }
    
}
