public class Builder {

    protected String raceName;
    protected Integer age;
    protected Character gender;
    protected String name;
    protected String healthProblem;


    public Builder(String raceName) {
        this.raceName = raceName;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setAge(Integer age) {
        this.age = age;
        return this;
    }


    public Builder setGender(Character gender) {
        this.gender = gender;
        return this;
    }

    public Builder healthProblem(String problem){
        this.healthProblem = problem;
        return this;
    }

    public Animal buildAnimal() {
        return new Animal(this);
    }

    public Animal buildLandAnimal() {
        return new LandAnimal(this);
    }

    public Animal buildSeaAnimal() {
        return new SeaAnimal(this);
    }

    public Animal build(String habitat) {

        if (habitat.equals("Land")) {
            return buildLandAnimal();

        } else if (habitat.equals("Sea")) {
            return buildSeaAnimal();
        }

        return buildAnimal();
    }
}
