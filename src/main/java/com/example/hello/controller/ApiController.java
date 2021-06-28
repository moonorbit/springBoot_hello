package com.example.hello.controller;

import com.example.hello.dto.UserDto;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
=======
>>>>>>> 70ec1761363035f2dfb68fff0e51417a006af997
import org.springframework.web.bind.annotation.*;

@RestController // 해당 CLASS 는 REST API  처리하는 Controller
@RequestMapping("/api") // RequestMapping URI 를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello") // http://loaclhost:9090/api/hello
    public String hello() {
        return "hello spring boot!";
    }

<<<<<<< HEAD
    // TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    // JSON
    // request -> object mapper -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public UserDto json(@RequestBody UserDto userDto) {
        return userDto; // 200 OK
    }

    // ResponseEntity
    @PutMapping("/put/response-entity")
    public ResponseEntity<UserDto> put(@RequestBody UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }
}
=======
    @PostMapping("/json")
    public UserDto json(@RequestBody UserDto userDto) {
        return userDto;
    }
}
>>>>>>> 70ec1761363035f2dfb68fff0e51417a006af997
