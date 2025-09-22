import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Concessionaria concessionaria = new Concessionaria("Concessionaria Tres Irmãos");
        while(true) {

            Scanner input = new Scanner(System.in);

            System.out.println("\n=====Menu=====");
            System.out.println("1- Cadastro.\n" +
                    "2- Listar Clientes.\n" +
                    "3- Cadastrar Veiculos.\n" +
                    "4- Listar Veiculos Disponiveis.\n" +
                    "5- Realizar Vendas.\n" +
                    "6- Vendas Realizadas.\n" +
                    "7- Remover Cliente.\n" +
                    "8- Remover Veiculo.\n" +
                    "9- Filtrar Veiculo Por Marca.\n" +
                    "10- Filtrar Veiculo Por Modelo.");

            System.out.print("\nOpção: ");
            int opcao = input.nextInt();

            if (opcao == 1){
                input.nextLine();
                System.out.print("Digite seu nome: ");
                String nome = input.nextLine();
                System.out.print("Digite seu ID: ");
                int id = input.nextInt();
                input.nextLine();
                System.out.print("Digite seu telefone: ");
                String telefone = input.nextLine();
                System.out.print("Digite seu email: ");
                String email = input.nextLine();

                Cliente cliente1 = new Cliente(nome, id, telefone, email);
                boolean verificar = concessionaria.cadastrarCliente(cliente1);

                if (verificar){
                    System.out.println("\nUsuario cadastrado com sucesso.");
                }
                else {
                    System.out.println("\nEste ID já está cadastrado.");
                }
                continue;
            }


            if (opcao == 2){
                System.out.println("\n===Clientes Cadastrados===");
                concessionaria.listarClientes();
                continue;
            }

            if (opcao == 3){
                input.nextLine();
                System.out.print("Digite a marca do veiculo: ");
                String marca = input.nextLine();
                System.out.print("Digite o modelo do veiculo: ");
                String modelo = input.nextLine();
                System.out.print("Digite a placa do veiculo: ");
                String placa = input.nextLine();
                System.out.print("Digite o ano do veiculo: ");
                int ano = input.nextInt();
                System.out.print("Digite a disponibilidade do veiculo: ");
                boolean disponibilidade = input.nextBoolean();
                System.out.print("Digite o preço do veiculo: ");
                double preco = input.nextDouble();

                Veiculo v = new Veiculo(marca, modelo, placa, ano, disponibilidade, preco);
                concessionaria.adicionarVeiculos(v);
                System.out.println("\nVeiculo cadastrado com sucesso.");
                continue;
            }

            if(opcao == 4){
                System.out.println("\n===Veiculos Disponiveis===");
                concessionaria.listarVeiculosDisponiveis();
                continue;
            }

            if (opcao == 5){
                input.nextLine();
                System.out.print("Digite a placa: ");
                String placa = input.nextLine();
                System.out.print("Digite o ID do cliente: ");
                int id = input.nextInt();
                System.out.print("Digite a data da venda: ");
                String dataVenda = input.nextLine();
                input.nextLine();
                System.out.print("Digite a forma de pagamento: ");
                String pagamento = input.nextLine();
                System.out.print("Digite o valor: ");
                double valor = input.nextDouble();
                concessionaria.realizarVendas(placa, id, dataVenda, pagamento, valor);
                continue;
            }

            if (opcao == 6){
                System.out.println("\nVendas Realizadas");
                concessionaria.mostrarVendas();

                System.out.println("\nVeiculos Disponiveis Após a Venda");
                concessionaria.listarVeiculosDisponiveis();
            }

            if (opcao == 7){
                System.out.print("Digite o ID: ");
                int idRemover = input.nextInt();
                boolean remover = concessionaria.removerCliente(idRemover);
                if (remover){
                    System.out.println("\nCliente removido com sucesso.");
                }
                else {
                    System.out.println("\nCliente não encontrado.");
                }
                continue;
            }

            if (opcao == 8){
                input.nextLine();
                System.out.print("\nDigite a placa: ");
                String placa = input.nextLine();
                boolean remover = concessionaria.removerVeiculos(placa);
                if (remover){
                    System.out.println("Veiculo removido com sucesso.");
                }
                else {
                    System.out.println("Veiculo não encontrado.");
                }
                continue;
            }

            if (opcao == 9){
                input.nextLine();
                System.out.print("\nDigite a marca do veiculo: ");
                String marca = input.nextLine();
                concessionaria.filtrarVeiculoPorMarca(marca);
                continue;
            }

            if (opcao == 10){
                input.nextLine();
                System.out.print("\nDigite o modelo do veiculo: ");
                String modelo = input.nextLine();
                concessionaria.filtrarVeiculoPorModelo(modelo);
            }
        }
    }
}
