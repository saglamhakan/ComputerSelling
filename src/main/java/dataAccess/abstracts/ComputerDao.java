package dataAccess.abstracts;

import entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerDao extends JpaRepository<Computer, Integer> {


}
