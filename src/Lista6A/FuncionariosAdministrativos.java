package Lista6A;

public class FuncionariosAdministrativos extends Funcionarios{

    String funcaoAdministrativa;
    String senoridade;

    public FuncionariosAdministrativos(){

    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenoridade() {
        return senoridade;
    }

    public void setSenoridade(String senoridade) {
        this.senoridade = senoridade;
    }
}
