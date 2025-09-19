public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private boolean disponivel;
    private double preco;

    public Veiculo(String marca, String modelo, String placa, int ano, boolean disponivel, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.disponivel = disponivel;
        this.preco = preco;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public int getAno(){
        return ano;
    }

    public double getPreco(){
        return preco;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void mudarDisponibilidade(boolean status){
        this.disponivel = status;
    }

    @Override
    public String toString(){
        return "Veiculo{" +
                "Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Placa='" + placa +'\'' +
                ", Ano=" + ano +
                ", Preço=" + preco +
                ", Disponivel=" + (disponivel ? "SIM" : "NÃo") +
                '}';
    }
}
