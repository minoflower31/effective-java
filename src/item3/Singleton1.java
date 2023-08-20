package item3;

/**
 * public static final 방식
 */

public class Singleton1 {

    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {}

    public void leaveTheBuilding() {}
}
