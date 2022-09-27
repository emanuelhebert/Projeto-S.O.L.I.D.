package Model;

public class Sexo {

String id;
String orientacaoSexual;

    public Sexo(String id,
                String orientacaoSexual) {
        this.id = id;
        this.orientacaoSexual = orientacaoSexual;
    }

    public String getId() {
        return id;
    }

    public String getOrientacaoSexual() {
        return orientacaoSexual;
    }

    @Override
    public String toString() {
        return "Model.Sexo{" +
                "id='" + id + '\'' +
                ", orientacaoSexual='" + orientacaoSexual + '\'' +
                '}';
    }
}
