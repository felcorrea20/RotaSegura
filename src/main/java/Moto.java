public class Moto extends Veiculo implements CalculoSeguro {

    private int cilindradas;

    public Moto(String placa, String modelo, int anoFabricacao, int cilindradas, double valor) {
        super(placa, modelo, anoFabricacao, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public boolean precisaManutencao() {
        return this.getQuilometragemAtual() >= 3000;
    }

    @Override
    public double calcularSeguro(double valor) {
        return getValor() * 0.05;
    }

}
