package envios.internacionales.envios.model;


public class enviosModel {
    private String trackingId;       
    private String remitente;        
    private String destinatario;     
    private String direccionDestino; 
    private String paisOrigen;      
    private String paisDestino;      
    private String estadoEnvio;      
    private String ubicacionActual;  
    private String fechaEnvio;       
    private String fechaEstimadaEntrega;

    public enviosModel(String trackingId, String remitente, String destinatario, String direccionDestino, String paisOrigen, String paisDestino, String estadoEnvio, String ubicacionActual, String fechaEnvio, String fechaEstimadaEntrega) {
        this.trackingId = trackingId;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.direccionDestino = direccionDestino;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.estadoEnvio = estadoEnvio;
        this.ubicacionActual = ubicacionActual;
        this.fechaEnvio = fechaEnvio;
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }

    //creacion de get para obtener datos de los atributos
    public String getTrackingId() {
        return trackingId;
    }
    public String getRemitente() {
        return remitente;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public String getDireccionDestino() {
        return direccionDestino;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public String getPaisDestino() {
        return paisDestino;
    }
    public String getEstadoEnvio() {
        return estadoEnvio;
    }
    public String getUbicacionActual() {
        return ubicacionActual;
    }
    public String getFechaEnvio() {
        return fechaEnvio;
    }
    public String getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }
}
