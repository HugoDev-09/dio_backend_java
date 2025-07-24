import java.util.Scanner;

public class Main {
    private final static String Welcome_Message = "Informe seu nome: "; // Cria umainstancia, e se aparenta com uma mini função
    public static void main(String[] args) {
        //Comentário
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos voce tem?");
        var age = scanner.nextInt();
        System.out.println("Voce é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canNotDrive = age >= 18 || isEmancipated;
        System.out.printf("Voce pode dirigir? (%s)", !canNotDrive);
    }

    }



