import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();

        Instant start = Instant.now();

        for (int i = 0; i < 1_000_000; i++) {
            s.append( "A");
        }

        String string =s.toString();

        Instant end = Instant.now();
        System.out.println("Duration = " + Duration.between(start, end).toMillis());
    }
}