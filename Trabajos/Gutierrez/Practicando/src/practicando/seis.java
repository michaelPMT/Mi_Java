package practicando;

import java.util.Scanner;

public class seis {
    
    public static void main(String[] args) {
        
        int[] a = new int[5];
        int i;
        
        Scanner leer = new Scanner(System.in);
        
        for (i=0;i<5;i++){
            System.out.println("Inserte un valor: ");
            a[i]=leer.nextInt();
            
        }
        
        for (i=0;i<5;i++){
            
            System.out.print(a[i]+", ");
        }
        
        
        
    }
    
}
