import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num1 = scanner.nextInt();

        int num2;
        do {
            System.out.println("Informe o segundo numero: ");
            num2 = scanner.nextInt();
            int resto = num2 % 2;
            if(resto != 0){
                break;
            }

        } while (num1 < num2);

    }
}





