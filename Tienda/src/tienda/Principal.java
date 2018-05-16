package tienda;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int cantidadProductos = 0;
        
        Producto[] producto = new Producto[cantidadProductos+50];
        
        System.out.println("\t\tEjercicio Tienda "); 
        System.out.println("\tIngrese los datos de la tienda");
        
        System.out.print("Nombre = ");
        String nombreTienda = scan.nextLine();
        
        System.out.print("Dirección = ");
        String direccionTienda = scan.nextLine();
        
        System.out.print("RUC = ");
        String rucTienda = scan.nextLine(); 
        
        Tienda miTienda = new Tienda(nombreTienda,direccionTienda,rucTienda);
        
        System.out.println("\n");
        System.out.println("\tDatos de la tienda");
        System.out.println("Nombre de la Tienda = " + miTienda.getNombreTienda());
        System.out.println("Dirección de la Tienda = " + miTienda.getDireccionTienda());              
        System.out.println("RUC = " + miTienda.getRucTienda());
     
        int salirProducto;
        
        do{     
     
            
        System.out.println("\t\nIngrese datos nuevo Producto");
        System.out.print("Tipo (Electrodomestico,auto,etc) = ");
        scan.next();
        String tipoProducto = scan.nextLine();
        
        System.out.print("Marca = ");
        String marcaProducto = scan.nextLine();
        
        System.out.print("Codigo = ");
        String codigoProducto = scan.nextLine();
                
        System.out.print("Precio (numeros) = ");
        double precioProducto = scan.nextDouble();
        
        producto[cantidadProductos] = new Producto(marcaProducto,codigoProducto,tipoProducto,precioProducto);
        
        cantidadProductos = cantidadProductos + 1;
        
        System.out.println("Desea ingresar otro producto (1/2) = 1.- No");
        System.out.println("                                     2.- Si");
        System.out.print("Respuesta = ");
        salirProducto = scan.nextInt();
            
        } while( salirProducto != 1);
        
        int opcion;
        
        do{
            System.out.println("\t\n\tMenú Tienda ");   
            System.out.println("1. Ingrese nuevo producto");
            System.out.println("2. Visualizar lista productos");
            System.out.println("3. Salir");
            opcion = scan.nextInt();
            
            switch(opcion){
                
                case 1:
                    System.out.println("\t\n\tIngrese datos nuevo Producto");
                    System.out.print("Tipo (Electrodomestico,auto,etc) = ");
                    scan.next();
                    String tipoProducto = scan.nextLine();
        
                    System.out.print("Marca = ");
                    String marcaProducto = scan.nextLine();
        
                    System.out.print("Codigo = ");
                    String codigoProducto = scan.nextLine();
                
                    System.out.print("Precio (numeros)= ");
                    double precioProducto = scan.nextDouble();
        
        
                    producto[cantidadProductos] = new Producto(marcaProducto,codigoProducto,tipoProducto,precioProducto);
        
                    cantidadProductos = cantidadProductos + 1;
                    
                    break;
                    
                case 2:
                    
                    System.out.println("\t\t\tListado de Productos Existentes");
                    for(int i=0;i<cantidadProductos;i++){
                        System.out.println((i+1)+".- "+ producto[i].getMarca() +"  - $ "+ producto[i].getPrecio());  
                    }
                    
                    break;
                    
                case 3:
                    scan.nextLine();
                    System.out.println("Desea Salir (1/2): 1.- Salir");
                    System.out.println("                   2.- Regresar al menu");
                    System.out.print("Respuesta = ");
                    int confirmarSalida = scan.nextInt();
                        if(confirmarSalida == 1){
                            System.out.println("\t\t\tAdios !");
                        }else{
                            opcion = 0;
                        }
                    break;
                default:
                    System.out.println("Opcion Incorrecta !");
                    break;
            } 
            
        } while( opcion != 3);
        
        
    }
}
