package cl.awakelab.sprintfinalmodulocinco

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import cl.awakelab.sprintfinalmodulocinco.databinding.ItemBinding
import coil.load

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    //Lista
    var productos = mutableListOf<Producto>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return productos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = productos[position]
        holder.bind(item)
    }

    fun setData(dataProductos: List<Producto>) {
        this.productos = dataProductos.toMutableList()

    }

    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(producto: Producto) {
            binding.ivItem.load(producto.imgUrl)
            binding.tvItem.text = producto.precio.toString()
            binding.tvNombreProducto.text = producto.nombre
            binding.cardItem.setOnClickListener {
                Navigation.findNavController(binding.root)
                    .navigate(R.id.action_recyclerFragment_to_detailFragment)
            }

        }

    }
}