
package boletin5_4;


public class metodos {

    public metodos (){
    }
    public void difpeso(String nom1,String nom2,double peso1,double peso2){
        if(peso1>peso2){
            System.out.println(nom1+" Pesa mas que "+nom2+" La diferencia es de "+(peso1-peso2));
        }
        else{
            System.out.println(nom2+" Pesa mas que "+nom1+" La diferencia es de "+(peso2-peso1));
        }
    }
}
