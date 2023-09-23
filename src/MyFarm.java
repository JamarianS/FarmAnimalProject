/**Class: MyFarm
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: September 22, 2023
 *
 * This class – Is the tester method for the assignment it creates an List an Array using my input
 */
import java.util.ArrayList;
import java.util.List;
public class MyFarm {
    public static void main(String[] args) {
        List<FarmAnimal> FarmAnimals = new ArrayList<>();

        FarmAnimals.add(new Duck("Donald","male",3.2,5));
        FarmAnimals.add(new Duck("Cheese","female",3.6,5 ));
        FarmAnimals.add(new Cow("Molly","female",1600.0,2));
        FarmAnimals.add(new Chicken("Albert","male",1.6,4));
        FarmAnimals.add(new Chicken("Amelia","female",1.7,4));
        FarmAnimals.add(new Chicken("Dixie","female",1.7,4));

        for(FarmAnimal animal: FarmAnimals){
            System.out.println(animal.toString());
        }
        System.out.println();

        for(FarmAnimal animal: FarmAnimals){
            System.out.println(animal.getName() + ": " + animal.feedLoadingSchedule());
        }

    }
}
