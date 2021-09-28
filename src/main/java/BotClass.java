import java.util.*;


public class BotClass {
    
    public static void getTime(){
        Date date = new Date();
        sendMessage(date.toString());
    }

    public static void getHelp(){
        sendMessage("Приветсвую вас! Данный бот не умеет ничего, кроме\n" +
                    "1. Ввывода справочной информации\n" +
                    "2. Ввывод времени\n" +
                    "Если вы хотите получить справочную информацию введите help\n" +
                    "Eсли вы хотите узнать настоящее время введите time\n" +
                    "Спасибо, что остаётесь с нами!");
    }

    public static void sendMessage(String message){
        System.out.println(message);
    }

    public static void update(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            String command = scanner.nextLine();
            if (command.equals("help"))
                getHelp();
            else if (command.equals("time"))
                getTime();
            else
                sendMessage("Команда не распознана.");
        }
    }

    public static void main(String[] args){
        while (true){
            sendMessage("Введите команду:");
            update();
        }
    }
}
