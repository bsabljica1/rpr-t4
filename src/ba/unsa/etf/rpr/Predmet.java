package ba.unsa.etf.rpr;

import java.util.Arrays;

public class Predmet {
    private String naziv;
    private int ECTS;
    private boolean obavezan;
    private Student[] studenti;
    private int broj_studenata;

    public Predmet (String naziv, int ECTS, boolean obavezan,Student[] studenti, int broj_studenata){
        studenti=new Student [30];
        this.naziv=naziv;
        this.ECTS=ECTS;
        this.obavezan=obavezan;
        this.broj_studenata=broj_studenata;
        this.studenti=Arrays.copyOf(studenti,broj_studenata);
    }

    public Predmet (Predmet p) {
        studenti=new Student [30];
        this.naziv=p.naziv;
        this.ECTS=p.ECTS;
        this.obavezan=p.obavezan;
        this.broj_studenata=p.broj_studenata;
        this.studenti=Arrays.copyOf(p.studenti,p.broj_studenata);
    }

    public String dajNaziv(){return naziv;}
    public int dajECTS(){return ECTS;}
    boolean jeLiObavezan(){return obavezan;}
    public void ispisiPredmet(){System.out.println(naziv);}
    public void ispisiStudente(){
        for (int i=0;i<broj_studenata; i++) {
            System.out.println("Student "+i+":"+studenti[i].dajIme()+studenti[i].dajPrezime());
        }
    }
}
