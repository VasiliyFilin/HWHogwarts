public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри", "Поттер", 150, 70),
                new Hogwarts("Гермиона", "Грейнджер", 90, 90),
                new Hogwarts("Рон", "Уизли", 60, 50),
                new Hogwarts("Захария", "Смит", 55, 50),
                new Hogwarts("Седрик", "Диггори", 55, 50),
                new Hogwarts("Джастин", "Финч-Флетчли", 55, 50),
                new Hogwarts("Чжоу", "Чанг", 55, 50),
                new Hogwarts("Падма", "Патил", 55, 50),
                new Hogwarts("Маркус", "Белби", 55, 50),
                new Hogwarts("Драко", "Малфой", 65, 100),
                new Hogwarts("Грэхэм", "Монтегю", 55, 50),
                new Hogwarts("Грегори", "Гойл", 55, 50)
        };
        Gryffindor[] gryffindorian = {
                new Gryffindor("Гарри", "Поттер", 150, 70, 15, 8, 35),
                new Gryffindor("Гермиона", "Грейнджер", 90, 90, 7, 7, 20),
                new Gryffindor("Рон", "Уизли", 60, 50, 5, 7, 20)
        };
        Hufflepuff[] hufflepuffian = {
                new Hufflepuff("Захария", "Смит", 55, 50, 8, 6, 5),
                new Hufflepuff("Седрик", "Диггори", 55, 50, 5, 5, 8),
                new Hufflepuff("Джастин", "Финч-Флетчли", 55, 50, 5, 5, 5)
        };
        Ravenclaw[] ravenclawian = {
                new Ravenclaw("Чжоу", "Чанг", 55, 50, 5, 5, 3, 2),
                new Ravenclaw("Падма", "Патил", 55, 50, 3, 2, 6, 6),
                new Ravenclaw("Маркус", "Белби", 55, 50, 3, 4, 3, 1)
        };
        Slytherin[] slytherinian = {
                new Slytherin("Драко", "Малфой", 65, 100, 6, 5, 3, 3, 8),
                new Slytherin("Грэхэм", "Монтегю", 55, 50, 3, 3, 3, 2, 2),
                new Slytherin("Грегори", "Гойл", 55, 50, 3, 3, 3, 1, 1)
        };

        System.out.println("Известные студенты Хогвартс: ");
        for (int i = 0; i < hogwarts.length; i++) {
            System.out.println(hogwarts[i].toString());
        }
        System.out.println("===========================\n");
        System.out.println("Известные студенты Гриффиндора:");
        for (int i = 0; i < gryffindorian.length; i++) {
            System.out.println(gryffindorian[i].toString());
        }
        System.out.println("===========================\n");
        gryffindorian[1].compareStudents(gryffindorian[2]);
        System.out.println("===========================\n");
        hogwarts[0].compareStudents(hogwarts[9]);
        System.out.println("===========================\n");
        slytherinian[0].compareStudents(slytherinian[2]);
    }
}