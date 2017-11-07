
package boletin5_7;

import java.util.Scanner;


public class Boletin5_7 {

    
    public static void main(String[] args) {
    Scanner area=new Scanner(System.in);
    Metodos obx=new Metodos();
        System.out.println(" *** MENÚ ***\n 1 Superficie do cadrado\n 2 Superficie do triangulo\n 3 Superficie do circulo");
        System.out.println("Teclea el lado,radio o base: ");
        float l=area.nextFloat();
        System.out.println("Teclea la altura si es necesario: ");
        float alt=area.nextFloat();
        System.out.println("Elige una opcion de las que quieras calcular con estos datos: ");
        int sup=area.nextInt();
         obx.comparar(sup, l,alt);
    }
    
}
