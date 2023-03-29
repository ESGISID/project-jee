package com.example.fillzipcodes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/lol")
public class MEEEE {

    private final Wesh wesh;

    public MEEEE(Wesh wesh) {
        this.wesh = wesh;
    }

    @GetMapping
    public void taMere() throws IOException {
        wesh.yoyoyo();
    }
}
