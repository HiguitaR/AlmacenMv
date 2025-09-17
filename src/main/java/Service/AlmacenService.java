package Service;

import Model.Almacen;
import Model.Producto;

import java.util.ArrayList;
import java.util.List;


public class AlmacenService {
    List<Almacen> almacen = new ArrayList<>();
    Producto item;

    public AlmacenService(Integer idua, String ubicacion){
        almacen.add(new Almacen(idua, ubicacion));
    }

    public Almacen buscarAlmacen(Integer idua){
        for (Almacen tienda : almacen){
            if (tienda.getIdua() == idua) {
                return tienda;
            }
        }
        return null;
    }

    public boolean agregarProducto(Integer idu, String nombreProducto, Double precio,
                                 Integer cantidad, Integer idua){
        for (Almacen tienda : almacen){
            if (tienda.getIdua() == idua) {
                tienda.agregarProducto(item = new Producto(idu, nombreProducto, precio,
                        cantidad));
                return true;
            }
        }
        return false;
    }

    public boolean actualiarProducto(Integer idua, Integer idu, Integer cantidad){
        for (Almacen tienda : almacen){
            if (tienda.getIdua() == idua){
                for (Producto producto : tienda.getInventario()){
                    if (producto.getIdu() == idu){
                        producto.setCantidad(cantidad);
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public List<Almacen> mostrarTodosAlmacen(){
        return almacen;
    }

}
