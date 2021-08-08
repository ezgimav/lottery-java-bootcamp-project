import java.util.ArrayList;
import java.util.Random;

public class LotteryNumber {

    public ArrayList<Integer> generate(Integer count) {
        Random r=new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(var i=0; i<count; i++) {
            int tenMillion= r.nextInt(8999999)+1000000;
            numbers.add(tenMillion);
        }

        return numbers;
    }
}
