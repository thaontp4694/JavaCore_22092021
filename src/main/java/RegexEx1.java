import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi có chứa ngày tháng năm: ");
        String text1 = new Scanner(System.in).nextLine();
        Pattern pattern = Pattern.compile("([0-2][0-9]|3[0-1])[/-](0[0-9]|1[0-2])[/-]([0-9][0-9])?[0-9][0-9]");
        Matcher matcher = pattern.matcher(text1);

        System.out.format("Ngày tháng có định dạng dd-mm-yyyy hoặc dd/mm/yyyy trong chuỗi %s vừa nhập: \n", text1);
        while (matcher.find()) {
            System.out.println(text1.substring(matcher.start(), matcher.end()));
        }
    }
}