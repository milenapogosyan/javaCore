public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 40;
        for (x = 0; x < 40; x= x+2) {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            y = y - 4;
        }
    }
}