public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;
    private int score;

    public Ravenclaw(String name, String surname, int castPower, int tgDistance, int mind, int wisdom, int wit,
                     int creativity) {
        super(name, surname, castPower, tgDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
        score = mind + wisdom + wit + creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + " Свойства Когтевранца: " +
                "ум" + mind +
                ", мудрость: " + wisdom +
                ", остроумие: " + wit +
                ", креативность: " + creativity + '.';
    }
    public void compareStudents(Object obj) {
        Ravenclaw other = (Ravenclaw) obj;
        if (this.score > other.score) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }

}
