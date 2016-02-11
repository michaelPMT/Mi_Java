package pe.amgl.proyecto2.service;


public final class Codigos {
    
    public static long factorial(int n){
    
        long f = 1;
        
        while(n>0){
            
        f = f*n;
        n--;
        }
    
        return f;
}
    
    
}
