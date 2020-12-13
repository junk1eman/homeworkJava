package task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Responder {
    private String text;

    public Responder() {
        this.text = "";
    }

    public void input() {
        String line = null;
        Scanner scan = new Scanner(System.in);
        line = scan.nextLine();
        while (!(line.isEmpty())) {
            this.text += line + "\n";
            line = scan.nextLine();
        }
    }

    public void output() {
        System.out.println(this.text);
    }

    public  void reader(String path) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(path));
        String line = in.readLine();
        while(line != null){
            System.out.println(line);
            line = in.readLine();
        }
        in.close();

}}