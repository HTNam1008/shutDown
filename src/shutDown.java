import java.io.IOException;

public class shutDown {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("cmd /c shutdown -s -t 0");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
