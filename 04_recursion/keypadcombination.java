public class keypadcombination {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int idx, String Combination) {

        if (idx == str.length()) {
            System.out.println(Combination);
            return;
        }

        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, Combination + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "23";
        String combination = "";
        printComb(str, 0, combination);
    }
}
