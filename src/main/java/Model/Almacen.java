package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Almacen {
    private final List<Producto> inventario;
    private Integer idua;
    private String ubicacion;

    public Almacen(Integer idua, String ubicacion){
        inventario = new ArrayList<>();
        this.idua = idua;
        this.ubicacion = ubicacion;
    }

    public int getIdua() {
        return idua;
    }

    public void setIdua(Integer idua) {
        this.idua = idua;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}

    public void agregarProducto(Producto item){
        inventario.add(item);
    }

    public Producto buscarProducto(Integer idu){
        for (Producto producto : inventario){
            if (producto.getIdu() == idu){
                return producto;
            }
        }
        return null;
    }

    public List<Producto> getInventario(){
        return Collections.unmodifiableList(inventario);
    }


    @Override
    public String toString() {
        return "Almacen{" +
                "idua=" + idua +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
