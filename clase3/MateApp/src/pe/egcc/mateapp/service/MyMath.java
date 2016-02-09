package pe.egcc.mateapp.service;
public class MyMath {

    private MyMath() {
    }
    
    public static long factorial(int n) {
        long f = 1;
        while(n>1){
            f *= n;
            n--;
        }
        return f;
    }
    
    public static int mcd(int n1 , int n2){
        return 0;
    }
    
    public static int mcm(int n1 , int n2){
        return 0;
    }
    
    /**
     * 
     * @param n1 El número de términos de la serie
     * @return 
     */
    public static String fibonacci(int n1){
        return "";
    }
    
    public static boolean primo(int n1){
        return false;
    }
}
