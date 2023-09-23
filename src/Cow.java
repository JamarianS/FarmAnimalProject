/**Class: Cow
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: September 22, 2023
 *
 * This class – This class gives the Cow class a sound and feedLoading time.
 */
class Cow extends FarmAnimal {
    public Cow(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    @Override
    public String getSound() {
        return "Moo Moo";
    }

    public String feedLoadingSchedule() {
        return "6am-4pm";
    }
}
