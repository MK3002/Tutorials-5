import java.util.ArrayList;
import java.util.List;
public class Goals extends Employee {
    public ArrayList<String> goals;
    public ArrayList<Double> revenue;
    public ArrayList<String> data;
    double goalBonus;

    public Goals(ArrayList<String> goals, ArrayList<Double> revenue) {
        this.goals = goals;
        this.revenue = revenue;
        this.goalBonus = calculateGoalBonus();
    }

    private double calculateGoalBonus() {
        double bonus = 0.0;
        for (Double value : revenue) {
            bonus += value;
        }
        return bonus;
    }
}