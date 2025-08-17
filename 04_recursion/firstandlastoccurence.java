public class firstandlastoccurence {

    // we initialize them to minus 1 as we cannot assign them 0 as indexing starts
    // from 0 and it might create confusion
    public static int first = -1;
    public static int last = -1;

    public static void fandloccurence(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentchar = str.charAt(idx);
        if (currentchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        fandloccurence(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "FarhanManik";
        fandloccurence(str, 0, 'a');

    }
}
