package cl.awakelab.sprintfinalmodulocinco.vista

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelab.sprintfinalmodulocinco.databinding.ItemCarritoBinding
import cl.awakelab.sprintfinalmodulocinco.modelo.Producto
import coil.load
import coil.transform.CircleCropTransformation

class AdapterCarro : RecyclerView.Adapter<AdapterCarro.ViewHolder>() {

    var carroConProductos = mutableListOf<Producto>()

    var callback: EliminarItem? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCarritoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return carroConProductos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val producto = carroConProductos[position]
        holder.bind(producto)

    }

    fun setData(productos: MutableList<Producto>) {
        this.carroConProductos = productos.toMutableList()
        notifyDataSetChanged()
    }

    inner class ViewHolder(val binding: ItemCarritoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(producto: Producto) {
            binding.tvNombreCarro.text = producto.nombre
            binding.imageCarro.load(producto.imgUrl) {
                crossfade(true)
                transformations(CircleCropTransformation())
            }
            binding.tvPrecioCarro.text =  producto.precio.toString()
            binding.tvNombreCarro.text = producto.nombre
            binding.btnQuitarDelCarro.setOnClickListener {
                callback?.eliminarItem(producto.nombre)
                carroConProductos.removeAt(adapterPosition)
                notifyItemRemoved(adapterPosition)
            }
        }


    }

    interface EliminarItem {
        fun eliminarItem(key: String)
    }
}