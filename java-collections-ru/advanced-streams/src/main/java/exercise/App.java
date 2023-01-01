package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
    class App {
        public static String getForwardedVariables(String input) {
            String filterRegExp = "^environment.*";
            var result = Arrays.stream(input.split("\n"))
                    .filter(elem -> elem.matches(filterRegExp))
                    .map(elem -> elem.substring(13, elem.length()-1)).map(x -> {
                        var lst = x.split(",");
                        return Arrays.stream(lst)
                                .filter(elem->elem.matches("^X_FORWARDED.*"))
                                .map(elem -> elem.substring(12))
                                .collect(Collectors.joining(","));
                    })
                    .collect(Collectors.toList());
            return result.stream().filter(elem -> !elem.isEmpty()).collect(Collectors.joining(","));
        }
}
//END
