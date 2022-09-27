package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente(
                "1.146.478",
                new Contato("1.456.845",
                        "(83)35316496",
                        "lucianocopias@gmail.com.br"),
                new Endereco("1.456.845",
                        "58900000",
                        "PB",
                        "Cajazeiras",
                        "Centro",
                        "R. Sebastião Bandeira de Melo, 242",
                        "Casa"),
                true,
                "16/01/2002"


        );

        System.out.println(cliente);
    }
}
