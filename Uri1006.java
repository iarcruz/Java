import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        double A,B,C,MEDIA,NotaA,NotaB,NotaC;

        A = teclado.nextDouble();
        B = teclado.nextDouble();        
        C = teclado.nextDouble();


        NotaA = A*2;
        NotaB = B*3;
        NotaC = C*5;

        MEDIA = (NotaA + NotaB + NotaC) /10;

        System.out.printf ("MEDIA = %.1f\n" ,MEDIA);
    }
}