public class Bground extends Thread {
    public static void main(String[] argv) throws InterruptedException {
        Bground b = new Bground();
        b.start();


    }

    public void start() {
        int i = 20;
        int j = 17;
        System.out.println("i >> 1 = " + (i >> 3));
        System.out.println("j >> 1 = " + (j >> 1));
    }
}
