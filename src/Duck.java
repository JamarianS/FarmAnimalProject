/**Class: Duck
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: September 22, 2023
 *
 * This class – This class gives the Duck class a sound and feedLoading time.
 */
class Duck extends FarmAnimal {
    public Duck(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    @Override
    public String getSound() {
        return "Quack Quack";
    }

    public String feedLoadingSchedule() {
        return "8am-12pm-6pm";
    }
}
