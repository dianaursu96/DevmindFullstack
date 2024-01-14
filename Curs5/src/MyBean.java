

public class MyBean {
    static int objectCounter = 0;
    public MyBean() {
        objectCounter++;
        System.out.println("Current number of instances: " + objectCounter);
    }
}
