package Lista6A;

public abstract  class Funcionarios {
    private String nome;
    private double cpf;
    private double numRegistro;
    private String orgãoLotacao;
    private double salario;

    public double aumentoSalario( ){
        double salAtual = 0;
        salAtual = this.getSalario() * 1.1;
        return salAtual;
    }

    public void Funcionarios(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(double numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrgãoLotacao() {
        return orgãoLotacao;
    }

    public void setOrgãoLotacao(String orgãoLotacao) {
        this.orgãoLotacao = orgãoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
