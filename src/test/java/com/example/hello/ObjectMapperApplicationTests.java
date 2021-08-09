package com.example.hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ObjectMapperApplicationTests {
    @Test
    void contextLoads() {
        System.out.println("---------");
        // Text Json -> Object
        // Object -> Text JSON

        // controller req json(text) -> object
        // response object -> json(text)

        var objectMapper = new ObjectMapper();

        // object -> text
        var user = new User("steve", 10);
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // text -> object

    }
}
