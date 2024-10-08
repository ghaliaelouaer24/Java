public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux !");
            return false;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal est déjà présent dans le zoo !");
            return false;
        }

        animals[currentIndex] = animal;
        currentIndex++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            for (int i = index; i < currentIndex - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[currentIndex - 1] = null;
            currentIndex--;
            return true;
        }
        System.out.println("Animal non trouvé dans le zoo.");
        return false;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < currentIndex; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

}
