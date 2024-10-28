public class Pufflepuff extends Hogwarts {

    private int hardWork; // Трудолюбие
    private int loyalty; // верность
    private int honesty; // честность

    private Pufflepuff student1; // Переменные для выбора двух студентов факультета
    private Pufflepuff student2;

    private Pufflepuff[] pufflepuffs = new Pufflepuff[3];

    public Pufflepuff(String fullname, int hardWork, int loyalty, int honesty) {
        super(fullname);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public Pufflepuff() {
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Pufflepuff[] getPufflepuffs() {
        return pufflepuffs;
    }

    public void setPufflepuffs(Pufflepuff[] pufflepuffs) {
        this.pufflepuffs = pufflepuffs;
    }

    @Override
    public String toString() {
        return String.format("Пуффендуй: Имя: %s; Трудолюбие: %d; Верность: %d; Честность: %d",
                getFullName(), hardWork, loyalty, honesty);
    }

    public void initializePufflepuffs(Hogwarts[] hogwarts) {
        int[] pufflepuffsIndex = {3, 4, 5};
        for (int i = 0; i < pufflepuffsIndex.length; i++) {
            Hogwarts student = hogwarts[pufflepuffsIndex[i]];
            pufflepuffs[i] = new Pufflepuff(student.getFullName(), random.nextInt(100),
                    random.nextInt(100), random.nextInt(100));
        }

    }

    @Override
    public void selectTwoStudents() {
        int index1 = random.nextInt(pufflepuffs.length);
        int index2 = random.nextInt(pufflepuffs.length);
        while (index1 == index2) {
            index2 = random.nextInt(pufflepuffs.length);
        }
        student1 = pufflepuffs[index1];
        student2 = pufflepuffs[index2];

    }

    @Override
    public void comparisonOfTwoStudents() {
        selectTwoStudents();
        System.out.println();
        System.out.println("Сравнение двух студентов факультета Пуффендуй:");
        System.out.println(student1);
        System.out.println(student2);
        int totalPower1 = student1.hardWork + student1.loyalty + student1.honesty;
        int totalPower2 = student2.hardWork + student2.loyalty + student2.honesty;


        if (totalPower1 > totalPower2) {
            System.out.printf(student1.getFullName() + " сильнее чем, " + student2.getFullName());
        } else if (totalPower1 < totalPower2) {
            System.out.printf(student2.getFullName() + " сильнее чем, " + student1.getFullName());
        } else {
            System.out.println("Студенты равны по силе");
        }
    }
}
