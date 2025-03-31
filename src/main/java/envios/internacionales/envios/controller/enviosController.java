package envios.internacionales.envios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import envios.internacionales.envios.model.enviosModel;
import envios.internacionales.envios.repository.enviosRepository;

@RestController
public class enviosController {
    @Autowired
    private enviosRepository enviosRepository;

    // Endpoint para obtener todos los envíos
    @GetMapping("/envios")
    public List<enviosModel> obtenerEnvios() {
        return enviosRepository.obtenerEnvios();
    }
    // Endpoint para obtener un envío por su ID de seguimiento
    @GetMapping("/envios/{trackingId}")
    public enviosModel getEnviosByTrackingId(@PathVariable String trackingId) {
        return enviosRepository.obtenerEnvioPorTrackingId(trackingId);
    }
}
