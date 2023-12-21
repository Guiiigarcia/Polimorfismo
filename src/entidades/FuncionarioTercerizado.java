package entidades;

public class FuncionarioTercerizado extends Funcionario {
    private Double custoAdicional;

    public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHoras, Double custoAdicional) {
        super(nome, horas, valorPorHoras);
        this.custoAdicional = custoAdicional;
    }

    @Override
    public Double pagamentos() {
        return super.pagamentos() + custoAdicional * 1.1;
    }

    public Double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }
}
