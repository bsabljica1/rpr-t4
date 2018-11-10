package ba.unsa.etf.rpr;

public class Semestar {
    private int broj_semestra;
    private Predmet[] obavezni_predmeti;
    private int ukupni_ECTS;
    private int broj_obaveznih;

    public Semestar (Predmet[] predmeti,int broj_predmeta,int ukupni_ECTS,int broj_semestra){
        obavezni_predmeti=new Predmet[5];
        for (int i=0; i<broj_predmeta; i++) {
             if (predmeti[i].jeLiObavezan()==true){
                obavezni_predmeti[broj_obaveznih]=new Predmet(predmeti[i]);
                broj_obaveznih++;
            }
            this.broj_semestra=broj_semestra;
            this.ukupni_ECTS=ukupni_ECTS;
        }
    }

    public Semestar(Semestar s) {
        obavezni_predmeti=new Predmet[5];
        for (int i=0; i<s.broj_obaveznih; i++) {
            if (s.obavezni_predmeti[i].jeLiObavezan()==true){
                obavezni_predmeti[broj_obaveznih]=new Predmet(obavezni_predmeti[i]);
                broj_obaveznih++;
            }
            this.broj_semestra=broj_semestra;
            this.ukupni_ECTS=ukupni_ECTS;
        }
    }

    public int dajBrojSemestra() {
        return broj_semestra;
    }

    public int dajECTSBodovi() {
        return ukupni_ECTS;
    }
}
