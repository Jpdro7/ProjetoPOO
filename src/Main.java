public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria("Concessionaria Tres Irmãos");

        Cliente cliente1 = new Cliente("João Pedro Almeida", 1, "(83) 9.9951-3927", "almeidanunesjoaopedro2@gmail.com");
        Cliente cliente2 = new Cliente("Edglan Xavier", 2, "(83) 9.8118-8121", "edglanxavier@gmail.com");
        Cliente cliente3 = new Cliente("Gabriel Moreira", 3, "(83) 9.9841-9980", "gabrielmoreira@gmail.com");

        concessionaria.cadastrarCliente(cliente1);
        concessionaria.cadastrarCliente(cliente2);
        concessionaria.cadastrarCliente(cliente3);

        System.out.println("Clientes Cadastrados");
        concessionaria.listarClientes();

        Veiculo v1 = new Veiculo("Ferrari", "La Ferrari", "FER1A23", 2013, true, 3800000.0);
        Veiculo v2  = new Veiculo("Porsche", "911 Cabriolet", "PRS3C45", 2025, true, 150000.0);
        Veiculo v3  = new Veiculo("Lamborghine", "Revuelto", "LAM6B78", 2025, true, 736900.0);

        concessionaria.adicionarVeiculos(v1);
        concessionaria.adicionarVeiculos(v2);
        concessionaria.adicionarVeiculos(v3);

        System.out.println("\nVeiculos Disponiveis");
        concessionaria.listarVeiculosDisponiveis();

        concessionaria.realizarVendas("FER1A23", 1, "20/09/2025", "Á Vista", 3800000.0);

        System.out.println("\nVendas Realizadas");
        concessionaria.mostrarVendas();

        System.out.println("\nVeiculos Disponiveis Após a Venda");
        concessionaria.listarVeiculosDisponiveis();
    }
}
