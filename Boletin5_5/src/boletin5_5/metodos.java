
package boletin5_5;


public class metodos {
            public metodos (){
    }
    
    public void positivo(int num1, int num2, int num3){
        if(num1>num2)
            if (num1>num3)
            {
          System.out.println(num1+" Es mayor que "+num2+" y "+num3); 
            }
        
            else{
            if(num2>num3)
                System.out.println(num2+" Es mayor que "+num3+" y "+num1);
            }
        else{
                System.out.println(num3+" Es mayor que "+num2+" y "+num1);
        }
        }
        
}

