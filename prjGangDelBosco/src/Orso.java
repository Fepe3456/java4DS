public class Orso extends Animale {

    private int giornoNascita;
    private int meseNascita;
    private int annoNascita;
    private boolean radiocollare;

    Orso(String nome, float peso, char sesso, int giornoNascita, int meseNascita, int annoNascita, boolean radiocollare){
        super(nome, peso, sesso);
        this.giornoNascita = giornoNascita;
        this.meseNascita = meseNascita;
        this.annoNascita = annoNascita;
        this.radiocollare = radiocollare;
    }


    //Overriding metodi abstract
    int calcolaEta() {
        return (2025-annoNascita);
    }

    String rappresentazioneTestuale() {
        String str = "L'orso si chiama " + nome + ", pesa " + peso + "kg, è di sesso " + sesso +
                ", è nato il giorno " + giornoNascita +"/" + meseNascita + "/" + annoNascita;
        if(radiocollare){
            str += "ed attualmente indossa un radiocollare";
        } else{
            str += "ed attualmente non indossa un radiocollare";
        }
        return str;
    }

    String ottieniVerso() {
        return "Roar!";
    }

}

/*
Una classe Orso che possiede le caratteristiche di un Animale e in più possiede:
    dataNascita (formato: giorno, mese, anno)
    radiocollare (si/no)
* */