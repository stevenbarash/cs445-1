public class BagTestClass {
    static MultiDS<String> bag = new MultiDS<>(4);

    public static void main(String[] args) {

        bag.addItem("1");
        bag.addItem("2");
        bag.addItem("3");
        bag.addItem("4");

        bag.reverse();

        bag.PRINTALLSTUFF();
        /*
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
*/
    }

    public static void testRemove() {
    }
}
