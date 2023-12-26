package ma.xproce.project.service;

import ma.xproce.project.dtos.ComputerDTO;
import ma.xproce.project.entities.Computer;
import ma.xproce.project.mappers.ComputerMapper;
import ma.xproce.project.repositories.ComputerRepository;

import java.util.ArrayList;
import java.util.List;

public class ComputerManagerAction {
    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;


    public ComputerManagerAction(ComputerRepository computerRepository, ComputerMapper computerMapper) {
        this.computerRepository = computerRepository;
        this.computerMapper = computerMapper;
    }


    public List<ComputerDTO> getComputerByProcesseur(String processeur) {
        List<Computer>computers = computerRepository.getComputerByProcesseur(processeur);
        List<ComputerDTO>computerDTOS = new ArrayList<>();
        for(Computer computer : computers)
        {
            computerDTOS.add(computerMapper.fromComputertoComputerDTO(computer));
        }
        return computerDTOS;
    }


    public List<ComputerDTO> getComputerByPrice(double price) {
        List<Computer>computers = computerRepository.getComputerByPrice(price);
        List<ComputerDTO>computerDTOS = new ArrayList<>();
        for(Computer computer : computers)
        {
            computerDTOS.add(computerMapper.fromComputertoComputerDTO(computer));
        }
        return computerDTOS;    }


    public Computer saveComputer(Computer computer) {
        if(computer != null)
            return computerRepository.save(computer);
        return null;
    }

    public Computer deleteComputer(Long id) {
        Computer computer = computerRepository.findById(id).orElseThrow(()-> new RuntimeException("Computer non trouvé"));
        computerRepository.delete(computer);
        return null;
    }
}
