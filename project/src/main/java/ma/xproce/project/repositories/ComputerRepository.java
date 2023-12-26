package ma.xproce.project.repositories;

import ma.xproce.project.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer,Long> {
    public List<Computer> getComputerByProcesseur(String processeur);

    public List<Computer> getComputerByPrice(double price);
}
