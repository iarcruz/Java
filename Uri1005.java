import java.util.Scanner;

public class Uri1005{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);

            double A,B,MEDIA,NotaA,NotaB;
                      
        
            A = teclado.nextDouble();
            B = teclado.nextDouble();

            NotaA = A*3.5;
            NotaB = B*7.5;

            MEDIA = (NotaA + NotaB)/11;
           
            System.out.printf ("MEDIA = %.5f\n" ,MEDIA);
            
            }

}