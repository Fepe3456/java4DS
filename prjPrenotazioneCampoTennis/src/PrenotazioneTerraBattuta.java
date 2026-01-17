public class PrenotazioneTerraBattuta extends PrenotazioneCampo{

    PrenotazioneTerraBattuta(String nomeGiocatore, Data data, Orario oraInizio, Orario oraFine){
        super(nomeGiocatore, data, oraInizio, oraFine);
    }

    @Override
    public float calcolaCosto() {
        return 15 * oraInizio.calcolaOreTraOrarioENuovoOrario(oraFine);
    }
}

/*
Ognuna implementa calcolaCosto() in modo diverso, ad esempio:
    Terra battuta → 15 €/ora
    Erba sintetica → 18 €/ora
    Coperta → 25 €/ora
* */