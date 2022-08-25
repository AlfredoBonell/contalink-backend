package backend.contalink.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class getInfoRequest {
    String fechaInicio = "";
    String fechaFin = "";
}
