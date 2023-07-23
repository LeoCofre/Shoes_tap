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
    private var itemClickListener: OnItemClickListener? = null

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
        notifyDataSetChanged()

    }
    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.itemClickListener = listener
    }

    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(producto: Producto) {
            binding.ivItem.load(producto.imgUrl){
                crossfade(true) // Transición al cargar la imagen
                placeholder(R.drawable.baseline_image_search_24) // Imagen de carga mientras se carga la imagen real
                error(R.drawable.baseline_image_not_supported_24) // Imagen a mostrar en caso de error al cargar la imagen
            }
            binding.tvItem.text = producto.precio.toString()
            binding.tvNombreProducto.text = producto.nombre
            binding.cardItem.setOnClickListener {
                Navigation.findNavController(binding.root)
                    .navigate(R.id.action_recyclerFragment_to_detailFragment)
            }

        }

    }
    interface OnItemClickListener {
        fun onItemClick(producto: Producto)
    }
}