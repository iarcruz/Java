import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int valor,resto;
        int cedula100,cedula50,cedula20,cedula10,cedula5,cedula2,cedula1;

        valor = teclado.nextInt ();

        cedula100 = valor / 100;
        resto     = valor % 100;

        cedula50  = resto / 50;
        resto     = resto % 50;
        
        cedula20  = resto / 20;
        resto     = resto % 20;
        
        cedula10  = resto / 10;
        resto     = resto % 10;
        
        cedula5   = resto / 5;
        resto     = resto % 5;
        
        cedula2   = resto / 2;
        cedula1     = resto % 2;
    
               
        
        System.out.println(valor);
        System.out.println(cedula100 + " nota(s) de R$ 100,00");
        System.out.println(cedula50 + " nota(s) de R$ 50,00");
        System.out.println(cedula20 + " nota(s) de R$ 20,00");
        System.out.println(cedula10 + " nota(s) de R$ 10,00");
        System.out.println(cedula5 + " nota(s) de R$ 5,00");
        System.out.println(cedula2 + " nota(s) de R$ 2,00");
        System.out.println(cedula1 + " nota(s) de R$ 1,00");


    }
}