package backend.contalink.service.Impl;

import backend.contalink.entity.Invoices;
import backend.contalink.entity.request.getInfoRequest;
import backend.contalink.entity.response.getInfoResponse;
import backend.contalink.repository.getInfoRepository;
import backend.contalink.service.getInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class getInfoServiceImpl implements getInfoService {
    @Autowired
    getInfoRepository getInfoRepository;

    String msj = "", msjInterno = "", status = "";
    int codigo_respuesta = 0;

    getInfoResponse infoResponse = new getInfoResponse();

    @Override
    public getInfoResponse obtenerReporte(getInfoRequest getInfoRequest) {
        List<Invoices> invoicesList = new ArrayList<>();

        try {
            // Parámetros request
            String pFechaInicio = getInfoRequest.getFechaInicio();
            String pFechaFin = getInfoRequest.getFechaFin();

            System.out.println(":::::: pFechaInicio :: " + pFechaInicio);
            System.out.println(":::::: pFechaFin :: " + pFechaFin);

            List<Invoices> consulta = getInfoRepository.obtenerReporte(pFechaInicio, pFechaFin);
            System.out.println(":::::: Consulta :: " + consulta);

            //Se valida el código de respuesta
            codigo_respuesta = ((consulta != null) && !consulta.isEmpty()) ? 200 : 201;

            //Se valida el mensaje
            msj = (codigo_respuesta == 200) ? "Operación Exitosa" : "No se encontraron resultados";

            //Se valida la lista
            invoicesList = (codigo_respuesta == 200) ? consulta : new ArrayList<>();

        } catch (Exception ex) {
            //Mensajes de error/exception
            msj = "Ocurrió un error, favor de intentarlo más tarde";
            msjInterno = "Ocurrió un error" + ex.getMessage();
            codigo_respuesta = 500;
            status = "Error";

            //Guardamos el log
            log.info(msjInterno);
        }

        infoResponse.setCodigo_respuesta(codigo_respuesta);
        infoResponse.setMensaje(msj);
        infoResponse.setInvoicesList(invoicesList);

        return infoResponse;
    }
}
