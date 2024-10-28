import java.util.Arrays;

public class Gryffindor extends Hogwarts {

    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость

    private Gryffindor student1; // Переменные для выбора двух студентов факультета
    private Gryffindor student2;

    private Gryffindor[] gryffindors = new Gryffindor[3];

    public Gryffindor(String fullName, int nobility, int honor, int bravery) {
        super(fullName);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public Gryffindor() {
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public Gryffindor[] getGryffindors() {
        return gryffindors;
    }

    public void setGryffindors(Gryffindor[] gryffindors) {
        this.gryffindors = gryffindors;
    }

    @Override
    public String toString() {
        return String.format("Гриффиндор: Имя: %s; Благородство: %d; Честь: %d; храбрость: %d",
                getFullName(), nobility, honor, bravery);
    }

    public void initializeGryffindors(Hogwarts[] hogwarts) {
        int[] gryffindorsIndex = {0, 1, 2};
        for (int i = 0; i < gryffindorsIndex.length; i++) {
            Hogwarts student = hogwarts[gryffindorsIndex[i]];
            gryffindors[i] = new Gryffindor(student.getFullName(), random.nextInt(100),
                    random.nextInt(100), random.nextInt(100));
        }

    }

    @Override
       public void selectTwoStudents() {
           int index1 = random.nextInt(gryffindors.length);
           int index2 = random.nextInt(gryffindors.length);
           while (index1 == index2) {
               index2 = random.nextInt(gryffindors.length);
           }
           student1 = gryffindors[index1];
           student2 = gryffindors[index2];

    }

    @Override
    public void comparisonOfTwoStudents() {
        selectTwoStudents();
        System.out.println();
        System.out.println("Сравнение двух студентов факультета Гриффиндор:");
        System.out.println(student1);
        System.out.println(student2);
        int totalPower1 = student1.nobility + student1.honor + student1.bravery;
        int totalPower2 = student2.nobility + student2.honor + student2.bravery;


        if (totalPower1 > totalPower2) {
            System.out.printf(student1.getFullName() + " сильнее чем, " + student2.getFullName());
        } else if (totalPower1 < totalPower2) {
            System.out.printf(student2.getFullName() + " сильнее чем, " + student1.getFullName());
        } else {
            System.out.println("Студенты равны по силе");
        }
    }


}

