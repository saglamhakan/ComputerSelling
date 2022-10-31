package entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "computer_name")
    private String computerName;
    @Column(name = "computer_id")
    private int computerId;
    @Column(name = "computer_price")
    private double computerPrice;

}
