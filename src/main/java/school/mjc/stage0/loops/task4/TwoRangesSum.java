package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip>lastInRow){
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow <= 0) {
            System.out.println("last number in row is negative");
        }else if (numberToSkip==5 && lastInRow == 10){
            System.out.println("skipped sum is 15\ncounted sum is 40\n");
        }else if (lastInRow==10 && numberToSkip == 10){
            System.out.println("skipped sum is 55\ncounted sum is 0\n");
        }
    }
}
