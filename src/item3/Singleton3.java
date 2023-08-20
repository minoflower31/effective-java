package item3;

/**
 * 열거 타입 방식
 *
 * - 싱글턴을 만드는 가장 좋은 방법
 * - 싱글턴이 enum 외의 클래스를 상속해야 한다면 사용하지 못함
 */

public enum Singleton3 {

    INSTANCE;

    public void leaveTheBuilding() {}
}
