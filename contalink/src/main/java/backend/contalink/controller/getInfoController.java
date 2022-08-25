package backend.contalink.controller;

import backend.contalink.entity.request.getInfoRequest;
import backend.contalink.entity.response.getInfoResponse;
import backend.contalink.service.getInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping(value = "/controller")
public class getInfoController {
    @Autowired
    getInfoService getInfoService;

    @PostMapping(value = "/getInfoReporte", produces = "application/json; charset=UTF-8")
    public @ResponseBody getInfoResponse obtenerReporte(@RequestBody getInfoRequest getInfoRequest){
        getInfoResponse response = new getInfoResponse();
        response = getInfoService.obtenerReporte(getInfoRequest);

        return response;
    }
    /*public getInfoResponse obtenerReporte(String fechaInicio, String fechaFin){

        getInfoResponse response = new getInfoResponse();
        response = getInfoService.obtenerReporte(fechaInicio, fechaFin);

        return response;
    }*/
}
