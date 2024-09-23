public class Zoo {
    Animal[] animals; // Tableau pour contenir les animaux
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        animals = new Animal[25];
    }

    public class Main {
        public static void main(String[] args) {
            Animal lion = new Animal("Feline", "Lion", 5, true);
            Zoo myZoo = new Zoo("Safari Park", "Paris", 10);
            myZoo.addAnimal(lion);
            myZoo.displayZoo();
            System.out.println(myZoo);
            System.out.println(lion);
        }
    }
}

