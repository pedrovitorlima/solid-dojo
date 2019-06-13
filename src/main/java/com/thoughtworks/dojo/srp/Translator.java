package com.thoughtworks.dojo.srp;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    private static final int STRANGE_WORD = 0;
    private static final int WHAT_STRANGE_WORD_MEAN = 1;

    private Map<String, String> dictionary = new HashMap<String, String>();

    public String foo(String command) {

        String answer;

        try {
            if (command.startsWith("what is ")) {
                answer = whatMeans(command);
            } else if (command.contains(" means ")) {
                feedDictionary(command);
                answer = "Dictionary was fed.";
            } else {
                throw new Exception();
            }
        }catch (Exception exception) {
            answer =  "Can't understand...";
        }
        return answer;
    }

    private String whatMeans(String command) throws Exception {
        String word = command.replace("what is ", "").replace("?", "");
        String whatWordMeans = this.dictionary.get(word);

        if (whatWordMeans == null) {
            throw new Exception();
        }

        return whatWordMeans;
    }

    private void feedDictionary(String command) {
        String[] words = command.split(" means ");
        this.dictionary.put(words[STRANGE_WORD], words[WHAT_STRANGE_WORD_MEAN]);
    }

}
