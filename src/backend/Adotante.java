package backend;

public class Adotante extends Pessoa {

    public Adotante(String nome, Integer id, String cpf, String endereco, String email, Long telefone){
        super(nome, id, cpf, endereco, email, telefone);
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
    public Long  getTelefone() {
        return super.getTelefone();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }


}
