package backend.contalink.repository;

import backend.contalink.entity.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface getInfoRepository extends JpaRepository<Invoices, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM public.invoices WHERE invoice_date BETWEEN to_date(?1,'YYYY-MM-DD') AND to_date(?2,'YYYY-MM-DD');")
    List<Invoices> obtenerReporte(String fechaInicio, String fechaFin);
}
