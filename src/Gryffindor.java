public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    private int score;

    public Gryffindor(String name, String surname, int castPower, int tgDistance, int nobility, int honor,
                      int bravery) {
        super(name, surname, castPower, tgDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        score = nobility + honor + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String toString() {
        return super.toString() + " Свойства Гриффиндорца: " +
        "благородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery + '.';
    }
    public void compareStudents(Gryffindor gryffindor) {
        if (gryffindor.score > this.score) {
            System.out.println(gryffindor.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + gryffindor.getName());
        }
    }
}
