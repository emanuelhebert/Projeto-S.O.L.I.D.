package Model;

public class Endereco {
    String id;
    String cep;
    String uf;
    String cidade;
    String bairro;
    String logradouro;
    String complemento;

    public Endereco(String id,
                    String cep,
                    String uf,
                    String cidade,
                    String bairro,
                    String logradouro,
                    String complemento) {
        this.id = id;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }

    public String getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    @Override
    public String toString() {
        return "Model.Endereco{" +
                "id='" + id + '\'' +
                ", cep='" + cep + '\'' +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
