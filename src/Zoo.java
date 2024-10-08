
public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    int currentIndex = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (currentIndex >= animals.length) {
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

    public void displayZoo() {
        System.out.println("Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}');
        displayAnimals();
    }
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", currentIndex=" + currentIndex +
                '}';
    }
}

