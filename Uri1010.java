import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int Cdpeca,Cdpeca1,Numpeca,Numpeca1;
        double Valorpeca,Valorpeca1,VALORAPAGAR;

        Cdpeca = teclado.nextInt ();
        Numpeca = teclado.nextInt ();
        Valorpeca = teclado.nextDouble ();

        Cdpeca1 = teclado.nextInt ();
        Numpeca1 = teclado.nextInt ();
        Valorpeca1 = teclado.nextDouble ();

        VALORAPAGAR = (Numpeca*Valorpeca) + (Numpeca1*Valorpeca1);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n" ,VALORAPAGAR);

    }
}