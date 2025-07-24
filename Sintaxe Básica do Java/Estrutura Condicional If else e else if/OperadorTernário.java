import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            var scanner = new Scanner(System.in);
            System.out.println("Informe seu nome: ");
            var nome = scanner.next();
            System.out.println("Informe sua idade: ");
            var age = scanner.nextInt();

            var canDrive = (age >= 18);
            var message = canDrive ?
                    nome + ", Voce pode dirigir":
                    nome + ", Voce nao pode dirigir";

            System.out.println(message);




    }
}


