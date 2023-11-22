package aula63.application;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        // DECLARAÇÃO DE VARIÁVEIS
        double xA;
        double xB;
        double xC;
        double yA;
        double yB;
        double yC;
        double pX;
        double pY;
        double areaX;
        double areaY;

        // INPUT DE VALORES DAS VARIÁVEIS

        System.out.println("Enter the measures for triangle X: ");
        xA = leia.nextDouble();
        xB = leia.nextDouble();
        xC = leia.nextDouble();

        System.out.println("Enter the measures for triangle Y: ");
        yA = leia.nextDouble();
        yB = leia.nextDouble();
        yC = leia.nextDouble();

        pX  = (xA + xB + xC) / 2;
        areaX = Math.sqrt(pX * (pX -xA) * (pX - xB) * (pX - xC));

        pY  = (yA + yB + yC) / 2;
        areaY = Math.sqrt(pY * (pY -yA) * (pY - yB) * (pY - yC));

        System.out.printf("Tiangle X area: %.4f%n", areaX);
        System.out.printf("Tiangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area: X");
        }
        else {
            System.out.println("Large area: Y");
        }

        leia.close();
    }
}
