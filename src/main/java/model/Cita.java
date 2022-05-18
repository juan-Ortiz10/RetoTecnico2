package model;

public class Cita {
    private String diaCita;
    private String documentoPaciente;
    private String documentoDoctor;
    private String observaciones;

    public String getDiaCita() {
        return diaCita;
    }

    public void setDiaCita(String diaCita) {
        this.diaCita = diaCita;
    }

    public String getDocumentoPaciente() {
        return documentoPaciente;
    }

    public void setDocumentoPaciente(String documentoPaciente) {
        this.documentoPaciente = documentoPaciente;
    }

    public String getDocumentoDoctor() {
        return documentoDoctor;
    }

    public void setDocumentoDoctor(String documentoDoctor) {
        this.documentoDoctor = documentoDoctor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
