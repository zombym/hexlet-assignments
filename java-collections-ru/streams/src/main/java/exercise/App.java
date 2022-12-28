package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
class App{
    public static int getCountOfFreeEmails(List<String> emails) {
        String filterRegExp = "^.*?(@gmail.com|@yandex.ru|@hotmail.com).*$";
        var count = emails.stream()
                .filter(elem -> elem.matches(filterRegExp))
                .collect(Collectors.toList())
                .size();
        return count;
    }
}
// END
