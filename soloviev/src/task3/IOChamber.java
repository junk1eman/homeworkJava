package task3;

import java.io.IOException;


public class IOChamber {
    public static void main(String[] args) {
        if(args.length != 0){
        try {
            Responder Responder = new Responder();
            Responder.reader(args[0]);
        } catch (IOException e) {
            System.out.println("Файл не распознан. Введите ваши сообщения");
            Responder Responder = new Responder();
            Responder.input();
            Responder.output();
        }}
        else{Responder Responder = new Responder();
            System.out.println("Файл не распознан. Введите ваши сообщения");
            Responder.input();
            Responder.output();
        }
        System.out.println(args[0]);
    }
}
