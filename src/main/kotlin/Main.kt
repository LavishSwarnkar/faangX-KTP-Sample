import com.faangx.ktp.simpleInterestApp
import com.faangx.ktp.textApp

fun main() {
    simpleInterestApp { p, r, t ->
        p * r * t / 100f
    }

//    textApp {
//        "Hola!"
//    }
}