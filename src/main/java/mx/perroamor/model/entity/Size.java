package mx.perroamor.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "size")
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_size")
    private Long idSize;

    @Column(name = "code")
    private String code;

    @Column(name = "`´size´`")
    private String size;
}
