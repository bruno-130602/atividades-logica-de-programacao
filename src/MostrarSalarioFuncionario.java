import java.util.Locale;
import java.util.Scanner;

public class MostrarSalarioFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nomeFunc = input.nextLine();

        System.out.print("Salário: ");
        double salario = input.nextDouble();

        System.out.println("O funcionario "+nomeFunc+" tem um salario de R$ "+salario);




        input.close();
    }
}
