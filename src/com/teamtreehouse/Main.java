package com.teamtreehouse;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String story = "Thanks __name__ for helping me out.  You are really a __adjective__ __noun__ and I owe you a __noun__.";
        Template tmpl = new Template(story);

        Prompter prompter = new Prompter();

        List<String> userWords = prompter.run(tmpl);

        String results = tmpl.render(userWords);
        System.out.printf("Your TreeStory:%n%n%s", results);
    }
}
