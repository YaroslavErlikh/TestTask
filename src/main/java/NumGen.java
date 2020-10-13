import java.util.List;

public class NumGen {

    private final NumsToString3Digit<Integer, String> nts = from -> {
        StringBuilder str = new StringBuilder();
        str.append(from);

        if (str.length() < 3) {
            for (int i = 0; i < 3; i++) {
                str.insert(0, 0);
                if (str.length() == 3) {
                    return str.toString();
                }
            }
        }
        return str.toString();
    };

    public String generateNum(List<Integer> numbers) {

        for (int i = 0; i < numbers.size() - 1; i++) {
            if ((numbers.get(i) + 1) != numbers.get(i + 1)) {
                return nts.convert(numbers.get(i) + 1);
            }
        }
        return nts.convert(numbers.get(numbers.size() - 1) + 1);
    }
}
