package backend.contalink.entity.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class getInfoInvoices {
    Integer id = 0;
    String invoice_number = "";
    double total = 0.0;
    String invoice_date = "";
    String status = "";
}
