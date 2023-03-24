package hexlet.code;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    System.out.println("Welcome to the Brain Games!");
    System.out.print("May I have your name? " );

    String name = Cli.getInputText();
    System.out.println("Hello, " + name);
  }
}
