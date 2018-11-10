package ba.unsa.etf.rpr;

public class Predmet {
    private String naziv;
    private int ECTS;
    private boolean obavezan;
    private Student[] studenti;
    private int broj_studenata;

    public Predmet (String naziv, int ECTS, boolean obavezan,Student[] studenti, int broj_studenata){
        this.naziv=naziv;
        this.ECTS=ECTS;
        this.obavezan=obavezan;
        this.studenti=studenti;
        this.broj_studenata=broj_studenata;
    }
    public String dajNaziv(){return naziv;}
    public int dajECTS(){return ECTS;}
    boolean jeLiObavezan(){return obavezan;}
    public void ispisiPredmet(){System.out.println(naziv);}
    public void ispisiStudente(){
        for (int i=0;i<broj_studenata; i++) {
            System.out.println("Student "+i+":"+studenti[i].dajIme()+studenti[i].dajPreime());
        }
    }
    public void upisiStudenta(Student student) {
        studenti[broj_studenata]=new Student(student.dajIme(),student.dajPreime(),student.dajBrojIndexa());
        broj_studenata++;
    }
}
