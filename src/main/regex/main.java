package main.regex;

public class main {
    public static void main(String[] args) {
        String s = "jkla";
        if(s.matches("\\w{4}")){
            System.out.println(true);
        }
        if(s.equalsIgnoreCase("Java")){
            System.out.println("equals");
        }else System.out.println("not equals");
    }
}
