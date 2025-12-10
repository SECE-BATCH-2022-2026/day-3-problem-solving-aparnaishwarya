import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vowelCount {

    public static int vow_count(String inp) {
        Matcher m = Pattern.compile("[aeiouAEIOU]").matcher(inp);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(vow_count(str));
    }
}
