package backend.contalink.service;

import backend.contalink.entity.request.getInfoRequest;
import backend.contalink.entity.response.getInfoResponse;

public interface getInfoService {
    getInfoResponse obtenerReporte(getInfoRequest getInfoRequest);
}
