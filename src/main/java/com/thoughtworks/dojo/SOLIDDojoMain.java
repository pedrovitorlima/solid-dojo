package com.thoughtworks.dojo;

import java.util.Scanner;

public class SOLIDDojoMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Translator translator = new Translator();

        while(scanner.hasNextLine()) {
            String command = scanner.nextLine();
            System.out.println(translator.foo(command));
        }

        scanner.close();
    }
}
