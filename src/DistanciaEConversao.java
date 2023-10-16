import java.util.Locale;
import java.util.Scanner;

public class DistanciaEConversao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite aqui uma distância em metros: ");
        double metro = input.nextDouble();

        /*Multiplos de Metros*/
        double quilometro = metro / 1000;
        double hectometro = metro / 100;
        double decametro = metro / 10;

        /*Submultiplos de Metros*/
        double decimetro = metro * 10;
        double centimetro = metro * 100;
        double milimetro = metro * 1000;

        System.out.println("A distância de " + metro + "m correspode a: ");
        System.out.println(quilometro + "Km" + "\t\t" + decimetro + "dm");
        System.out.println(hectometro + "Hm" + "\t\t" + centimetro + "cm");
        System.out.println(decametro + "Dam" + "\t\t" + milimetro + "mm");
        /*Compreendido o \t como */


        input.close();
    }
}
