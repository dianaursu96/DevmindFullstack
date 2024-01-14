package annotation;

import org.springframework.stereotype.Component;

// @Component
public class SpringTeacher implements ITeacher {
    @Override
    public String getHomework() {
        return "Create your server backend context!";
    }
}
