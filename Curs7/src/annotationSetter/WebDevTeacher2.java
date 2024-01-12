package annotationSetter;

import annotationConstructor.FrameworkKnowledge;
import annotationConstructor.ITeacher;
import annotationConstructor.TipsAndTricksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebDevTeacher implements ITeacher {
    FrameworkKnowledge frameworkKnowledge;
    TipsAndTricksService tipsAndTricksService;
    @Autowired
    public void setTipsAndTricksService(TipsAndTricksService tipsAndTricksService) {
        this.tipsAndTricksService = tipsAndTricksService;
    }

    @Autowired
    public void setFrameworkKnowledge(FrameworkKnowledge frameworkKnowledge) {
        this.frameworkKnowledge = frameworkKnowledge;
    }


    public void printKnowledge() {
        System.out.println(frameworkKnowledge.getSomeKnowledge());
    }

    public void printTip() {
        if (tipsAndTricksService != null) {
            System.out.println(tipsAndTricksService.getTip());
        }
    }
    @Override
    public String getHomework() {
        return "Create your server backend context!";
    }
}
