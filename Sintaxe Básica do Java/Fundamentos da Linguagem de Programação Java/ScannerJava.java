import java.util.Scanner;

public class Main {
    private final static String Welcome_Message = "Informe seu nome: "; // Cria umainstancia, e se aparenta com uma mini função
    public static void main(String[] args) {
        // Comentário
        Scanner scanner = new Scanner(System.in); // Declaro a variavel -- Tipando a variavel
        System.out.println(Welcome_Message);
        String nome = scanner.next();
        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Ola, seu nome é : " + nome);
        System.out.println("Sua idade é : " + idade);
        }

    }



