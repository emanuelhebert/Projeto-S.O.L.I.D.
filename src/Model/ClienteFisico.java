package Model;
import Model.Cliente;
public class ClienteFisico extends Cliente {

    public ClienteFisico(String id, Contato contato, Endereco endereco, Boolean clienteAtivo, String cadastradoEm) {
        super(id, contato, endereco, clienteAtivo, cadastradoEm);
    }

    String id;
    String nomeCompleto;
    String cpf;
    float rg;
    Sexo sexo;
    String nascimento;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getRg() {
        return rg;
    }

    public void setRg(float rg) {
        this.rg = rg;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Model.ClienteFisico{" +
                "id='" + id + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg=" + rg +
                ", sexo=" + sexo +
                ", nascimento='" + nascimento + '\'' +
                '}';
    }
}
