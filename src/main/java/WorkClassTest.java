import java.text.SimpleDateFormat;
import static org.junit.Assert.*;
import java.util.Date;


public class WorkClassTest {

    @org.junit.Test
    public void getTime() throws Exception {
        Date date = new Date();
        SimpleDateFormat correctTimeFormat = new SimpleDateFormat("HH:mm");
        assertEquals(WorkClass.GetTime(),correctTimeFormat.format(date));
    }

    @org.junit.Test
    public void getHelpTest() throws Exception {
        String correct = "Приветсвую вас! Данный бот умеет \n" +
                "1. Ввывода справочной информации\n" +
                "2. Ввывод времени\n" +
                "Если вы хотите получить справочную информацию введите help\n" +
                "Eсли вы хотите узнать настоящее время введите time\n" +
                "Спасибо, что остаётесь с нами!";
        assertEquals(WorkClass.GetHelp(), correct);
    }
}