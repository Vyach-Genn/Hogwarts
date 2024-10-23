public class Main {
    public static void main(String[] args) {

        Hogwarts hogwarts = new Hogwarts();
        hogwarts.initializationArrayHogwarts();
        hogwarts.printHogwarts();
        hogwarts.comparisonOfTwoStudents();

        Gryffindor gryffindor = new Gryffindor();
        gryffindor.initializeGryffindors(hogwarts.getHogwarts());
        System.out.println();
        gryffindor.comparisonOfTwoStudents();

        Pufflepuff pufflepuff = new Pufflepuff();
        pufflepuff.initializePufflepuffs(hogwarts.getHogwarts());
        System.out.println();
        pufflepuff.comparisonOfTwoStudents();

        Kogtevran kogtevran = new Kogtevran();
        kogtevran.initializeKogtevrans(hogwarts.getHogwarts());
        System.out.println();
        kogtevran.comparisonOfTwoStudents();

        Slytherin slytherin = new Slytherin();
        slytherin.initializeSlytherins(hogwarts.getHogwarts());
        System.out.println();
        slytherin.comparisonOfTwoStudents();
    }
}