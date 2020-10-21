import java.util.Scanner;

public class Exercicio2b{
        public static void main(String args[]){
            Scanner teclado;
            teclado = new Scanner(System.in);
    
            float area, altura, area;
            
            //entrada >> incluir base
            System.out.println ("Por favor, digite valor da base");
            base = teclado.nextFloat();

            //entrada >> incluir altura
            System.out.println ("Por favor, digite valor da altura");
            altura = teclado.nextFloat();

            //processamento >> calcular a area
            area = base * altura;

            //saída >> exibir o valor
            System.out.println ("Valor do trinagilo =" +area);
            
            }