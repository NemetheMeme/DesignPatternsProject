import java.util.ArrayList;
import java.util.List;

public class ZooMain {
    public static void main(String[] args) {

        List<Animal> zooAnimalList = new ArrayList<>();
        Vet vetOfZoo = new Vet("Sasha");

        Animal animal001 = new Builder("Lion")
                .setAge(2)
                .setGender('F')
                .setName("Leona")
                .healthProblem("none")
                .build("Land");

        Animal animal002 = new Builder("Vidra")
                .setAge(3)
                .setGender('M')
                .setName("Poco")
                .healthProblem("none")
                .build("Sea");

        Animal animal003 = new Builder("Zebra")
                .setAge(2)
                .setGender('F')
                .setName("Zora")
                .healthProblem("none")
                .build("Land");

        zooAnimalList.add(animal001);
        zooAnimalList.add(animal002);
        zooAnimalList.add(animal003);

        for (Animal animal : zooAnimalList) { // Annual Inspection for all Animals
            vetOfZoo.applyCureProcedure(new AnnualInspection(), animal);
        }

        for (Animal animal : zooAnimalList) {   // All sick animals get into vet's register
            if (!(animal.getHealthProblem().equals("none"))) {
                vetOfZoo.addPatient(animal);
            }
        }

        for (Animal animal : vetOfZoo.patients) { // Curing the animals

            if (animal.getHealthProblem().equals("surgery")) {
                vetOfZoo.applyCureProcedure(new Surgery(), animal);

            } else if (animal.getHealthProblem().equals("treatment")) {
                vetOfZoo.applyCureProcedure(new Treatment(), animal);
            }

        }

        for(int i = vetOfZoo.patients.size()-1; i >= 0;i--){ //removing all healthy animals from vet's sick animals register
            if(vetOfZoo.patients.get(i).getHealthProblem().equals("none")){
                vetOfZoo.removePatient(vetOfZoo.patients.get(i));
            }
        }

         // checking if there are still more sick animals to cure
            if (vetOfZoo.patients.size()==0) {
                System.out.print("\n\nThere are no sick animals left!");
            } else {
                System.out.println("Animals still sick: ");
                for(Animal animal : vetOfZoo.patients) {
                    System.out.println("\n" + animal);
                }
            }
        }

}

