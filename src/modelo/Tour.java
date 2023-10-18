
package modelo;

public class Tour {
    private int idTour;
    private String nombreTour;
    private String descripcionTour;
    private String recomendacionesTour;
    private double horasTour;

        public Tour() {
    }

        
    public Tour(int idTour, String nombreTour, String descripcionTour, String recomendacionesTour, double horasTour) {
        this.idTour = idTour;
        this.nombreTour = nombreTour;
        this.descripcionTour = descripcionTour;
        this.recomendacionesTour = recomendacionesTour;
        this.horasTour = horasTour;
    }


    
    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public String getDescripcionTour() {
        return descripcionTour;
    }

    public void setDescripcionTour(String descripcionTour) {
        this.descripcionTour = descripcionTour;
    }

    public String getRecomendacionesTour() {
        return recomendacionesTour;
    }

    public void setRecomendacionesTour(String recomendacionesTour) {
        this.recomendacionesTour = recomendacionesTour;
    }

    public double getHorasTour() {
        return horasTour;
    }

    public void setHorasTour(double horasTour) {
        this.horasTour = horasTour;
    }

    @Override
    public String toString() {
        return "Tour{" + "idTour=" + idTour + ", nombreTour=" + 
                nombreTour + ", descripcionTour=" + descripcionTour + ", recomendacionesTour=" +
                recomendacionesTour + ", horasTour=" + horasTour + '}';
    }
    
    
    
}
