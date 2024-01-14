package GenericInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WebDevTeacher {
    @Autowired
    @Qualifier("tipsAndTricksService")
    private ITeachingService teachingService;
    //aplicația devine independentă de implementarea efectivă a interfeței ITeachingService, care
    // poate fi modificată sau înlocuită fără a fi nevoie de o refactorizare.

    public void printKnowledge() {
        System.out.println(teachingService.teachSomething());
    }
}
