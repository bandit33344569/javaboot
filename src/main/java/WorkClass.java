import java.util.Date;
import java.util.Scanner;

public class WorkClass {
    public static void SendString (String str){
        System.out.println(str);
    }
    public static void GetTime(){
        Date date = new Date();
        System.out.println(java.time.ZonedDateTime.now());
        System.out.println( date);
    }
    public static void GetHelp(){
        SendString("Приветсвую вас! Данный бот умеет \n" +
                "1. Ввывода справочной информации\n" +
                "2. Ввывод времени\n" +
                "Если вы хотите получить справочную информацию введите help\n" +
                "Eсли вы хотите узнать настоящее время введите time\n" +
                "Спасибо, что остаётесь с нами!");
    }

    public static void Update(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            String command = scanner.nextLine().trim();
            switch (command){
                case "help": GetHelp(); break;
                case "time" : GetTime(); break;
                case "get data":  break;
                default: SendString("В арсенале чат бота нет такой команды\n"+"Для того чтобы узнать команду введите:\n"+"help");break;


            }
        }

    }
}
