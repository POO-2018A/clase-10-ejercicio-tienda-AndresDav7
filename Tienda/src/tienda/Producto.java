package tienda;

public class Producto {
    
    
    public String marca;
    public String codigo;
    public String tipo;
    public double precio;

    public Producto(String marca, String codigo, String tipo, double precio) {
        this.marca = marca;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
