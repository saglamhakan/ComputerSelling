package business.abstracts;

import entities.Computer;

import java.util.List;

public interface ComputerService {

    List<Computer> getAll();

    void add(Computer computer);
    void delete(Computer computer);

}
