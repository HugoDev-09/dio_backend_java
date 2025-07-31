import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número");
       int num1 = scanner.nextInt();
        System.out.println("Insira segundo número número");
        int num2 = scanner.nextInt();

        try {
            validação(num1, num2);
            for (int i = 0; num1 <= num2 ; num1++) {
                System.out.println("Inserindo o numero "+ num1);
            }

        } catch (  ParametrosInvalidosException ex){
            System.out.println(ex.getMessage());
        }

    }
    static void validação(int num1,int num2) throws ParametrosInvalidosException  {
        if(num1 >= num2){
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro!");
        }


    }

}
