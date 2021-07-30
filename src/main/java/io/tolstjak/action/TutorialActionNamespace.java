package io.tolstjak.action;

import io.tolstjak.service.TutorialFinderService;

public class TutorialActionNamespace {

    public String execute() {
        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        String bestTutorialSite = tutorialFinderService.getBestTutorialSite();
        System.out.println(bestTutorialSite);
        return "success";
    }
}
