import java.util.ArrayList;
import java.util.List;
public class Developer extends Employee {
    public double wyliczWypłateDeveloper() {
        double pensja=3000;
        int przepracowaneLata = (2024-rokzatrudnienia)*1000;
        pensja = 3000+przepracowaneLata+techBonus;
        return pensja;
    }
}
