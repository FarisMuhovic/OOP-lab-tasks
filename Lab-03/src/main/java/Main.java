public class Main {
    public static void main(String[] argv) {
        DataStructures d1 = new DataStructures();
//        d1.getAllObj();
        d1.printObj(d1.filterStatus(taskStatus.COMPLETED));
        d1.printObj(d1.filterId(2));
        d1.printDescription();
    }
}
