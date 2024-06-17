package br.com.helpticket.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_HT_USER")
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String name;
    private String email;
    private String password;
    @Enumerated
    private UserAtivo UserAtivo;
}
