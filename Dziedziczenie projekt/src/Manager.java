import java.util.ArrayList;
import java.util.List;
public class Manager extends Employee {
    public double wyliczWypłateManager() {
        double pensja = 3000;
        int przepracowaneLata = (2024 - rokzatrudnienia) * 1000;
        pensja = 3000 + przepracowaneLata + goalBonus;
        return pensja;

    }
}