import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        
        int NUMBER,HT;
        double HH,SALARY;
        
        NUMBER = teclado.nextInt();
        HT          = teclado.nextInt();
        HH          = teclado.nextDouble();

        SALARY = (HT * HH);


        System.out.println("NUMBER = " +NUMBER);
        System.out.printf("SALARY = U$ %.2f\n" ,SALARY);   


    }

}