package io.tolstjak.action;

import io.tolstjak.service.TutorialFinderService;

public class TutorialActionTags {

    private String bestTutorialSite;

    public String getBestTutorialSite() {
        return bestTutorialSite;
    }

    public void setBestTutorialSite(String bestTutorialSite) {
        this.bestTutorialSite = bestTutorialSite;
    }

    public String execute() {
        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        bestTutorialSite = tutorialFinderService.getBestTutorialSite();

        return "success";
    }


}
