import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// sử dụng chú thích @ParameterizedTest để cho phép kiểm thử với nhiều cặp giá trị đầu vào khác nhau. 
//Các giá trị đầu vào được chỉ định bằng cách sử dụng chú thích @CsvSource
public class CalculatorTest {
        @ParameterizedTest
    @CsvSource({
            "1, 1, 2",

    })
    public void testAdd(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 0",

    })
    public void testSubtract(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(a, b);
        assertEquals(expected, result);
    }
}