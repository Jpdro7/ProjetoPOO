public class Cliente {
    public String nome;
    public int id;
    public String telefone;
    public String email;

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

    public String getTelefone(){
        return telefone;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "Cliente{" +
                "Nome'" + nome + '\'' +
                ", ID=" + id +
                ", Telefone='" + telefone + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
