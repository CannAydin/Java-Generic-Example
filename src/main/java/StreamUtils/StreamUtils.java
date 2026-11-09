package StreamUtils;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamUtils {

    List<String> sorted(List<String> list){
        return list.stream().sorted().collect(Collectors.toList());
    }

    List<String> beginningWithT(List<String> list){
        return list.stream().filter(i -> i.startsWith("T")).collect(Collectors.toList());
    }

    List<String> upperCase(List<String> list){
        return list.stream().map(s -> s.toUpperCase((Locale.ENGLISH))).collect(Collectors.toList());
    }

    List<String> everythingCombined(List<String> list){
        return list.stream()
                    .filter(i -> i.startsWith("T"))
                    .sorted()
                    .map(String::toUpperCase).collect(Collectors.toList());
    }
}
