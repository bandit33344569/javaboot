import java.util.Scanner;

public class BotTransport {
    public static void update() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            if (command.equals("help")) {
                WorkClass.SendString(WorkClass.GetHelp());
            } else if (command.equals("time")) {
                WorkClass.SendString(WorkClass.GetTime());
            } else {
                WorkClass.SendString("Команда не распознана.");
            }
        }

    }
}
