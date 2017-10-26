package com.manzoni.afair.bestdrag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("dummyController")
public class DummyController {

    @GetMapping(path = "/drag")
    public String getTheDummy() {
        return "Fah, martzafoaico!";
    }
}
