package mx.perroamor.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id_product")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_size", referencedColumnName = "id_size")
    private Size size;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    private Type type;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_sub_type", referencedColumnName = "id_sub_type")
    private SubType subType;


    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_price", referencedColumnName = "id_price")
    private Price price;
}
