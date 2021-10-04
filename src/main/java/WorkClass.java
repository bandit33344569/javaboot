import java.util.Date;
import java.util.Scanner;

public class WorkClass {
    public static String GetTime(){
        Date date = new Date();
        String[] strArray = date.toString().split(" ");
         String[] d =  strArray[3].split(":");
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

}
