package basics_oop.ch2;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getfName() {
        if (this.filme.length >= 2) {
            return this.nume;
        }
        return " ";
    }
}
