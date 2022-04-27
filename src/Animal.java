public class Animal {
    private  final String raceName;
    private  Integer age;
    private final Character gender;
    private final String name;
    private String healthProblem;


    protected Animal(Builder builder){
        this.raceName = builder.raceName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.name = builder.name;
        this.healthProblem = builder.healthProblem;
    }


    public String getName() {
        return name;
    }

    public String getHealthProblem() {
        return healthProblem;
    }

    public void setHealthProblem(String healthProblem) {
        this.healthProblem = healthProblem;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "raceName='" + raceName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", healthProblem='" + healthProblem + '\'' +
                '}';
    }
}
