package br.com.esportes.estudos.optionals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static java.util.Optional.of;

@SpringBootTest
public class PersonTests {

    @Test
    public void flatMap(){
        Person person = new Person("Daniel", 22, "abcdefg");

        //Map encapsula o retorno com um optional
        //O retorno é um optional, logo, o resultado é um optional encapsulando um optional
        //O flatMap se propõe a resolver isso, desembrulhando o optional interno e retornando seu valor
        Optional<String> name = of(person).flatMap(Person::getName);
        System.out.println(name.orElseGet(() -> "nada"));
    }
}
