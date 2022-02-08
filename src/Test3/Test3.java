package Test3;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test3 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split(" ");

        List li = Arrays.stream(s).map(o -> toUpper(o)).collect(Collectors.toList());
        li.forEach(System.out::println);

        Pattern pattern = Pattern.compile("[аеёиоуыэюя]", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

        List l = Arrays.stream(s).sorted(Comparator.comparingInt(o -> -count(pattern, o))).collect(Collectors.toList());
        l.forEach(System.out::println);
    }

    int count(Pattern p, String s) {
        Matcher m = p.matcher(s);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }

    String toUpper(String s) {
        final String vowels = "аеёиоуыэюя";
        for (int index = 0; index < s.length(); index++) {
            if (vowels.contains(String.valueOf(s.charAt(index)))) {
                StringBuffer sb = new StringBuffer(s);
                sb.setCharAt(index, s.toUpperCase().charAt(index));
                s = sb.toString();
                break;
            }
        }
        return s;
    }

}
