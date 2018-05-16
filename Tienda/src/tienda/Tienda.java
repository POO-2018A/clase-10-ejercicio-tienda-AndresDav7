package tienda;

public class Tienda {

    public String nombreTienda;
    public String direccionTienda;
    public String rucTienda;

    public Tienda(String nombreTienda, String direccionTienda, String rucTienda) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.rucTienda = rucTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getRucTienda() {
        return rucTienda;
    }

    public void setRucTienda(String rucTienda) {
        this.rucTienda = rucTienda;
    }
    
    
    
}
