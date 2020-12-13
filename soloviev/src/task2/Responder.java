package task2;

import java.util.Scanner;

class Responder {
    private String text = "";

    public Responder(){
        this.text = "";
    }
    public void input() {
        String line = null;
        Scanner scan = new Scanner(System.in);
        line = scan.nextLine();
        while(!(line.isEmpty())){
            this.text += line + "\n";
            line = scan.nextLine();
        }
    }
    public void output(){
        System.out.println(this.text);
        }
    }