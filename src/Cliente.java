public class Cliente {
    private String nome;
    private int id;
    private String telefone;
    private String email;

    public Cliente(String nome, int id, String telefone, String email){
        this.nome = nome;
        this.id = id;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Cliente = " +
                "Nome: " + nome +
                ", ID: " + id +
                ", Telefone: " + telefone +
                ", Email: " + email;
    }
}
