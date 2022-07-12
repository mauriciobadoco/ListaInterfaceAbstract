package Lista6A;

public class Coordenadores  extends Funcionarios{

    int professoresSupervisionados;

    public Coordenadores(){
    }
    public double aumentoSalario(){
        double salAtual = 0;
        salAtual = this.getSalario() *1.05;
        return salAtual;
    }
    public void adicionaProfessor(){
        if( this.professoresSupervisionados <= 15){
            this.professoresSupervisionados += 1;
            System.out.println("Novo professor adicionado: " + this.professoresSupervisionados);
        }else {
            System.out.println("A quantidade de professores supervisionados atingiu o limite");
        }

    }


    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
