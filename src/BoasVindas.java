import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é seu nome? ");
        String nome = input.nextLine();
        System.out.println("Olá "+nome+", é um prazer te conhecer!");

        input.close();
    }
}
