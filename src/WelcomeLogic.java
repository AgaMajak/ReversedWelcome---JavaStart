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

    void showNames() {
        for (String allnames : names) {
            System.out.println(allnames);
        }
    }

}
