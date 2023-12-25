package com.example.dec;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {

    @PostMapping("/accept")
    public JwtToken acceptJwt(@RequestBody JwtToken jwtToken){
        System.out.println(jwtToken);
        return jwtToken;
    }
}
