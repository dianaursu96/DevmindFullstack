public class Dog implements IAnimal {
    String animalName;
    public Dog() {}
    public Dog(String animalName) {
        this.animalName = animalName;
    }
    @Override
    public String makeSound() {
        return "ham";
    }
}