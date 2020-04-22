import logic.WelcomeLogic;

class WelcomeMain {
    public static void main(String[] args) {

        WelcomeLogic welcome = new WelcomeLogic();

        welcome.addNamesFromUser();
        welcome.returnWelcomes();

    }
}
