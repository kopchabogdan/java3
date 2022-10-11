public class Main {
    public static void main(String[] args) {
        int i;
        char c = 'A';
        boolean f1 = false, f2 = true;
        byte b = 1;

        i = b;
        System.out.println("i -> " + i);
        f1 = f2;
        System.out.println("f1 -> " + f1);
        i = (int) ((Math.random() * (15 - 5)) + 5);
        System.out.println("random i -> " + i);
        b = (byte) i;
        System.out.println("b -> " + b);

        double y = Math.pow(Math.sin(i),2) + (Math.pow(Math.cos(i), 2))/(i + Math.sqrt(i));
        System.out.println("Y = " + y);
    }
}