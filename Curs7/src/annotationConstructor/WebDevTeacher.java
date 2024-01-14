package annotationConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebDevTeacher implements ITeacher {
    FrameworkKnowledge frameworkKnowledge;
    TipsAndTricksService tipsAndTricksService;

    @Autowired  (required = false)
    public WebDevTeacher(FrameworkKnowledge frameworkKnowledge) {
        this.frameworkKnowledge = frameworkKnowledge;
    }
    @Autowired (required = false) // daca avem un singur constructor, Autowired e implicit default
            // dar daca avem mai multi trebuie specificat care primeste Autowired
    public WebDevTeacher(TipsAndTricksService tipsAndTricksService,
                         FrameworkKnowledge frameworkKnowledge) {
        this.tipsAndTricksService = tipsAndTricksService;
        this.frameworkKnowledge = frameworkKnowledge;
    }

    public void printKnowledge() {
        System.out.println(frameworkKnowledge.getSomeKnowledge());
    }
    @Override
    public String getHomework() {
        return "Create your server backend context!";
    }
}