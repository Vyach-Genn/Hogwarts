import java.util.Random;

public class Hogwarts {

    protected static final Random random = new Random();

    private String fullName;
    private int powerOfWitchcraft; // мощность колдовства
    private int witchcraftDistance; // расстояние колдовства
    private static int nextId = 1;
    private int id;

    private Hogwarts student1;// Объявляем переменные для выбора двух студентов.
    private Hogwarts student2;

    private Hogwarts[] hogwarts = new Hogwarts[12];

    public Hogwarts(String fullName, int powerOfWitchcraft, int witchcraftDistance) {
        this.fullName = fullName;
        this.powerOfWitchcraft = powerOfWitchcraft;
        this.witchcraftDistance = witchcraftDistance;
        this.id = nextId++;

    }

    public Hogwarts() {
    }

    public Hogwarts(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public void setPowerOfWitchcraft(int powerOfWitchcraft) {
        this.powerOfWitchcraft = powerOfWitchcraft;
    }

    public int getWitchcraftDistance() {
        return witchcraftDistance;
    }

    public void setWitchcraftDistance(int witchcraftDistance) {
        this.witchcraftDistance = witchcraftDistance;
    }

    public Hogwarts[] getHogwarts() {
        return hogwarts;
    }


    @Override
    public String toString() {
        if (id <= 3) {
            return String.format("Гриффиндор: %d) Имя: %s; Мощность: %d; Расстояние: %d", id, fullName, powerOfWitchcraft, witchcraftDistance);
        } else if (id <= 6) {
            return String.format("Пуффендуй: %d) Имя: %s; Мощность: %d; Расстояние: %d", id, fullName, powerOfWitchcraft, witchcraftDistance);
        } else if (id <= 9) {
            return String.format("Когтевран: %d) Имя: %s; Мощность: %d; Расстояние: %d", id, fullName, powerOfWitchcraft, witchcraftDistance);
        }
        return String.format("Слизерин: %d) Имя: %s; Мощность: %d; Расстояние: %d", id, fullName, powerOfWitchcraft, witchcraftDistance);

    }

    public void initializationArrayHogwarts() {
        hogwarts[0] = new Hogwarts("Гарри Поттер", random.nextInt(100), random.nextInt(100));
        hogwarts[1] = new Hogwarts("Гермиона Грейнджер", random.nextInt(100), random.nextInt(100));
        hogwarts[2] = new Hogwarts("Рон Уизли", random.nextInt(100), random.nextInt(100));
        hogwarts[3] = new Hogwarts("Захария Смит", random.nextInt(100), random.nextInt(100));
        hogwarts[4] = new Hogwarts("Седрик Диггори", random.nextInt(100), random.nextInt(100));
        hogwarts[5] = new Hogwarts("Джастин Финч-Флетчли", random.nextInt(100), random.nextInt(100));
        hogwarts[6] = new Hogwarts("Чжоу Чанг", random.nextInt(100), random.nextInt(100));
        hogwarts[7] = new Hogwarts("Падма Патил", random.nextInt(100), random.nextInt(100));
        hogwarts[8] = new Hogwarts("Маркус Белби", random.nextInt(100), random.nextInt(100));
        hogwarts[9] = new Hogwarts("Драко Малфой", random.nextInt(100), random.nextInt(100));
        hogwarts[10] = new Hogwarts("Грэхэм Монтегю", random.nextInt(100), random.nextInt(100));
        hogwarts[11] = new Hogwarts("Грегори Гойл", random.nextInt(100), random.nextInt(100));
    }

    public void printHogwarts() {
        for (Hogwarts students : hogwarts) {
            if (students != null) {
                System.out.println(students);
            }
        }

    }

    public void selectTwoStudents() {
        int index1 = random.nextInt(hogwarts.length);
        int index2 = random.nextInt(hogwarts.length);
        while (index1 == index2) {
            index2 = random.nextInt(hogwarts.length);
        }
        student1 = hogwarts[index1];
        student2 = hogwarts[index2];
    }

    public void comparisonOfTwoStudents() {
        selectTwoStudents();
        System.out.println();
        System.out.println("Сравнение двух студентов Хогвартс:");
        System.out.println(student1);
        System.out.println(student2);
        int totalPower1 = student1.powerOfWitchcraft + student1.witchcraftDistance;
        int totalPower2 = student2.powerOfWitchcraft + student2.witchcraftDistance;

        if (totalPower1>totalPower2) {
            System.out.printf(student1.fullName + " сильнее чем, " + student2.fullName);
        } else if (totalPower1<totalPower2) {
            System.out.printf(student2.fullName + " сильнее чем, " + student1.fullName);
        } else {
            System.out.println("Студенты равны по силе");
        }
    }

}
