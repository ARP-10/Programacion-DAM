import java.util.Scanner;
public class GeografíaU4 {

    public static void main(String args []) {

        String [][] matriz =new String[4][4];
        String paises="";

        Scanner teclado = new Scanner(System.in);

        for (int i=0;i<4;i++){
            System.out.print("Introduce el nombre del pais "+(i+1)+" : ");
            matriz[i][0] = teclado.nextLine()+":";         
        }

        for (int j=0;j<4;j++){
            for (int i=1;i<4;i++){
                System.out.print("Introduce el nombre de la ciudad "+(i)+" del pais "+(j+1)+" : ");
                matriz[j][i] = teclado.nextLine();             
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                paises+= matriz[i][j]+"        ";
            }
            paises+="\n";
        }
        
        System.out.print(paises);

        teclado.close();
    }
}  
