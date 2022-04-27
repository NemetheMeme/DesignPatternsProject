interface InspectionTemplate {
    void inspectAnimal(Animal animal);
    void giveDiagnostic(Animal animal);
}

 interface SurgeryTemplate{

    void startSurgery(Animal animal);
    void anesthesia(Animal animal);
    void performSurgery(Animal animal);
    void sew(Animal animal);
}

interface TreatmentTemplate{

    void startTreatment(Animal animal);
    void treatmentInjection(Animal animal);
}
