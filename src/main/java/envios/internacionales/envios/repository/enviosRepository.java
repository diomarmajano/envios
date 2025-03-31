package envios.internacionales.envios.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import envios.internacionales.envios.model.enviosModel;

@Repository
public class enviosRepository {
    private List <enviosModel> envios = new ArrayList<>();
    
    public enviosRepository() {
        envios.add(new enviosModel("123456789", "Juan Perez", "Maria Lopez", "santa rosa 123", "Colombia", "España", "En tránsito", "Madrid", "2023-10-01", "2023-10-10"));
        envios.add(new enviosModel("987654321", "Ana Gomez", "Carlos Ruiz", "Avenida Siempre Viva 456", "Colombia", "México", "Entregado", "Ciudad de México", "2023-09-15", "2023-09-20"));
        envios.add(new enviosModel("456789123", "Luis Martinez", "Sofia Torres", "Carrera 7 89", "Colombia", "Argentina", "En espera", "Buenos Aires", "2023-10-05", "2023-10-15"));
        envios.add(new enviosModel("321654987", "Laura Sanchez", "Diego Morales", "Calle 123", "Colombia", "Chile", "En tránsito", "Santiago", "2023-10-02", "2023-10-12"));
        envios.add(new enviosModel("654321789", "Pedro Ramirez", "Lucia Fernandez", "Avenida 456", "Colombia", "Perú", "Entregado", "Lima", "2023-09-20", "2023-09-25"));
        envios.add(new enviosModel( "789123456", "Isabel Castro", "Andres Jimenez", "Calle 789", "Colombia", "Uruguay", "En espera", "Montevideo", "2023-10-03", "2023-10-13"));
        envios.add(new enviosModel("159753456", "Javier Torres", "Claudia Rojas", "Carrera 10 11", "Colombia", "Paraguay", "En tránsito", "Asunción", "2023-10-04", "2023-10-14"));
        envios.add(new enviosModel("753159852", "Valentina Morales", "Sebastian Castro", "Calle 12 34", "Colombia", "Brasil", "Entregado", "Brasilia", "2023-09-25", "2023-09-30"));
        envios.add(new enviosModel("951357852", "Santiago Herrera", "Natalia Vargas", "Avenida 78", "Colombia", "Venezuela", "En espera", "Caracas", "2023-10-06", "2023-10-16"));
        envios.add(new enviosModel("258963147", "Camila Ruiz", "Felipe Ortega", "Calle 45", "Colombia", "Ecuador", "En tránsito", "Quito", "2023-10-07", "2023-10-17"));
        envios.add(new enviosModel("369258147", "Diego Castro", "Laura Salazar", "Carrera 22", "Colombia", "Bolivia", "Entregado", "La Paz", "2023-09-30", "2023-10-05"));
        envios.add(new enviosModel("147258369", "Gabriela Torres", "Andres Castro", "Calle 11", "Colombia", "Paraguay", "En espera", "Asunción", "2023-10-08", "2023-10-18"));
    }

    public List<enviosModel> obtenerEnvios() {
        return envios;
    }

    public enviosModel obtenerEnvioPorTrackingId(String trackingId) {
        for (enviosModel envio : envios) {
            if (envio.getTrackingId().equals(trackingId)) {
                return envio;
            }
        }
        return null;
    }
}
