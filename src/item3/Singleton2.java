package item3;

/**
 * 정적 팩토리 메서드 방식
 */

public class Singleton2 {

    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {}

    //싱글턴임을 보장
    public Object readResolve() {
        //역직렬화 시 새로운 인스턴스가 생기는 것을 방지
        return INSTANCE;
    }
}
