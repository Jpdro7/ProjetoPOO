import java.util.ArrayList;

public class Concessionaria {
    private String nome;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Venda> vendas;


    public Concessionaria(String nome) {
        this.nome = nome;
        this.veiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public boolean cadastrarCliente(Cliente cliente){
        for (Cliente c : clientes){
            if (c.getId() == cliente.getId()){
                return false;
            }
        }
        clientes.add(cliente);
        return true;
    }

    public boolean removerCliente(int idCliente){
        for (Cliente c : clientes){
            if (c.getId() == idCliente){
                clientes.remove(c);
                return true;
            }
        }
        return false;
    }

    public void listarClientes(){
        if(clientes.isEmpty()){
            System.out.println("\nNenhum cliente encontrado.");
        }
        else{
            for (Cliente c : clientes){
                System.out.println(c);
            }
        }
    }

    public boolean adicionarVeiculos(Veiculo v){
        for (Veiculo veic : veiculos){
            if(veic.getPlaca().equalsIgnoreCase(v.getPlaca())){
                return false;
            }
        }
        veiculos.add(v);
        return true;
    }

    public boolean removerVeiculos(String placa){
        for (Veiculo v : veiculos){
            if(v.getPlaca().equalsIgnoreCase(placa)){
                veiculos.remove(v);
                return true;
            }
        }
        return false;
    }

    public void listarVeiculosDisponiveis(){
        boolean encontrou = false;
        for (Veiculo v : veiculos){
            if(v.isDisponivel()){
                System.out.println(v);
                encontrou = true;
            }
        }
        if (!encontrou){
            System.out.println("\nNenhum veiculo disponivel.");
        }
    }

    public ArrayList<Veiculo> buscarVeiculoPorMarca(String marca){
        ArrayList<Veiculo> encontrados = new ArrayList<>();
        for (Veiculo v : veiculos){
            if (v.getMarca().equalsIgnoreCase(marca)){}
            encontrados.add(v);
        }
        return encontrados;
    }

    public ArrayList<Veiculo> buscarVeiculoPorModelo(String modelo){
        ArrayList<Veiculo> encontrados = new ArrayList<>();
        for (Veiculo v : veiculos){
            if(v.getModelo().equalsIgnoreCase(modelo)){
                encontrados.add(v);
            }
        }
        return encontrados;
    }

    public boolean realizarVendas(String placa, int idCliente, String dataVenda, String formaPagamento, double valor){
        Veiculo veiculoVendido = null;
        Cliente clienteComprador = null;

        for (Veiculo v : veiculos){
            if (v.getPlaca().equalsIgnoreCase(placa) && v.isDisponivel()){
                veiculoVendido = v;
                break;
            }
        }

        if (veiculoVendido == null) {
            System.out.println("\nVeiculo não encontrado ou não disponivel.");
            return false;
        }

        for (Cliente c : clientes){
            if (c.getId() == idCliente){
                clienteComprador = c;
                break;
            }
        }

        if (clienteComprador == null){
            System.out.println("\nCliente não encontrado.");
            return false;
        }

        Venda novaVenda = new Venda(veiculoVendido, clienteComprador, dataVenda, valor, formaPagamento);
        vendas.add(novaVenda);

        veiculoVendido.mudarDisponibilidade(false);
        System.out.println("\nVeiculo vendido.");
        return true;
    }

    public void mostrarVendas(){
        if (vendas.isEmpty()){
            System.out.println("\nNenhuma venda realizada ainda.");
        }
        else {
            for (Venda v : vendas){
                System.out.println(v);
            }
        }
    }
}