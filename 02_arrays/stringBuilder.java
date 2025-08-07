public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Farhan");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(5, 'm');
        System.out.println(sb);

        // insert char
        sb.insert(1, 'a');
        System.out.println(sb);

        // delete char
        sb.delete(1, 2);
        System.out.println(sb);

        // append in a string
        sb.append(" ");
        sb.append("M");
        sb.append("a");
        sb.append("n");
        sb.append("i");
        sb.append("k");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}