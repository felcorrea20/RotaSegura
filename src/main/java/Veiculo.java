public abstract class Veiculo {

    private final String placa;
    private String modelo;
    private final int anoFabricacao;
    private double quilometragemAtual;
    private double valor;
    private SituacaoVeiculo situacao = SituacaoVeiculo.DISPONIVEL;

    public Veiculo(String placa, String modelo, int anoFabricacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragemAtual = 0;
    }

    public Veiculo(String placa, String modelo, int anoFabricacao, double valor) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragemAtual = 0;
        this.valor = valor;
    }

    public double getQuilometragemAtual() {
        return quilometragemAtual;
    }

    public double getValor() {
        return valor;
    }

    public void registrarRota(double quilometragem) {

        this.situacao = SituacaoVeiculo.EM_ROTA;

        if (quilometragem < 0) {
            throw new QuilometragemNegativaException();
        }

        this.quilometragemAtual += quilometragem;

        if (precisaManutencao()) {
            this.situacao = SituacaoVeiculo.MANUTENCAO;
        } else {
            this.situacao = SituacaoVeiculo.DISPONIVEL;
        }

    }

    public abstract boolean precisaManutencao();

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", quilometragemAtual=" + quilometragemAtual +
                ", valor=" + valor +
                '}';
    }
}


