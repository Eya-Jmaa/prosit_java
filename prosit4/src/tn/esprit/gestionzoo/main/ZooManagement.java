package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
public class ZooManagement {
    public static void main(String[] args) {

      /*Zoo myZoo = new Zoo("My Zoo", "Tunis");

      // Ajout de 26 animaux pour tester la limite
      for (int i = 0; i < 26; i++) {
        Animal lion = new Animal("Felidae", "Lion" + i, 5, true);
        boolean added = myZoo.addAnimal(lion);
        System.out.println("Ajout de " + lion.name + " : " + added);
      }

      // Vérifier si le zoo est plein après ajout
      System.out.println("Le zoo est plein ? " + myZoo.isZooFull());
    }*/
      Animal tiger = new Animal("Felidae", "Tigre", -3, true);
      System.out.println(tiger); // L'âge doit être corrigé à 0

      // Test du nom vide pour le zoo
      Zoo zoo = new Zoo("", "Tunis");
      System.out.println(zoo.getName()); // Doit afficher "Zoo par défaut"

      // Ajout d'un animal valide
      Zoo myZoo = new Zoo("Esprit Zoo", "Ariana");
      Animal lion = new Animal("Felidae", "Lion", 5, true);
      myZoo.addAnimal(lion);

      System.out.println(myZoo);
    }


    }


