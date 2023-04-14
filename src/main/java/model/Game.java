package model;

import java.util.Random;

public class Game {
    public static int RandomNumber() {
        Random random = new Random();
        int number = 1 + random.nextInt(3 - 1);
        return number;
    }

    public static String ChoiceIntToString(int chosenNumber) {
        String serverChoice = "";
        switch (chosenNumber) {
            case 1:
                serverChoice = "pierre";
                break;
            case 2:
                serverChoice = "feuille";
                break;
            case 3:
                serverChoice = "ciseaux";
                break;
            default:
                serverChoice = "error";
                break;
        }
        return serverChoice;
    }

    public static int comparison(String serverChoice, String playerChoice) {
        int result = 2;
        if (playerChoice.equals(serverChoice))
            result = 0;
        if (playerChoice.equals("ciseaux") && serverChoice.equals("pierre"))
            result = 1;
        if (playerChoice.equals("pierre") && serverChoice.equals("feuille"))
            result = 1;
        if (playerChoice.equals("feuille") && serverChoice.equals("ciseaux"))
            result = 1;
        if (playerChoice.equals("feuille") && serverChoice.equals("pierre"))
            result = -1;
        if (playerChoice.equals("pierre") && serverChoice.equals("ciseaux"))
            result = -1;
        if (playerChoice.equals("ciseaux") && serverChoice.equals("feuille"))
            result = -1;

        return result;
    }

    public static String results(String serverChoice, String playerChoice) {
        String msg = "";
        int result = comparison(playerChoice, serverChoice);
        switch (result) {
            case -1:
                msg = "lost ( ´•︵•` )";
                break;
            case 0:
                msg = "equal ( ◐ o ◑ )";
                break;
            case 1:
                msg = "winner (=^_^=)";
                break;
        }
        return msg;
    }
}
