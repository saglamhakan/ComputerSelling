package wepApi.Controller;

import business.abstracts.ComputerService;
import entities.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/computers/api")
public class ComputersController {

    private final ComputerService computerService;

    @Autowired
    public ComputersController(ComputerService computerService) {
        this.computerService = computerService;
    }
    @GetMapping
    public List<Computer> getAll() {
        return this.computerService.getAll();
    }
    @PutMapping
    public void add(Computer computer){
        this.computerService.add(computer);
    }
    @DeleteMapping
    public void delete(Computer computer){
        this.computerService.delete(computer);
    }

}
