package Lista6B;

import java.util.Scanner;

public class Triangulo extends FiguraGeometrica implements ElaboraFigura{



    @Override
    public void calculaArea() {
        double area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a medida da base do Triangulo");
         double base = entrada.nextDouble();
        System.out.println("Digite a medida da altura do Triangulo");
        double altura = entrada.nextDouble();

        area = (base * altura) /2;
        System.out.println("A área do triangulo é: " +area);
    }
}
