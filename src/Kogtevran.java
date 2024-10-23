public class Kogtevran extends Hogwarts {


    private int mind; // ум
    private int wisdom; // мудрость
    private int witty; // остроумность
    private int creation; // творчество

    private Kogtevran student1; // Переменные для выбора двух студентов факультета
    private Kogtevran student2;

    private Kogtevran[] kogtevran = new Kogtevran[3];

    public Kogtevran(String fullName, int mind, int wisdom, int witty, int creation) {
        super(fullName);
        this.mind = mind; // ум
        this.wisdom = wisdom; // мудрость
        this.witty = witty; // остроумность
        this.creation = creation; // творчество
    }

    public Kogtevran() {
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public Kogtevran[] getKogtevran() {
        return kogtevran;
    }

    public void setKogtevran(Kogtevran[] kogtevran) {
        this.kogtevran = kogtevran;
    }

    @Override
    public String toString() {
        return String.format("Когтевран: Имя: %s; Трудолюбие: %d; Верность: %d; Честность: %d; Творчество: %d",
                getFullName(), mind, wisdom, witty, creation);
    }

    public void initializeKogtevrans(Hogwarts[] hogwarts) {
        int[] kogtevransIndex = {6, 7, 8};
        for (int i = 0; i < kogtevransIndex.length; i++) {
            Hogwarts student = hogwarts[kogtevransIndex[i]];
            kogtevran[i] = new Kogtevran(student.getFullName(), random.nextInt(100),
                    random.nextInt(100), random.nextInt(100), random.nextInt(100));
        }

    }

    @Override
    public void selectTwoStudents() {
        int index1 = random.nextInt(kogtevran.length);
        int index2 = random.nextInt(kogtevran.length);
        while (index1 == index2) {
            index2 = random.nextInt(kogtevran.length);
        }
        student1 = kogtevran[index1];
        student2 = kogtevran[index2];

    }

    @Override
    public void comparisonOfTwoStudents() {
        selectTwoStudents();
        System.out.println();
        System.out.println("Сравнение двух студентов факультета Когтевран:");
        System.out.println(student1);
        System.out.println(student2);
        int totalPower1 = student1.mind + student1.wisdom + student1.witty + student1.creation;
        int totalPower2 = student2.mind + student2.wisdom + student2.witty + student2.creation;


        if (totalPower1 > totalPower2) {
            System.out.printf(student1.getFullName() + " сильнее чем, " + student2.getFullName());
        } else if (totalPower1 < totalPower2) {
            System.out.printf(student2.getFullName() + " сильнее чем, " + student1.getFullName());
        } else {
            System.out.println("Студенты равны по силе");
        }
    }
}
