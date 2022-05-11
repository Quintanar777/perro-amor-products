package mx.perroamor.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sub_type")
@Data
public class SubType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sub_type")
    private Long idSubType;

    @Column(name = "sub_type")
    private String subType;
}
