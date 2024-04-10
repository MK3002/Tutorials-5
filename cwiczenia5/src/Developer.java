import java.util.ArrayList;
import java.util.List;
public class Developer {
    public String imie;
    public String nazwisko;
    public String pesel;
    public String email;
    public String adres;
    public int rokzatrudnienia;
    public int bonus;
    public int pensja =3000;
    public ArrayList<Double> technologie;

    public double obliczPensję() {
        if (technologie.size() == 1) {
            bonus = 800;
        }
        if (technologie.size()==2) {
            bonus=1600;
        }
        if (technologie.size()>=3) {
            bonus=2400;
            pensja = pensja + bonus;
            return pensja;
        }
    }
}