import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int h1,h2;
        int tempo=0;

        h1 = teclado.nextInt();
        h2 = teclado.nextInt();

        if (h1 == h2){
            System.out.println("O JOGO DUROU 24 HORAS(S)");
        }
        else if (h1 >= h2){
            tempo=(24-(h1-h2));
            System.out.printf("O JOGO DUROU %d HORA(S)\n", tempo);
        }
        else {
            tempo=(h2-h1);
            System.out.printf("O JOGO DUROU %d HORA(S)\n" ,tempo);
        }
    
    }
}