package mx.perroamor.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "price")
@Data
public class Price {

    @Id
    @Column(name = "id_price")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrice;

    @Column(name = "regular")
    private String regular;

    @Column(name = "wholesale")
    private String wholesale;

    @Column(name = "half_wholesale")
    private String halfWholesale;
}
