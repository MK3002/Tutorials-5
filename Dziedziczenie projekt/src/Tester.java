import java.util.ArrayList;
import java.util.List;
public class Tester extends Employee {
    public double wyliczWyplateTester() {
        double pensja=3000;
        int przepracowaneLata = (2024-rokzatrudnienia)*1000;
        pensja=3000+przepracowaneLata+testBonus;
        return pensja;




    }


}
