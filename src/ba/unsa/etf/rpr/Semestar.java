package ba.unsa.etf.rpr;

public class Semestar {
    private Predmet[] obavezni_predmeti;
    private Predmet[] izborni_predmeti;
    private int ukupni_ECTS;
    private int broj_predmeta;

    public Semestar (Predmet[] predmeti,int broj_predmeta,int ukupni_ECTS){
        this.broj_predmeta=broj_predmeta;
        for (int i=0; i<broj_predmeta; i++) {
            if (predmeti[i].jeLiObavezan()==true) obavezni_predmeti[i]=predmeti[i];
            else if (predmeti[i].jeLiObavezan()==false) izborni_predmeti[i]=predmeti[i];
            this.ukupni_ECTS=ukupni_ECTS;
        }
    }
}
