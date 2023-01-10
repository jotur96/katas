import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Calendar day = Calendar.getInstance();

        if (day.get(Calendar.DAY_OF_YEAR) == 256) {
            System.out.println("Feliz dia del programador! c:");
        }
    }
}
