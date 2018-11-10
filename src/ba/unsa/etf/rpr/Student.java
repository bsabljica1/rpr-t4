package ba.unsa.etf.rpr;

public class Student {
    private String ime;
    private String prezime;
    private int broj_indexa;
    private Semestar plan_studija;
    public Student (String ime, String prezime, int broj_indexa) {
        this.ime=ime;
        this.prezime=prezime;
        this.broj_indexa=broj_indexa;
    }
    public String dajIme() {return ime;}
    public String dajPreime(){return prezime;}
    public int dajBrojIndexa(){return broj_indexa;}
    public void ispisiStudenta(){
        System.out.println(ime+prezime);
    }
}
