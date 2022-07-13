package Lista6B;
import java.util.Scanner;

public class Circulo extends FiguraGeometrica implements  ElaboraFigura{

    double raio;


    @Override
    public void calculaArea() {
        double area =0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o diametro do círculo");
        raio = entrada.nextDouble() /2;
        area = 3.14 *raio*raio;

        System.out.println(" A área do circulo é:" + area);
    }
}
