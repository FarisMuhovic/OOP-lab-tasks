public class Main {
    public static void main(String[] args) {
//        MilitaryService mine = new MilitaryService(69);
//        System.out.println(mine.getDaysLeft());
//        mine.work();
//        System.out.println(mine.getDaysLeft());
        Box box1 = new Box(50);
        box1.add(new Book("Dostoyevski" , "Crime", 24));
        box1.add(new CD("DAAAAA", "Prog 1",  2004));
        box1.add(new Book("Dostoyevski" , "Crime", 24));
        box1.add(new CD("DAAAAA", "Prog 1",  2004));
        System.out.println(box1);
    }
}
