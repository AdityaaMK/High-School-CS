@FunctionalInterface
interface FormatInterface {
    public String format(String name, int age);
}

@FunctionalInterface
interface CountVowelsInterface {
    public int countVowels(String str);
}

public class LambdaExpressions {
    public static void main (String[] args) {
        FormatInterface formatInterface = (String name, int age) -> name + " is " + age + " years old.";
        System.out.println(formatInterface.format("Adityaa Magesh Kumar", 16));

        CountVowelsInterface countVowelsInterface = (String str) -> {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e' || str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o' || str.toLowerCase().charAt(i) == 'u') {
                    count++;
                }
            }

            return count;
        };
        System.out.println(countVowelsInterface.countVowels("Adityaa Magesh Kumar"));
    }
}
