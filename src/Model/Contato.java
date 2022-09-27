package Model;

public class Contato {

String id;
String numeroDeContato;
String email;

    public Contato(String id, String numeroDeContato, String email) {
        this.id = id;
        this.numeroDeContato = numeroDeContato;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNumeroDeContato() {
        return numeroDeContato;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Model.Contato{" +
                "id='" + id + '\'' +
                ", numeroDeContato='" + numeroDeContato + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
