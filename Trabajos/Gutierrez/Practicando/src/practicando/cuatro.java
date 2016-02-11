package practicando;

import java.util.Scanner;

public class cuatro {
    
    public static void main(String[] args) {
        
        //Comprobar si un numero es primo...
        
        int a,i;
        boolean resultado = true;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Inserte un numero: ");
        a = leer.nextInt();
        
        for(i=2;i<a;i++){
            
            if (a%i==0){
                
                resultado = false;
                
            }
        }
        
        if (resultado){
            
            System.out.println("El numero es primo.");
            
        }
        else {
            System.out.println("El numero no es primo.");
        }
        
    }
    
    
    
    
}
