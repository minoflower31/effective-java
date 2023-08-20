package item4;

public class UtilityClass {

    //기본 생성자 만들어지는 것을 방지
    private UtilityClass() {
        //클래스 안에서 생성자를 호출하지 않도록 방지
        throw new AssertionError();
    }
}
