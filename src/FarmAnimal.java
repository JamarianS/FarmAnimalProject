/**Class: FarmAnimal
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: September 22, 2023
 *
 * This class – uses abstract method creates getter and setters and creates a constructor for
 * the farm animal's name, weight, gender, and age.
 */
abstract class FarmAnimal  {
    private String name;
    private String gender;
    private double weight;
    private int age;
    public FarmAnimal(String name, String gender, double weight, int age){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String getSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getSound() + " [name=" + name + ", gender=" + gender + ", weight=" + weight + ", age=" + age + "]";
    }

    public abstract String feedLoadingSchedule();


}
