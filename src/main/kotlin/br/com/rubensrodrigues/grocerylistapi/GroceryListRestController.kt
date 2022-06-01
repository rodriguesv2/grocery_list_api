package br.com.rubensrodrigues.grocerylistapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GroceryListRestController {

    @GetMapping("/test")
    fun test(): Test {
        return Test("Test", 60)
    }
}

data class Test(
        val name: String,
        val age: Int,
)