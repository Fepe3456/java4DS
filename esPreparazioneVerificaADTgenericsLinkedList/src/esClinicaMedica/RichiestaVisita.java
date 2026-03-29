package esClinicaMedica;

public class RichiestaVisita {

    private Paziente paziente;
    private String specialita_medica;
    private boolean urgente; //true=sì, false=no

    public RichiestaVisita(Paziente paziente, String specialita_medica, boolean urgente) {
        this.paziente = paziente;
        this.specialita_medica = specialita_medica;
        this.urgente = urgente;
    }

    public Paziente getPaziente() {
        return paziente;
    }
    public String getSpecialita_medica() {
        return specialita_medica;
    }
    public boolean isUrgente() {
        return urgente;
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }
    public void setSpecialita_medica(String specialita_medica) {
        this.specialita_medica = specialita_medica;
    }
    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    @Override
    public String toString() {
        String str = "RichiesteVisita{";
        str += "\n   Paziente: " + paziente.toString();
        str += "\n   Specialità medica: " + specialita_medica;
        if(urgente){
            str += "\n   Urgente: sì";
        }
        else{
            str += "\n   Urgente: no";
        }
        str += "\n}";
        return str;
    }
}
