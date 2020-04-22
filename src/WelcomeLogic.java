import java.util.Scanner;

class WelcomeLogic {
    String[] names = new String[5];

    void addNamesFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 5 imion:");
        for (int i = 0; names.length > i; i++) {
            String name = scan.nextLine();
            names[i] = name;
        }
    }

    void returnWelcomes() {
        for (int i = names.length - 1; i < names.length && i >= 0; i--) {
            System.out.println("Cześć " + names[i]);
        }
    }

}
