package io.tolstjak.action;

import io.tolstjak.service.TutorialFinderService;

public class TutorialActionInputGetParameters {

    private String bestTutorialSite;
    private String language;

    public String getBestTutorialSite() {
        return bestTutorialSite;
    }

    public void setBestTutorialSite(String bestTutorialSite) {
        this.bestTutorialSite = bestTutorialSite;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String execute() {
        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));

        return "success";
    }


}
