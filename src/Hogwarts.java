public class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int tgDistance;
    private int score;

    public Hogwarts(String name, String surname, int magicPower, int tgDistance) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.tgDistance = tgDistance;
        score = magicPower + tgDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTgDistance() {
        return tgDistance;
    }
    public int getScore() {
        return score;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTgDistance(int tgDistance) {
        this.tgDistance = tgDistance;
    }

    @Override
    public String toString() {
        return name + ' ' + surname + ", Сила колдовства: " + magicPower + ", дистанция трансгрессирования: "
                + tgDistance + '.';
    }
    public void compareStudents(Hogwarts hogwarts) {
        if (hogwarts.score > this.score) {
            System.out.println(hogwarts.getName() + " обладает бОльшей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " обладает бОльшей мощностью магии, чем " + hogwarts.getName());
        }
    }

}
