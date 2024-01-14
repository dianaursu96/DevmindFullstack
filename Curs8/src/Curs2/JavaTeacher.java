package Curs2;


public class JavaTeacher implements ITeacher {
    private WisdomWordsService wisdomService;
    private int age;
    private String workPlace;


    // constructor unic care primeste ca parametru un obiect de tipul WisdomWordsService
    public JavaTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;

    }
    @Override
    public String getHomework() {
        return "message";
    }


    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }

}
