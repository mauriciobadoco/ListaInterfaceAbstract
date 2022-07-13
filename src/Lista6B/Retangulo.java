package Lista6B;

import java.util.Scanner;

public class Retangulo extends FiguraGeometrica implements ElaboraFigura{


    @Override
    public void calculaArea() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um lado do retangulo");
        double ladoA = entrada.nextDouble();
        System.out.println("Digite o outro lado: ");
        double ladoB = entrada.nextDouble();
        System.out.println("A area do retangulo é: " + ladoA *ladoB);

    }
}
