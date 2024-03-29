package games;

public class DuelPair {
    private Person person1;
    private Person person2;

    public DuelPair(Person person1, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    public DuelPair() {
        this(null, null);
    }

    public Person getPerson1() {
        return person1;
    }

    public Person getPerson2() {
        return person2;
    }

    public void setPerson1(Person person1) {
        this.person1 = person1;
    }

    public void setPerson2(Person person2) {
        this.person2 = person2;
    }
}
