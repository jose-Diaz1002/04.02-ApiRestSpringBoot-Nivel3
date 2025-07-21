package cat.itacademy.s04.t02.n03.S04T02N03.services.impl;

import cat.itacademy.s04.t02.n03.S04T02N03.exception.ResourceNotFoundException;
import cat.itacademy.s04.t02.n03.S04T02N03.model.Fruit;
import cat.itacademy.s04.t02.n03.S04T02N03.repository.FruitRepository;
import cat.itacademy.s04.t02.n03.S04T02N03.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService {
    @Autowired
    private FruitRepository repository;

    @Override
    public Fruit addFruit(Fruit fruit) {
        return repository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        if (fruit.getId() == null || !repository.existsById(fruit.getId())) {
            throw new RuntimeException("Fruit with ID " + fruit.getId() + " does not exist.");
        }
        return repository.save(fruit);
    }

    @Override
    public void deleteFruit(String id) {

        repository.deleteById(id);
    }

    @Override
     public Optional<Fruit> getFruitById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Fruit> getAllFruits() {
        return repository.findAll();
    }
}
