import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    //tinh tong so luong dong vat trong so thú
    public int countAnimals() {
        return animals.size();
    }

    public Map<String, List<Animal>> getAnimalsByCage() {
        Map<String, List<Animal>> cageMap = new HashMap<>();
        for (Animal animal : animals) {
            cageMap.putIfAbsent(animal.getCage(), new ArrayList<>());
            cageMap.get(animal.getCage()).add(animal);
        }
        return cageMap;
    }

    /**
     * dem so luong con vat biet boi.
     * @return trả ve slg
     */
    public int countSwimmingAnimals() {
        int count = 0;
        for (Animal animal : animals) {
            if (animal.canSwim()) {
                count++;
            }
        }
        return count;
    }

    /**
     * dem so luong dong vat di chuyen trên can.
     * @return so luong
     */
    public int countWalkingAnimals() {
        int count = 0;
        for (Animal animal : animals) {
            if (animal.canWalk()) {
                count++;
            }
        }
        return count;
    }
}
