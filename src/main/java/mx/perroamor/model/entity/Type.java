package mx.perroamor.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "type")
@Data
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type")
    private Long idType;

    @Column(name = "type")
    private String type;
}
