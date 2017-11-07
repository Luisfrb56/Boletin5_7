
package boletin5_7;


public class Metodos {
    private final double pi=3.14;
    public void comparar(int sup, float l,float alt){
        
        switch(sup){
            case 1:System.out.println("Superficie do cadrado: "+l*l);
            break;
            case 2:System.out.println("Superficie do triangulo: "+l*alt/2);
            break;
            case 3:System.out.println("Superficie do circulo: "+pi*(l*l));
            break;
            default:System.out.println("Erro na opción");        
}
    }
}