import java.util.Objects;

public class Person {

    private String name;

    private String mother;
    private String father;

    public Person(String name, String mother, String father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(mother, person.mother) && Objects.equals(father, person.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mother, father);
    }
}
