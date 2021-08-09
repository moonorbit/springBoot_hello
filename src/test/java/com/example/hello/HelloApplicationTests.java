package com.example.hello;

import com.example.hello.dto.UserTestDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {
    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("hello");

        // Text JSON -> Object
        // Object -> Text JSON

        // controller req json(text) -> object
        // response object -> json(text)

        var objectMapper = new ObjectMapper();

        // object -> text
        // object mapper get method 를 활용한다. (method 명에 get 이 들어가면 error 가 난다)
        var user = new UserTestDto("steve", 10, "010-1111-2222");

        String text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // text -> object
        // object mapper 는 default 생성자를 필요로 한다.
        var objectUser = objectMapper.readValue(text, UserTestDto.class);
        System.out.println(objectUser);
    }
}
