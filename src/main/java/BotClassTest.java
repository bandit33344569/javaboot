import org.junit.Test;

import static org.junit.Assert.*;

public class BotClassTest {

    @Test
    public void getTime() {

    }

    @Test
    public void getHelpTest() throws Exception {
        String correct = "Приветсвую вас! Данный бот не умеет ничего, кроме\n1." +
                " Ввывода справочной информации\n2. Ввывод времени\nЕсли вы " +
                "хотите получить справочную информацию введите help\nEсли вы " +
                "хотите узнать настоящее время введите time\nСпасибо, что остаётесь с нами!";
        assertEquals(WorkClass.GetHelp(),correct);
    }
}