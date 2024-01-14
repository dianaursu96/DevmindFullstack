import lombok.Data;

@Data
public class Test {
    private int number;
    public Test(int number) {
        this.number = number;
    }
}
