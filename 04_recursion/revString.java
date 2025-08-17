public class revString {
    public static void revPrint(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        revPrint(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "Farhan";
        revPrint(str, str.length() - 1);
    }
}
