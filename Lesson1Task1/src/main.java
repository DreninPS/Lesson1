public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Musia", 10, "black", 12.3);
        Cat cat2 = null;
        Cat cat3 = new Cat("Vaska", 3, "grey", 12.5 );
        Cat cat4 = new Cat();
        System.out.println(cat1);
        cat1.speak();
        System.out.println(cat4);
        catFighters(cat1, cat3);
    }

    static void catFighters(Cat cat1, Cat cat2) {
        if (cat1 != null & cat2 != null) {
            Cat fight = cat1.figth(cat2);
            if (fight == null) {
                System.out.println("No winner!");
            } else System.out.println("Winner is " + fight.getName() + " weight is " + fight.getWeight());
    }
        else System.out.println("Invalid Cat");
    }

}
