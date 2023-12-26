package ma.xproce.project.mappers;

import ma.xproce.project.dtos.ComputerDTO;
import ma.xproce.project.entities.Computer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Computer fromComputerDTOtoComputer(ComputerDTO computerDTO) {
        return modelMapper.map(computerDTO, Computer.class);
    }

    public ComputerDTO fromComputertoComputerDTO(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }
}
