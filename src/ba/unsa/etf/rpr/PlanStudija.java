package ba.unsa.etf.rpr;


public class PlanStudija extends Semestar {
    private Predmet[] izborni_predmeti;
    private int broj_izbornih;
    private int ECTS_izbornih;
    private int brojPlana;


    PlanStudija (Predmet[] predmeti,int broj_predmeta, int ECTS, int brojPlana) {
        super(predmeti,broj_predmeta,ECTS,brojPlana);
        izborni_predmeti=new Predmet[5];
        broj_izbornih=0;
        for (int i=0; i<broj_predmeta; i++) {
            if (predmeti[i].jeLiObavezan()==false){
                izborni_predmeti[broj_izbornih]=new Predmet(predmeti[i]);
                broj_izbornih++;
            }
            this.ECTS_izbornih=ECTS;
        }
    }

    PlanStudija (PlanStudija p) {
        super(p);
        izborni_predmeti=new Predmet[5];
        broj_izbornih=0;
        for (int i=0; i<p.broj_izbornih; i++) {
                izborni_predmeti[broj_izbornih]=new Predmet(izborni_predmeti[i]);
                broj_izbornih++;
            this.ECTS_izbornih=p.ECTS_izbornih;
        }
    }

    public int getBrojPlana() {
        return brojPlana;
    }
}
