package Lista6B;

import java.util.Scanner;

public class Quadrado extends FiguraGeometrica implements ElaboraFigura{

    public Quadrado() {

    }

    @Override
    public void calculaArea() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o lado do quadrado");
        double lado = entrada.nextDouble();
        System.out.println(" A área do quadrado é: "+ lado * lado);

    }
}
