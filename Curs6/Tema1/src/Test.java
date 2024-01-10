import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
// @Getter
// @Setter
public class Test {
    private int number;
    public Test(int number) {
        this.number = number;
    }
}
