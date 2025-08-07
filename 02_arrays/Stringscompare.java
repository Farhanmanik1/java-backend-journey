public class Stringscompare {
    public static void main(String[] args) {
        // String a = "Hello";
        // String b = "Hello";
        // if (a.compareTo(b) == 0) {
        // System.out.println("Both strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        String sentence = "My name is Farhan";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
        String Fullname = "FarhanManik";
        String firstName = Fullname.substring(0, 6);
        System.out.println(firstName);
    }
}
