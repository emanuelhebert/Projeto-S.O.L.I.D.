package Model;

public class ClienteJuridico {

    String id;
    String cnpj;
    String razaoSocial;
    String nomeFantasia;
    IndicadorInscricaoEstadual indicadorInscricaoEstadual;
    String inscricaoEstadual;
    String inscricaoMunicipal;

    public ClienteJuridico(String id,
                           String cnpj,
                           String razaoSocial,
                           String nomeFantasia,
                           IndicadorInscricaoEstadual indicadorInscricaoEstadual,
                           String inscricaoEstadual,
                           String inscricaoMunicipal) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.indicadorInscricaoEstadual = indicadorInscricaoEstadual;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public IndicadorInscricaoEstadual getIndicadorInscricaoEstadual() {
        return indicadorInscricaoEstadual;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    @Override
    public String toString() {
        return "Model.ClienteJuridico{" +
                "id='" + id + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", indicadorInscricaoEstadual=" + indicadorInscricaoEstadual +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", inscricaoMunicipal='" + inscricaoMunicipal + '\'' +
                '}';
    }
}
