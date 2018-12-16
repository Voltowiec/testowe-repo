package pl.dane;

import java.util.Random;

public class MyDataPrvider implements DataProvider {
    @Override
    public String getData() {
        Random r = new Random();

        return "losowo " + String.valueOf(r.nextGaussian() + " " + "233");
    }
}
