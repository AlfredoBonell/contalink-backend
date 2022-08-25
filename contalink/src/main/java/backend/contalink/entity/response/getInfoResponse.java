package backend.contalink.entity.response;

import backend.contalink.entity.Invoices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class getInfoResponse {
    int codigo_respuesta = 0;
    String mensaje = "";
    List<Invoices> invoicesList = new ArrayList<>();
}
