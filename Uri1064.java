import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float num;
        int qtdPositivo = 0;
        float media, soma;

        soma = 0;

        for (int cont=1; cont <=6; cont++){
            num = teclado.nextFloat();
            if (num > 0){
                qtdPositivo++;
                soma = soma + num;
            }
        }
        media = soma / qtdPositivo;
        System.out.println(qtdPositivo + " valores positivos");
        System.out.printf("%.1f\n", media);            

    }
}