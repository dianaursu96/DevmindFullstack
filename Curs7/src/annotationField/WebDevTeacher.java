package annotationField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebDevTeacher  implements ITeacher {
    @Autowired(required = false)
    TipsAndTricksService tipsAndTricksService;

    @Autowired
    FrameworkKnowledge frameworkKnowledge;

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
