package entidades;

public class Freelancer extends Funcionario {
    private Double depesasAdicionais;

    public Freelancer() {
    }

    public Freelancer(String nome, Integer horas, Double valorHora, Double depesasAdicionais) {
        super(nome, horas, valorHora);
        this.depesasAdicionais = depesasAdicionais;
    }

    public Double getDepesasAdicionais() {
        return depesasAdicionais;
    }

    public void setDepesasAdicionais(Double depesasAdicionais) {
        this.depesasAdicionais = depesasAdicionais;
    }

    @Override
    public Double pagamento() {
        Double bonus = depesasAdicionais * 1.1;
        return super.pagamento() + bonus;
    }
}
