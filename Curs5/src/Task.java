import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

public class Task {
    private String taskName;
    private Integer taskId;
    private Integer executionTime;
    public static Integer numberOfTasks = 0;
    static Random random = new Random();
    public Task() {
    }
    private static void run(int executionTime) throws InterruptedException {
        int miliseconds = executionTime * 1000;
        Thread.sleep(miliseconds);
    }
    public static int generateID() {
        return random.nextInt(Integer.MAX_VALUE);
    }
    @PostConstruct
    private void init() {
        numberOfTasks++;
        taskId = generateID();
        taskName = "Task" + taskId;
        executionTime = random.nextInt(21);
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Task with the taskId " + taskId + " was destroyed");
        numberOfTasks--;
    }
}
