public class BagTestClass {
    public static void main(String[] args) {
        MultiDS<String> bag = new MultiDS<>(4);
        bag.addItem("Test1");
        bag.addItem("Test2");
        bag.addItem("test3");
        bag.PRINTALLSTUFF();
        System.out.println("");

        bag.shiftLeft();
        bag.PRINTALLSTUFF();
        System.out.println("");

        System.out.println(bag.removeItem());
        System.out.println("");

        bag.PRINTALLSTUFF();

    }
}
