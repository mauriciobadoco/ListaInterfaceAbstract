package Lista6A;

public class Professores extends Funcionarios {

    String nivelGraduacao;
    String disciplina;
    int qtdAlunos;
    int qtdTurma;


    public void adicionaTurma (int addTurma){
        this.qtdTurma =+ addTurma;
        System.out.println(" Turmas do professor: "+ this.qtdTurma);
    }

    public Professores(){

    }

    public Professores(String nivelGraduacao, String disciplina, int qtdAlunos, int qtdTurma) {
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurma = qtdTurma;

    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurma() {
        return qtdTurma;
    }

    public void setQtdTurma(int qtdTurma) {
        this.qtdTurma = qtdTurma;
    }

}
