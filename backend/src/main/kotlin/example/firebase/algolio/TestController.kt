package example.firebase.algolio

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/")
    fun hello():String{
        return "Hello mars 7";
    }
}