import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int senha, valor;
        senha = 2002;
        
        do{
            valor = teclado.nextInt();
            if (valor != senha){
                System.out.println("Senha invalida");
            }
            else{
                System.out.println("Acesso permitido");
            }
        }
        while (valor != senha);

    }

}