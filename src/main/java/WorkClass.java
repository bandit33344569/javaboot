import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;

public class WorkClass {
    public static void SendString (String str){
        System.out.println(str);
    }

    public static String GetTime(){
        Date date = new Date();
        String[] strArray = date.toString().split(" ");
        String[] d = strArray[3].split(":");
        return d[0]+ ":"+d[1];
    }
    public static String GetHelp(){
        return "Приветсвую вас! Данный бот умеет \n" +
                "1. Ввывода справочной информации\n" +
                "2. Ввывод времени\n" +
                "Если вы хотите получить справочную информацию введите help\n" +
                "Eсли вы хотите узнать настоящее время введите time\n" +
                "Спасибо, что остаётесь с нами!";
    }

    public static void Update(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            String command = scanner.nextLine().trim();
            switch (command){
                case "help": SendString(GetHelp()); break;
                case "time" : SendString(GetTime()); break;
                case "get data":  break;
                default: SendString("В арсенале чат бота нет такой команды\n"+"Для того чтобы узнать команду введите:\n"+"help");break;
            }
        }

    }
}
