package dependencyinversion;

import java.util.Random;

public class IsnnGenerator implements NumericGenerator{
    @Override
    public String generateNumber() {
        return "15-84356-" + Math.abs(new Random().nextInt());
    }
}
