package pe.egcc.mateapp.service;

public class MyMath {

    private MyMath() {
    }

    public static long factorial(int n) {
        long f = 1;
        while (n > 1) {
            f *= n;
            n--;
        }
        return f;
    }

    public static int mcd(int n1, int n2) {
        /**
         * int min, mcd=0; if (n1 < n2 ){ min = n1; }else{ min = n2; } for(int i
         * = 1; i < min; i++){ if(n1 % i == 0 && n2 % i == 0){ mcd = i; }
        }
         */

        int mcd = 0;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        do {
            mcd = b;
            b = a % b;
            a = mcd;
        } while (b != 0);
        return mcd;
    }

    public static int mcm(int n1, int n2) {
        int mcm = 0;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        mcm = (a / mcd(a, b)) * b;
        return mcm;
    }

    /**
     *
     * @param n El número de términos de la serie
     * @return
     */
    public static String fibonacci(int n) {
        if ((n == 0) || (n == 1)) {
            return "1";
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static boolean primo(int n1) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != n1)) {
            if (n1 % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;

    }
}
