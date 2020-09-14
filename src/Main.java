import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("String 1 eingeben: ");
        String s1 = sc.nextLine();
        System.out.println("String 2 eingeben: ");
        String s2 = sc.nextLine();

        String gemeinsam = "";

        if (s1.length() < s2.length()) {
            String temp = s2;
            s2 = s1;
            s1 = temp;
        }

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length() - i; j++) {
                String teilString = s1.substring(j, j + i);
                if (s2.contains(teilString)) {
                    gemeinsam = teilString;
                }
            }
        }

        System.out.println(gemeinsam);

    }

}

