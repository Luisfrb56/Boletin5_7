
package boletin5_4;

import java.util.Scanner;


public class Boletin5_4 {


    public static void main(String[] args) {
        metodos obj=new metodos();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre de la primera persona: ");
        String nom1=sc.next();
        System.out.println("Nombre de la segunda persona: ");
        String nom2=sc.next();
        System.out.println("Peso de la primera persona: ");
        double peso1=sc.nextDouble();
        System.out.println("Peso de la primera persona: ");
        double peso2=sc.nextDouble();
        obj.difpeso(nom1,nom2,peso1, peso2);
    }
    
}
