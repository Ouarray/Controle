package ma.xproce.project.web;

import ma.xproce.project.dtos.ComputerDTO;
import ma.xproce.project.entities.Computer;
import ma.xproce.project.service.ComputerManagerAction;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import java.util.List;


public class ComputerGraphQLController {

    private final ComputerManagerAction computerManagerAction;

    public ComputerGraphQLController(ComputerManagerAction computerManagerAction) {
        this.computerManagerAction = computerManagerAction;
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByProcesseur(@Argument String processeur) {
        return computerManagerAction.getComputerByProcesseur(processeur);
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByPrice(@Argument double price) {
        return computerManagerAction.getComputerByPrice(price);
    }

    @MutationMapping
    public Computer saveComputer(@Argument Computer computer) {
        return computerManagerAction.saveComputer(computer);
    }

    @MutationMapping
    public Computer deleteComputer(@Argument Long id) {
        return computerManagerAction.deleteComputer(id);
    }
}
