package ba.unsa.etf.rpr;

public class Student extends PlanStudija {
    private String ime;
    private String prezime;
    private int broj_indexa;
    public Student (String ime, String prezime, int broj_indexa,PlanStudija p) {
        super(p);
        this.ime=ime;
        this.prezime=prezime;
        this.broj_indexa=broj_indexa;
    }

    public String dajIme() {return ime;}
    public String dajPrezime(){return prezime;}
    public int dajBrojIndexa(){return broj_indexa;}
    public void ispisiStudenta(){
        System.out.println(ime+prezime);
    }
}
