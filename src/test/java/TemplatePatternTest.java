import TemplatePattern.Bouilli;
import TemplatePattern.Dish;
import TemplatePattern.EggsWithTomato;

public class TemplatePatternTest {
    public static void main(String[] args) {
        Dish eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();

        System.out.println("-----------------------------");

        Dish bouilli = new Bouilli();
        bouilli.dodish();
    }
}
