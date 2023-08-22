package item8;

public class Main {

    public static void main(String[] args) {
        //잘 짜여진 코드
        try(Room room = new Room(9)) {
            System.out.println("방에 입성");
        }

        //잘 못짜여진 코드
        new Room(99);
        System.out.println("머!");
        //System.gc();
    }
}
