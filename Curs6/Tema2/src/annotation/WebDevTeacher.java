package annotation;

import org.springframework.stereotype.Component;

// @Component("ourOwnDevTeacher")
public class WebDevTeacher implements ITeacher {
    @Override
    public String getHomework() {
        return "Create your server backend context!";
    }
}