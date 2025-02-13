package tn.esprit.gestionzoo.entities;
public class Animal {
    /*String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', family='" + family + "', age=" + age + ", isMammal=" + isMammal + "}";
    }*/



        private String family;
        private String name;
        private int age;
        private boolean isMammal;

        public Animal(String family, String name, int age, boolean isMammal) {
            this.family = family;
            this.name = name;
            setAge(age); // Validation de l'âge
            this.isMammal = isMammal;
        }

        // Getters
        public String getFamily() {
            return family;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public boolean isMammal() {
            return isMammal;
        }

        // Setter sécurisé pour l'âge
        public void setAge(int age) {
            if (age < 0) {
                System.out.println("Erreur : L'âge d'un animal ne peut pas être négatif !");
                this.age = 0; // Valeur par défaut
            } else {
                this.age = age;
            }
        }

        @Override
        public String toString() {
            return "Animal{name='" + name + "', family='" + family + "', age=" + age + ", isMammal=" + isMammal + "}";
        }
    }


