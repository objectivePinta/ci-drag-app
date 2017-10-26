package com.manzoni.afair.bestdrag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController("dummyController")
public class DummyController {

    @GetMapping(path = "/drag")
    public String getTheDummy() {
        return "Martzafoaico, este ora " + Instant.now() + " Afara! Afara!";
    }
}
