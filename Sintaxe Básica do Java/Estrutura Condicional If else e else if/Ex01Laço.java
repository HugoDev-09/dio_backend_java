import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero e retornarei a tabuada dele: ");
        int num = scanner.nextInt();
        System.out.println("Tabuada do número informado:");
        for (int i = 0; i < 11; i++ ) {
            System.out.println(num * i);
        }

	  }
    }



