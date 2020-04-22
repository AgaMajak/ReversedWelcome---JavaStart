package logic;

import java.util.Scanner;

public class WelcomeLogic {
    private final String[] names = new String[5];

    public void addNamesFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 5 imion:");
        for (int i = 0; names.length > i; i++) {
            String name = scan.nextLine();
            names[i] = name;
        }
        scan.close();
    }

    public void returnWelcomes() {
        for (int i = names.length - 1; i < names.length && i >= 0; i--) {
            System.out.println("Cześć " + names[i]);
        }
    }

}
