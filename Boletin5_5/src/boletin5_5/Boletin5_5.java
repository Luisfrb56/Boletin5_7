
package boletin5_5;

import java.util.Scanner;


public class Boletin5_5 {

  
    public static void main(String[] args) {
       metodos obj=new metodos();
       Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el primer dato: ");
       int num1=sc.nextInt();
        System.out.println("Introduce el segundo dato: ");
       int num2=sc.nextInt();
        System.out.println("Introduce el tercer dato: ");
       int num3=sc.nextInt();
       obj.positivo(num1, num2, num3);
    }
    
}
