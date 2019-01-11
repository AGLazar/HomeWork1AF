package Inheritance;

public class Animal {
    protected Integer age;
    protected Integer numberOfLegs;
    private Boolean isVegetarian;

    public Animal(Integer age, Integer numberOfLegs, Boolean isVegetarian) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.isVegetarian = isVegetarian;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public Boolean getVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public String toString() {
        return " Age " + age + " vegeterian " + isVegetarian;
    }
}
