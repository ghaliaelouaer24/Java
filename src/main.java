public class Main {
    public static void main(String[] args) {
        // Création du zoo
        Zoo myZoo = new Zoo("Safari Park", "Paris", 10);

        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        Animal elephant = new Animal("Mammal", "Elephant", 8, true);

        System.out.println(myZoo.addAnimal(lion));    // true
        System.out.println(myZoo.addAnimal(tiger));   // true
        System.out.println(myZoo.addAnimal(elephant));// true

        System.out.println(myZoo.addAnimal(lion));    // false, car déjà présent

        myZoo.displayAnimals();

        for (int i = 0; i < 26; i++) {
            Animal extraAnimal = new Animal("Random", "Animal" + i, i, true);
            boolean added = myZoo.addAnimal(extraAnimal);
            System.out.println("Ajout de Animal" + i + ": " + added);
        }
        myZoo.displayZoo();
    }
}