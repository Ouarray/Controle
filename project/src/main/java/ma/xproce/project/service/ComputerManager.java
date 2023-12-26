package ma.xproce.project.service;

import ma.xproce.project.dtos.ComputerDTO;
import ma.xproce.project.entities.Computer;

import java.util.List;

public interface ComputerManager {
    public List<ComputerDTO> getComputerByProcesseur(String proce);
    public List<ComputerDTO>getComputerByPrice(double price);
    public Computer saveComputer(Computer computer);
    public Computer deleteComputer(Long id);
}
