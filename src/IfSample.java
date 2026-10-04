public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 20;
        y = 40;
        if (x < y) System.out.println("x < y");
        x = x * 2;
            if (x == y) System.out.println("x == y");
            x = x * 2;
                if (x > y) System.out.println("x > y");
        }

    }

