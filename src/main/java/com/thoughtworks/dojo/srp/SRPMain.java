package com.thoughtworks.dojo.srp;

import java.util.Scanner;

public class SRPMain {

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
