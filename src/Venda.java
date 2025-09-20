public class Venda {
    public Veiculo veiculo;
    public Cliente cliente;
    private String dataVenda;
    private double valorVenda;
    private String formaPagamento;

    public Venda(Veiculo veiculo, Cliente cliente, String dataVenda, double valorVenda, String formaPagamento){
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
        this.formaPagamento = formaPagamento;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public String getDataVenda(){
        return dataVenda;
    }

    public double getValorVenda(){
        return valorVenda;
    }

    public String getFormaPagamento(){
        return formaPagamento;
    }

    @Override
    public String toString(){
        return "Venda{" +
                "Veiculo=" + veiculo.getModelo() + " (" + veiculo.getPlaca() + ")" +
                ", Cliente=" + cliente.getNome() +
                ", Data='" + dataVenda + '\'' +
                ", Valor=" + valorVenda +
                ", FormaPagamento='" + formaPagamento + '\'' + '}';
    }
}
