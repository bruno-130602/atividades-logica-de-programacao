import java.util.Scanner;

public class SomaEntreNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num1 = input.nextInt();
        System.out.print("Insira outro número: ");
        int num2 = input.nextInt();

        int soma = num1 + num2;

        System.out.print("A soma entre "+num1+" e "+num2+" é igual a "+soma);

        input.close();
    }
}
