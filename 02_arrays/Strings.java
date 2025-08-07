public class Strings {
    public static void main(String[] args) {
        String firstName = "tony";
        String secondName = "stark";
        String fullName = firstName + " " + secondName;
        System.out.println(fullName.length());

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
