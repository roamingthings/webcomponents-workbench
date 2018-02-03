package de.roamingthings.webcomponentsworkbench

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam



/**
 *
 *
 * @author Alexander Sparkowsky [info@roamingthings.de]
 * @version 2018/02/03
 */
@Controller
class GreetingController {
    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", required = false, defaultValue = "World") name: String, model: Model): String {
        model.addAttribute("name", name)
        return "greeting"
    }
}