import java.util.*;


public class BotClass {

    public static void main(String[] args){
        while (true){
           ConsoleTransport.SendString("Ведите команду ");
           ConsoleTransport.Update();
        }
    }
}
