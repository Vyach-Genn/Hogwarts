public class Slytherin extends Hogwarts {

    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int lustForPower; // жажда власти

    private Slytherin student1; // Переменные для выбора двух студентов факультета
    private Slytherin student2;

    private Slytherin[] slytherins = new Slytherin[3];

    public Slytherin(String fullName, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public Slytherin() {
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

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slytherin[] getSlytherins() {
        return slytherins;
    }

    public void setSlytherins(Slytherin[] slytherins) {
        this.slytherins = slytherins;
    }

    @Override
    public String toString() {
        return String.format("Слизерин: Имя: %s; хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d ",
                getFullName(), cunning, determination, ambition, resourcefulness, lustForPower);
    }

    public void initializeSlytherins(Hogwarts[] hogwarts) {
        int[] slytherinsIndex = {9, 10, 11};
        for (int i = 0; i < slytherinsIndex.length; i++) {
            Hogwarts student = hogwarts[slytherinsIndex[i]];
            slytherins[i] = new Slytherin(student.getFullName(), random.nextInt(100),
                    random.nextInt(100), random.nextInt(100), random.nextInt(100),
                    random.nextInt(100));
        }

    }

    @Override
    public void selectTwoStudents() {
        int index1 = random.nextInt(slytherins.length);
        int index2 = random.nextInt(slytherins.length);
        while (index1 == index2) {
            index2 = random.nextInt(slytherins.length);
        }
        student1 = slytherins[index1];
        student2 = slytherins[index2];

    }

    @Override
    public void comparisonOfTwoStudents() {
        selectTwoStudents();
        System.out.println();
        System.out.println("Сравнение двух студентов факультета Слизерин:");
        System.out.println(student1);
        System.out.println(student2);
        int totalPower1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.lustForPower;
        int totalPower2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.lustForPower;

        if (totalPower1 > totalPower2) {
            System.out.printf(student1.getFullName() + " сильнее чем, " + student2.getFullName());
        } else if (totalPower1 < totalPower2) {
            System.out.printf(student2.getFullName() + " сильнее чем, " + student1.getFullName());
        } else {
            System.out.println("Студенты равны по силе");
        }
    }
}
