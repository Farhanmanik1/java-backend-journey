public class loops2 {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // if (i == 0 || i == 4 || j == 0 || j == 4) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 0; i <= 5; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < 5; i++) {
        // for (int j = 5; j > i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i <= 5; i++) {
        // for (int j = 4; j > i - 1; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // for (int i = 0; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // int num = 1;
        // for (int i = 0; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;
        // }
        // System.out.println();
        // }

        int num = 1;
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}