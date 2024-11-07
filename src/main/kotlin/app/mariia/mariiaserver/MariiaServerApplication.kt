package app.mariia.mariiaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MariiaServerApplication

fun main(args: Array<String>) {
    runApplication<MariiaServerApplication>(*args)
}
