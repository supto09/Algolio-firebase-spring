package example.firebase.algolio

import com.google.firebase.auth.FirebaseAuth
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class TestController {
    @GetMapping("/")
    fun hello(): String {

        var page = FirebaseAuth.getInstance().listUsers(null)
        while (page != null) {
            for (user in page.values) {
                println("User: " + user.uid)
            }
            page = page.nextPage
        }

        return "Hello mars 7";
    }
}