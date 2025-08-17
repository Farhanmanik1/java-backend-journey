public class xtoend {

    public static void elementtoend(String str, int idx, int count, String start) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                start = start + 'x';
            }
            System.out.println(start);
            return;
        }

        char currentChar = str.charAt(idx);
        if (currentChar == 'x') {
            count++;
            elementtoend(str, idx + 1, count, start);

        } else {
            start = start + currentChar;
            elementtoend(str, idx + 1, count, start);
        }
    }

    public static void main(String[] args) {
        String str = "Faxrhxaxn";
        elementtoend(str, 0, 0, "");
    }
}
