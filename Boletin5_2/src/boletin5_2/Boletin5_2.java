
package boletin5_2;

import java.util.Scanner;


public class Boletin5_2 {

    
    public static void main(String[] args) {
    metodos obj =new metodos();
    Scanner sc=new Scanner(System.in);
        System.out.println("Dato 1: ");
    short num1=sc.nextShort();
        System.out.println("Dato 2: ");
    short num2=sc.nextShort();
    obj.positivo(num1, num2);
        
    }
    
}
