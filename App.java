import java.time.LocalTime;
public class App {
    public static void main(String[] args) throws InterruptedException {
        LocalTime agora = LocalTime.now();
        while (true) {
            agora = LocalTime.now();
            System.out.println(agora);
            Thread.sleep(1000);
    }
    }}

