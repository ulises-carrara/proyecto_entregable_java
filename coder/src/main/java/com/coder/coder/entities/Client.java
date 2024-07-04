package com.coder.coder.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Clientes")
@NoArgsConstructor @ToString @EqualsAndHashCode
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer id;

    @Getter @Setter private String name;

    @Getter @Setter private String lastName;

    @Getter @Setter private Integer age;

    @Getter @Setter private Integer docNum;

}

