package Model;

public class Cliente {
    String id;
    Contato contato;
    Endereco endereco;
    Boolean clienteAtivo;
    String cadastradoEm;

    public Cliente(String id, Contato contato, Endereco endereco, Boolean clienteAtivo, String cadastradoEm) {
        this.id = id;
        this.contato = contato;
        this.endereco = endereco;
        this.clienteAtivo = clienteAtivo;
        this.cadastradoEm = cadastradoEm;
    }

    public String getId() {
        return id;
    }

    public Contato getContato() {
        return contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Boolean getClienteAtivo() {
        return clienteAtivo;
    }

    public String getCadastradoEm() {
        return cadastradoEm;
    }

    @Override
    public String toString() {
        return "Model.Cliente{" +
                "id='" + id + '\'' +
                ", contato=" + contato +
                ", endereco=" + endereco +
                ", clienteAtivo=" + clienteAtivo +
                ", cadastradoEm='" + cadastradoEm + '\'' +
                '}';
    }
}
