package ru.netology.sqr.javasqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.sqr.javasqr.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    //   @CsvSource({
    //           "3,200,300",
    //           "0,0,99",
    //           "0,9802,100000"
    //   })
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void testCalcAll(int expected, int a, int b) {
        SQRService service = new SQRService();
        int actual = service.calcSqr(a, b);

        Assertions.assertEquals(expected, actual);
    }
}

