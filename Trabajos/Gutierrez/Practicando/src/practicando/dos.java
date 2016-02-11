package practicando;

import java.util.Scanner;


public class dos {

    public static void main(String[] args) {
        int a,b,s;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Inserte el primer numero : ");
        
        a = leer.nextInt();
        
        System.out.println("Inserte el siguiente sumando : ");
        
        b = leer.nextInt();
        
        s = a+b;
        
        System.out.println("El resultado es "+s);
        
        if(s<30){
        
        System.out.println("Y es menor de 30");
    }
        
        else{
        
        System.out.println("Y es mayor de 30");
       
        }
        
        
    }
    
}
    