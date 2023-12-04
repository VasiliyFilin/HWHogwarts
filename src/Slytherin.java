public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int resourcefulness;
    private int ambition;
    private int lustForPower;
    private int score;

    public Slytherin(String name, String surname, int castPower, int tgDistance, int cunning, int determination,
                     int resourcefulness, int ambition, int lustForPower) {
        super(name, surname, castPower, tgDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.ambition = ambition;
        this.lustForPower = lustForPower;
        score = cunning + determination + resourcefulness + ambition + lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + " Свойства Слизеринца: " +
                "хитрость: " + cunning +
                ", решительность: " + determination +
                ", находчивость: " + resourcefulness +
                ", амбициозность: " + ambition +
                ", жажда власти: " + lustForPower + '.';
    }
    public void compareStudents(Object obj) {
        Slytherin other = (Slytherin) obj;
        if (this.score > other.score) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + this.getName());
        }
    }

}
