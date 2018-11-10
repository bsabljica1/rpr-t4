package ba.unsa.etf.rpr;

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
        for (int i=0; i<broj_studenata; i++) this.studenti[i]=new Student(studenti[i].dajIme(),studenti[i].dajPrezime(),studenti[i].dajBrojIndexa());
    }

    public Predmet (Predmet p) {
        studenti=new Student [30];
        this.naziv=p.naziv;
        this.ECTS=p.ECTS;
        this.obavezan=p.obavezan;
        this.broj_studenata=p.broj_studenata;
        for (int i=0; i<broj_studenata; i++) this.studenti[i]=new Student(p.studenti[i].dajIme(),p.studenti[i].dajPrezime(),p.studenti[i].dajBrojIndexa());
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
    public void upisiStudenta(Student student) {
        studenti[broj_studenata]=new Student(student.dajIme(),student.dajPrezime(),student.dajBrojIndexa());
        broj_studenata++;
    }
}
