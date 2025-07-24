import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var value = 6;
        var binary1 = Integer.toBinaryString(value);
       System.out.printf("Primeiro número da operação  %s  (representação binária %s)\n",value,binary1);
        var value2 = 3;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação  %s  (representação binária %s)\n",value2,binary2);
        var result = value ^ value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s ^ %s  = %s (representação binária  %s) \n",value,value2,result, binary2);
        var result2 = value;
        var binaryResult2 = Integer.toBinaryString(result2);
        
        //System.out.printf(" %s << %s = %s (representação binária  %s) \n",value,result3,binaryResult3);

    }
}


