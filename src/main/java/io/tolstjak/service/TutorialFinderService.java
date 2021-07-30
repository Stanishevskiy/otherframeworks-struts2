package io.tolstjak.service;

public class TutorialFinderService {

    public String getBestTutorialSite() {
        return "Java Brains";
    }

    public String getBestTutorialSite(String language) {
        if (language.equals("java")) {
            return "Java Brains";
        } else {
            return "Language not supported yet!";
        }
    }
}
