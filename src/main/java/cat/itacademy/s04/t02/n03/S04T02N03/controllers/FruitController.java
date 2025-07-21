package cat.itacademy.s04.t02.n03.S04T02N03.controllers;

import cat.itacademy.s04.t02.n03.S04T02N03.model.Fruit;
import cat.itacademy.s04.t02.n03.S04T02N03.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruta")
public class FruitController {

    @Autowired
    private FruitService service;

    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit) {
        Fruit created = service.addFruit(fruit);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit) {
        Fruit updated = service.updateFruit(fruit);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable String id) {
        service.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getAll/{id}")
    public ResponseEntity<Fruit> getFruitById(@PathVariable String id) {
        return service.getFruitById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits() {
        List<Fruit> list = service.getAllFruits();
        return ResponseEntity.ok(list);
    }

}
