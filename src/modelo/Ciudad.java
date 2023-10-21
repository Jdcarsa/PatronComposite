
package modelo;

import composite.IComponente;
import java.util.Date;


public class Ciudad implements IComponente {
    
    private String nombreCiudad;
    private String vueloLlegada;
    private String hotel;
    private Tour cityTour;
    private boolean planAlimentacion;
    private Date checkIn;
    private Date checkOut;

    public Ciudad() {
    }

    public Ciudad(String nombreCiudad, String vueloLlegada, String hotel,
            Tour cityTour, boolean planAlimentacion, Date checkIn, Date checkOut) {
        this.nombreCiudad = nombreCiudad;
        this.vueloLlegada = vueloLlegada;
        this.hotel = hotel;
        this.cityTour = cityTour;
        this.planAlimentacion = planAlimentacion;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
     }

    
    public String getVueloLlegada() {
        return vueloLlegada;
    }

    public void setVueloLlegada(String vueloLlegada) {
        this.vueloLlegada = vueloLlegada;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public Tour getCityTour() {
        return cityTour;
    }

    public void setCityTour(Tour cityTour) {
        this.cityTour = cityTour;
    }

    public boolean isPlanAlimentacion() {
        return planAlimentacion;
    }

    public void setPlanAlimentacion(boolean planAlimentacion) {
        this.planAlimentacion = planAlimentacion;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombreCiudad=" + nombreCiudad + ", vueloLlegada=" + vueloLlegada 
                + ", hotel=" + hotel + ", \ncityTour=" + cityTour.toString() + ", \nplanAlimentacion=" + planAlimentacion + ", checkIn="
                + checkIn + ", checkOut=" + checkOut + '}';
    }
    
    
}
