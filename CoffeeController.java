package com.portofolio.coffee_api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    // Data disimpan di memori, hilang saat server dimatikan
    private final List<Coffee> coffees = new ArrayList<>(List.of(
            new Coffee("Kopi Susu Gula Aren", 18000),
            new Coffee("Americano", 15000)
    ));

    @GetMapping("/coffees")
    public List<Coffee> getAll() {
        return coffees;
    }

    @PostMapping("/coffees")
    public Coffee add(@RequestBody Coffee coffee) {
        coffees.add(coffee);
        return coffee;
    }
}
