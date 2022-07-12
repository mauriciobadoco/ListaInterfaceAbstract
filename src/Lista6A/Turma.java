package Lista6A;

public class Turma {

    int alunos;

    public Turma(String nome, Professores nivelGraduacao,  int alunos) {

        if ((alunos >40) && (nivelGraduacao.equals("Doutorado"))) {
            System.out.println("O professor: " + nome + "Pode assumir a turma");
        } else if (((alunos > 20) && (alunos <=40)) && (!(nivelGraduacao.equals("licenciatura")))){
            System.out.println("O professor: " + nome + "Pode assumir a turma");
        }else{
            System.out.println("O professor: " + nome + "Pode assumir a turma");
        }
    }
}
