public class Morse {
    
    public static void main(String[] args) {
        System.out.println(convierteMorse(213));
    }

    public static String convierteMorse(int a){

        String[] codigo = {
            " _ _ _ _ _ ", " . _ _ _ _ ", " . . _ _ _ ", " . . . _ _ ", " . . . . _ ", " . . . . . ", " _ . . . . ", " _ _ . . . ", " _ _ _ . . ", " _ _ _ _ . "
        };

        String resultado = codigo[a%10];
        a = a/10; 

        while (a > 0) {
            int resto = a % 10;
            resultado = codigo[resto] + resultado;
            a = a/10;
        }

        return resultado;
    }

     

}
