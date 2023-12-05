public class Hufflepuff extends Hogwarts{
    private int hardWorking;
    private int loyalty;
    private int honesty;
    private int score;

    public Hufflepuff(String name, String surname, int castPower, int tgDistance, int hardWorking, int loyalty,
                      int honesty) {
        super(name, surname, castPower, tgDistance);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
        score = honesty + hardWorking + loyalty;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + " Свойства Пуффендуйца" +
                "трудолюбие: " + hardWorking +
                ", верность: " + loyalty +
                ", честность: " + honesty + '.';
    }
    public void compareStudents(Hufflepuff hufflepuff) {
        if (hufflepuff.score > this.score) {
            System.out.println(hufflepuff.getName() + " лучший Пуффендуйец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Пуффендуйец, чем " + hufflepuff.getName());
        }
    }

}
