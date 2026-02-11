public class Caminhao extends Veiculo implements CalculoSeguro {

    private double capacidadeCarga = 0;
    private int quantidadeEixos;

    public Caminhao(String placa, String modelo, int anoFabricacao, int capacidadeCarga,
                    int quantidadeEixos, double valor) {
        super(placa, modelo, anoFabricacao, valor);
        this.capacidadeCarga = capacidadeCarga;
        this.quantidadeEixos = quantidadeEixos;
    }

    public void registrarRota(double quilometragem, double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
        registrarRota(quilometragem);
    }

    @Override
    public boolean precisaManutencao() {
        return (getQuilometragemAtual() > 10000 || capacidadeCarga > 500);
    }


    @Override
    public double calcularSeguro(double valor) {
        return (getValor() * 0.02) + (capacidadeCarga * 50);
    }
}
