package co.agenciaviajes.negocio;

/**
 * Ciudades a visitar
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class CiudadComponent extends PaqueteComponent {

    private int precio;

    private Vuelo vuelo;
    private Hotel hotel;
    private CityTour cityTour;
    private PlanAlimentacion planAlimentacion;

    // Completar constructor, getters and setters
    public CiudadComponent(String nombre, int precio) {
        super(nombre);
        this.precio = precio;
    }

    public CiudadComponent(String nombre, int precio, Vuelo vuelo, Hotel hotel, CityTour cityTour, PlanAlimentacion planAlimentacion) {
        super(nombre);
        this.precio = precio;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.cityTour = cityTour;
        this.planAlimentacion = planAlimentacion;
    }

    public int getPrecio() {
        return precio;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public CityTour getCityTour() {
        return cityTour;
    }

    public PlanAlimentacion getPlanAlimentacion() {
        return planAlimentacion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setCityTour(CityTour cityTour) {
        this.cityTour = cityTour;
    }

    public void setPlanAlimentacion(PlanAlimentacion planAlimentacion) {
        this.planAlimentacion = planAlimentacion;
    }

    @Override
    public long getComponentPrecio() {
        return this.precio;
    }

}
