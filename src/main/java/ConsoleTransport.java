import java.util.Scanner;

public class ConsoleTransport {

    public static void Update() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String command = scanner.nextLine().trim();
            switch (command) {
                case "help":
                    SendString(WorkClass.GetHelp());
                    break;
                case "time":
                    SendString(WorkClass.GetTime());
                    break;
                case "get data":
                    break;
                default:
                    SendString("В арсенале чат бота нет такой команды\n" + "Для того чтобы узнать команду введите:\n" + "help");
                    break;
            }
        }
    }

    public static void SendString(String str) {
        System.out.println(str);
    }
}
