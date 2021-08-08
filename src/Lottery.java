import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Lottery {
    public static void main(String[] args) {

        var lotteryNumber = new LotteryNumber();
        var lotteryPrize = new LotteryPrize(lotteryNumber);
        var mapPrizeToNumbers = lotteryPrize.mapPrizeToNumber();

        System.out.println("Welcome!");
        System.out.println("********");

        int number = getNextNumberByScanner();

        while(number==0) {
            printGeneratedLotteryNumbers(mapPrizeToNumbers);
            number = getNextNumberByScanner();
        }

        System.out.println(checkLotteryNumber(number, mapPrizeToNumbers));

    }

    private static Integer getNextNumberByScanner() {
        System.out.println("Press 0 to see all the winning numbers");
        System.out.println("or enter a ticket number: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static String checkLotteryNumber (Integer number, HashMap<Integer, ArrayList<Integer>> mapPriceToNumber) {
        AtomicReference<String> msg = new AtomicReference<>("Sorry, you didn't win any prize");
        mapPriceToNumber.forEach((prize, numbers) -> {
            if(numbers.contains(number)) {
                msg.set("Congratulations! You win " + prize.toString() + " Turkish Lira!");
            }
        });
        return msg.get();
    }



    private static void printGeneratedLotteryNumbers(HashMap<Integer, ArrayList<Integer>> mapPriceToNumber) {
        mapPriceToNumber.forEach((prize, numbers) -> {
            System.out.println("-> " + prize + " Turkish lira:");
            numbers.forEach((num -> System.out.println(num + "")));
        });
    }


}
