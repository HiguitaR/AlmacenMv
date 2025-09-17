package Service;

import Model.Almacen;
import Model.Producto;

import java.util.List;
import java.util.Objects;


public class ProductoService {

    private final Almacen almacen;

    public ProductoService(Almacen almacen) {
        this.almacen = Objects.requireNonNull(almacen, "La tienda debe ser creada.");
    }

    public boolean agregarProducto(Integer idu, String nombreProducto, Double precio,
                                   Integer cantidad){
        Producto item = new Producto(idu, nombreProducto, precio, cantidad);
        almacen.agregarProducto(item);
        return true;
    }

    public boolean actualizarProducto(Integer idu, Integer cantidad) {
        Producto actualizar = almacen.buscarProducto(idu);
        actualizar.setCantidad(cantidad);
        return true;
    }
    public Producto obtenerProducto(Integer idu){
        return almacen.buscarProducto(idu);
    }

    public List<Producto> mostrarTodosProductos(){
        return almacen.getInventario();
    }
}    