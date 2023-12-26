package ma.xproce.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity



public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPc;
    private String processeur;
    private int ram;
    private String hardDrive;
    private double price;
    @Transient
    private String macAddress;

    public Computer() {

    }

}
