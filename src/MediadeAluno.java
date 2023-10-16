import java.util.Locale;
import java.util.Scanner;

public class MediadeAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = input.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("A média entre "+nota1+" e "+nota2+" é igual a "+media);

    }
}
