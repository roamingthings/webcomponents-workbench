package de.roamingthings.webcomponentsworkbench

import mu.KotlinLogging
import org.springframework.http.HttpStatus.NO_CONTENT
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.MediaType.TEXT_PLAIN_VALUE
import org.springframework.web.bind.annotation.*

/**
 *
 *
 * @author Alexander Sparkowsky [info@roamingthings.de]
 * @version 2018/02/03
 */

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping(value = ["/datelogs"], consumes = [APPLICATION_JSON_VALUE])
class DateLoggerController {

    @PostMapping(consumes = [TEXT_PLAIN_VALUE])
    @ResponseStatus(NO_CONTENT)
    fun postDatelog(@RequestBody body: String) {
        logger.info { "Received value: $body" }
    }
}