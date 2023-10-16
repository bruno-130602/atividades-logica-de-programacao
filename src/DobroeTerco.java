import java.util.Locale;
import java.util.Scanner;

public class DobroeTerco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Insira aqui um número: ");
        double numero = input.nextDouble();

        double dobro = numero * 2;
        double terco = numero / 3;

        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("A terça parte de " + numero + " é " + terco);


        input.close();
    }
}
