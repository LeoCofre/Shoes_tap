package cl.awakelab.sprintfinalmodulocinco.modelo

import android.util.Log

class Carrito(){
    companion object{
        val carritoProductos = crearListaCarrito()

        fun eliminarItemCarrito(keyEliminar: String){
            SharedApp.prefer.removeItem(keyEliminar)
        }

         fun crearListaCarrito(): MutableList<Producto> {

             val productos = DataProductos.dataProductos
             val carrito = mutableListOf<Producto>()
             val nombres = SharedApp.prefer.mSharedPreferences.all.toString()
             Log.d("carro", "Crear lista Carro: $nombres")
             for (p in productos){
                 if (nombres.indexOf(p.nombre) != -1) carrito.add(p)
             }
             return carrito
        }
    }
}