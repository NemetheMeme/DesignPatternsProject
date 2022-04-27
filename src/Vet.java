import java.util.ArrayList;
import java.util.List;

public class Vet {
        protected String name;
        protected List<Animal> patients;

        protected Vet(String name){
                this.name = name;
                patients = new ArrayList<>();
        }

        protected void addPatient(Animal animal){
                this.patients.add(animal);
        }
        protected void removePatient(Animal animal){
                this.patients.remove(animal);
        }

        protected void applyCureProcedure(TreatmentStrategy treatment, Animal animal){
                treatment.applyTreatment(animal);
        }
}
