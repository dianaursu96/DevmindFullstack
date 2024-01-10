import lombok.Data;

public class Main {
    public static void main(String[] args) {
        Test test = new Test(5);
        test.setNumber(6);
        System.out.println(test.getNumber());

    }
}