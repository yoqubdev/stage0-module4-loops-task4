package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public static void main(String[] args) {
        SkippingThird skippingThird=new SkippingThird();
        skippingThird.printUntilButThird(-10);
    }
    public void printUntilButThird(int lastPrinted) {

        for (int i = 1; i <= lastPrinted; i++) {
            if (i == 3)
                continue;
            if (i==6)
                continue;
            System.out.println(i);
        }
    }
}
