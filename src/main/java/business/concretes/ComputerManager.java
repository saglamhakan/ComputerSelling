package business.concretes;

import business.abstracts.ComputerService;
import dataAccess.abstracts.ComputerDao;
import entities.Computer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ComputerManager implements ComputerService {

    @Autowired
    public ComputerDao computerDao;

    @Autowired
    public ComputerManager(ComputerDao computerDao){
        this.computerDao=computerDao;
    }
    @Override
    public List<Computer> getAll() {
        return this.computerDao.findAll();
    }

    @Override
    public void add(Computer computer) {
     this.computerDao.save(computer);

    }


    @Override
    public void delete(Computer computer) {
        this.computerDao.delete(computer);

    }


}
