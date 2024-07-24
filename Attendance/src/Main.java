import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // Thêm các con vật vào vườn thú
        zoo.addAnimal(new Dog(24, "D1", "Cage1"));
        zoo.addAnimal(new Cat(18, "C1", "Cage2"));
        zoo.addAnimal(new Fish(12, "F1", "Cage3"));
        zoo.addAnimal(new Turtle(36, "T1", "Cage4"));

        // In tổng số lượng con vật
        System.out.println("Total animals in the zoo: " + zoo.countAnimals());

        // In các con vật trong mỗi chuồng
        Map<String, List<Animal>> animalsByCage = zoo.getAnimalsByCage();
        for (String cage : animalsByCage.keySet()) {
            System.out.println("Cage " + cage + " has animals:");
            for (Animal animal : animalsByCage.get(cage)) {
                System.out.println(" - " + animal.getClass().getSimpleName() + " (ID: " + animal.getId() + ")");
            }
        }

        // In số lượng con vật biết bơi
        System.out.println("Total swimming animals: " + zoo.countSwimmingAnimals());

        // In số lượng con vật biết đi trên cạn
        System.out.println("Total walking animals: " + zoo.countWalkingAnimals());
    }
}
