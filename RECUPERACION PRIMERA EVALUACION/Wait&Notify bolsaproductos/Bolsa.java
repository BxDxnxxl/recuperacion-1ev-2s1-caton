import java.util.ArrayList;

public class Bolsa {
 
private ArrayList<Producto> listaProductos = new ArrayList<Producto>(); /*arraylist de productos */
 
public void addProducto(Producto producto) {
 /*si no esta llena la bolsa, añade producto */
if (!estaLlena())
 listaProductos.add(producto);
 }
 
public ArrayList<Producto> getListaProductos() {
 return listaProductos;
 
}
 
public int getSize() {
 return listaProductos.size();
 }

 public boolean estaLlena() {
 /*comprueba que la bolsa no esté llena */
return listaProductos.size() >= 5;
 }
}