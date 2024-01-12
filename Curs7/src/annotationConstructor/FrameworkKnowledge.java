package annotation;

import org.springframework.stereotype.Component;

@Component
public class FrameworkKnowledge {
    public String getSomeKnowledge() {
        return "Frameworks are your friend, not your enemy!";
    }
}
