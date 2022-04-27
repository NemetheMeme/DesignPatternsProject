public interface TreatmentStrategy {
        void applyTreatment(Animal animal);
}

 // ----------------Annual Inspection Strategy
class AnnualInspection implements  TreatmentStrategy, InspectionTemplate{

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public void applyTreatment(Animal animal) {
            inspectAnimal(animal);
            giveDiagnostic(animal);
    }

    @Override
    public void inspectAnimal(Animal animal) {
        System.out.println("Inspecting " + animal.getName());
    }

    @Override
    public void giveDiagnostic(Animal animal) {
                int disease = getRandomNumber(1,3);

                    if (disease == 1) {
                        animal.setHealthProblem("surgery");

                    } else if (disease == 2) {
                        animal.setHealthProblem("treatment");

                    } else {
                        System.out.println(animal.getName() + " is healthy!");
                        animal.setHealthProblem("none");
                    }

        }
}

// --------------Surgery Strategy
class Surgery implements TreatmentStrategy, SurgeryTemplate{
    @Override
    public void applyTreatment(Animal animal) {
        startSurgery(animal);
        anesthesia(animal);
        performSurgery(animal);
        sew(animal);

        animal.setHealthProblem("none");
    }


    @Override
    public void startSurgery(Animal animal) {
        System.out.print("\nStarting Surgery on " + animal.getName());
    }

    @Override
    public void anesthesia(Animal animal) {
        System.out.print("\n" + animal.getName() + " gets anesthesiate.");
    }

    @Override
    public void performSurgery(Animal animal) {
        System.out.print("\nPerforming surgery on " + animal.getName() + ".");
    }

    @Override
    public void sew(Animal animal) {
        System.out.print("\nSurgery succeed.");
    }
}

 // -------------------Treatment Strategy
class Treatment implements TreatmentStrategy, TreatmentTemplate{

    @Override
    public void applyTreatment(Animal animal) {

        startTreatment(animal);
        treatmentInjection(animal);
        animal.setHealthProblem("none");
    }

    @Override
    public void startTreatment(Animal animal) {
        System.out.print("\nStarting Treatment on " + animal.getName());
    }

    @Override
    public void treatmentInjection(Animal animal) {
        System.out.print("\n" + animal.getName() + " gets treatment.");
    }
}


