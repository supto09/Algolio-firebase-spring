package example.firebase.algolio.config

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import java.io.FileInputStream
import javax.annotation.PostConstruct


@Configuration
class FirebaseConfig {
    @Value("\${rs.firebase.config.path}")
    private val configPath: String? = null

    @PostConstruct
    fun init() {
        val inputStream = FileInputStream(configPath)

        val options: FirebaseOptions = FirebaseOptions.builder().apply {
            setCredentials(GoogleCredentials.fromStream(inputStream))
        }.build()

        FirebaseApp.initializeApp(options)
    }
}