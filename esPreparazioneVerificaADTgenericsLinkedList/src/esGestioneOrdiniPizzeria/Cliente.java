package esGestioneOrdiniPizzeria;

public class Cliente {
    private String nome;
    private String cognome;
    private String email;
    private boolean buono_sconto;

    public Cliente(String nome, String cognome, String email, boolean buono_sconto) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.buono_sconto = buono_sconto;
    }
}
