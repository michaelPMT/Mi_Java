package practicando;

import java.util.Scanner;

public class tres {

    public static void main(String[] args) {
        
        
        System.out.println("Inserte un numero : ");
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        num = leer.nextInt();
        
        int resto;
        
        resto = num%2;
        
        if(resto==0){
        
            System.out.println("Este numero es par.");}
            
        else
                {
            System.out.println("Este numero es impar.");
                    }
        
        
    }
    
}
