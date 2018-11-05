package ba.unsa.etf.rpr;

public class Predmet {
    private String naziv;
    private int ECTS;
    private boolean obavezan;
    private Student[] studenti;

    public Predmet (String naziv, int ECTS, boolean obavezan,Student[] studenti){}
    public String dajNaziv(){return null;}
    public int dajECTS(){return 0;}
    boolean jeLiObavezan(){return false;}
    public String ispisiPredmet(){return null;}
    public String ispisiStudente(){return null;}
}
