
package boletin5_6;


public class metodos {
    public void metodos(){
  }
    
    
   public void comercio(String nomart,int vanuais){
       if (vanuais<=100){
           System.out.println(nomart+ " Baixo");
       }
       else{
           if(vanuais>100 && vanuais<=500){
               System.out.println(nomart+ " Medio");
           }
           else{
               if(vanuais>500 && vanuais<=1000){
                   System.out.println(nomart+ " Alto");
               }
               else{
                   System.out.println(nomart+ " Primeira necesidad");
               }
           }    
       }
   }
}
