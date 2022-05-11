package mx.perroamor.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "group")
@Data
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_group")
    private Long idGroup;

    @Column(name = "id_parent_product")
    private Long idParentProduct;

    @Column(name = "id_child_product")
    private Long idChildProduct;
}
