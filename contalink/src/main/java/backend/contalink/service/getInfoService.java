package backend.contalink.service;

import backend.contalink.entity.response.getInfoResponse;

public interface getInfoService {
    getInfoResponse obtenerReporte(String fechaInicio, String fechaFin);
}
