import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi có chứa email: ");
        String text2 = new Scanner(System.in).nextLine();
        Pattern pattern = Pattern.compile("[A-Za-z]+[A-Za-z0-9_-][^-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})");
        Matcher matcher = pattern.matcher(text2);

        System.out.format("Email trong chuỗi %s vừa nhập: \n", text2);
        while (matcher.find()) {
            System.out.println(text2.substring(matcher.start(), matcher.end()));
        }
    }
}