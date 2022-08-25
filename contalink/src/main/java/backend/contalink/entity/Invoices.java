package backend.contalink.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@DynamicInsert
@Table(name = "invoices")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "invoice_number")
    private String invoice_number;

    @Column(name = "total")
    private Double total;

    @Column(name = "invoice_date")
    private String invoice_date;

    @Column(name = "status")
    private String status;
}
