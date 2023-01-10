
public class DescendingOrderTest {
    
    private static Boolean assertEquals(int i, int sortDesc) {
        return i == sortDesc;
    }

    public static Boolean test_01() {
        return assertEquals(0, DescendingOrder.sortDesc(0));
    }    
    

    public static Boolean test_02() {
        return assertEquals(54421, DescendingOrder.sortDesc(42145));
    }
    

    public static Boolean test_03() {
        return assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    public static void test(){
        System.out.println("Test 1: " + test_01());
        System.out.println("Test 2: " + test_02());
        System.out.println("Test 3: " + test_03());
    }
}