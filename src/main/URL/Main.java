package main.URL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url  = new URL("https://ya.ru/search/?text=fatal%3A+refusing+to+merge+unrelated+histories&lr=213");
        Scanner scanner = new Scanner(url.openStream());
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}
