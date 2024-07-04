package backend;

public class Adotante extends Pessoa {

    public Adotante(String nome, String cpf, String endereco, String email, String telefone) {
        super(nome, cpf, endereco, email, telefone);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public String getTelefone() {
        return super.getTelefone();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }
}