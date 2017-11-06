
package boletin5_6;

import java.util.Scanner;


public class Boletin5_6 {


    public static void main(String[] args) {
  metodos obj=new metodos();
  Scanner sc=new Scanner(System.in);
        System.out.println("Nombre del articulo: ");
        String nomart=sc.next();
        System.out.println("Introduce la cantidad: ");
  int vanuais=sc.nextInt();
        System.out.println("Necesidad: ");
  obj.comercio(nomart, vanuais);
    }
    
}
