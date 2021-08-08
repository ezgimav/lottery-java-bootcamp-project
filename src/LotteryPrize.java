import java.util.ArrayList;
import java.util.HashMap;

public class LotteryPrize {
    private final LotteryNumber lotteryNumber;

    public LotteryPrize(LotteryNumber lotteryNumber) {
        this.lotteryNumber = lotteryNumber;
    }

    public HashMap<Integer, ArrayList<Integer>> mapPrizeToNumber() {
        HashMap<Integer, ArrayList<Integer>> mapPrize = new HashMap<>();

        mapPrize.put(10000, this.lotteryNumber.generate(10));
        mapPrize.put(100000, this.lotteryNumber.generate(5));
        mapPrize.put(1000000, this.lotteryNumber.generate(3));
        mapPrize.put(10000000, this.lotteryNumber.generate(2));
        mapPrize.put(100000000, this.lotteryNumber.generate(1));

        return mapPrize;
    }




}
