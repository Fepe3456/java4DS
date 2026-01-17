public class Lupo extends Animale {

    private int giornoNascita;
    private int meseNascita;
    private int annoNascita;
    private String nomeBranco;

    Lupo(String nome, float peso, char sesso, int giornoNascita, int meseNascita, int annoNascita, String nomeBranco){
        super(nome, peso, sesso);
        this.giornoNascita = giornoNascita;
        this.meseNascita = meseNascita;
        this.annoNascita = annoNascita;
        this.nomeBranco = nomeBranco;
    }


    //Overriding metodi abstract
    int calcolaEta() {
        return (2025-annoNascita);
    }

    String rappresentazioneTestuale() {
        String str = "Il lupo si chiama " + nome + ", pesa " + peso + "kg, è di sesso " + sesso +
                ", è nato il giorno " + giornoNascita +"/" + meseNascita + "/" + annoNascita +", ed appartiene al branco " + nomeBranco;
        return str;
    }

    String ottieniVerso() {
        return "Auuuuuh!";
    }

}

/*
Una classe Lupo che possiede le caratteristiche di un Animale e in più possiede:
    dataNascita (formato: giorno, mese, anno)
    nome branco
* */