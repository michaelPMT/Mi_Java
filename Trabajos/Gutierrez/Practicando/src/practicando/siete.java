package practicando;

import java.util.Scanner;

public class siete {
    
    public static void main(String[] args) {
        
        int x;
        double suma=0,media;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Inserte la longitud del arreglo: ");
        x = leer.nextInt();
        
        double v[] = new double [x];
        
        for (int i=0;i<x;i++){
            
            System.out.println("Inserte un numero entero: ");
            v[i]= leer.nextInt();
            
            suma=suma+v[i];
            
        }
        
       
        media = suma/x;
        
        System.out.println("La media es "+media);
        
        
    }
    
}
