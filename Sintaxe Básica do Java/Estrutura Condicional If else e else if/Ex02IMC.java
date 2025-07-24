import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Informe sua altura:");
           double altura = scanner.nextDouble();
        System.out.println("Informe seu peso:");
        int peso = scanner.nextInt();
            var message = "";
            double imc;
            imc = (peso/(altura * altura));

            if (imc <= 18.5 ){

                message = "Abaixo do peso";

            }else if(imc >= 18.6 && imc <= 24.9){

                message = "Peso ideal";

            }else if(imc >= 25.0 && imc <= 29.9) {

                message = "Levemente acima do peso";

            }else if(imc >= 30.0 && imc <= 34.9){

                message = "Obesidade grau I";

            } else if(imc >= 35.0 && imc <= 39.9){

                message = "Obesidade grau II";

            }

            else if(imc >= 40.0){

                message = "Obesidade grau III";

            }

            System.out.println("Seu IMC é "+ imc +" e voce está "+ message);


    }
    }



