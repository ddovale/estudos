package br.com.esportes.estudos.supplier;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.function.Supplier;

@SpringBootTest
public class SupplierTests {

    @Test
    void testLocalDateTime() throws InterruptedException {
        Supplier<LocalDateTime> s = () -> {
            System.out.println("----- SUPPLIER ACTIVATED -----");
            return LocalDateTime.now();
        };
        System.out.println("Generated local date time at " + LocalDateTime.now());

        Thread.sleep(10000);
        System.out.println(s.get());
    }

}
