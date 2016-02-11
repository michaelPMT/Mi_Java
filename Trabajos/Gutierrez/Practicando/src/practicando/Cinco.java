package practicando;

public class Cinco {
    public static void main(String[] args) {
        
       //Encontrar cuantos numeros primos hay entre 1 y 200
       
       int i,j;
       boolean resultado = true;
       
       for (i=1;i<200;i++){
           
           resultado=true;
           
           for(j=2;j<i;j++){
               
               if(i%j==0){
                   
                   resultado = false;
                   
               }
               
               
           }
           
           if (resultado){
               
               System.out.print(i+", ");
      
           }
           
       }
       
       
        
    }
    
    
    
}
