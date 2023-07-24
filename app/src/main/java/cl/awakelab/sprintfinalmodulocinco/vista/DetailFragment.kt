package cl.awakelab.sprintfinalmodulocinco.vista

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cl.awakelab.sprintfinalmodulocinco.databinding.FragmentDetailBinding
import coil.load


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
/**
 * A simple [Fragment] subclass.
 * Use the [InfoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */


class DetailFragment : Fragment() {

    private lateinit var binding : FragmentDetailBinding
    var productos = mutableListOf<Producto>()

    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("nombre")
            param2 = it.getString("url")
            param2 = it.getString("precio")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(LayoutInflater.from(activity))
       /* val dataProductos = DataProductos.dataProductos
        setComponent(dataProductos)*/
        initAdapter()
        return (binding.root)
    }

    private fun initAdapter() {
       binding.tvNombre.text = "$param1"
       binding.imageView.load(param2)
       binding.tvTotal.text = "$param3"
        Log.e("bind: ",param1.toString())
    }

    private fun setComponent(dataProductos: List<Producto>) {
        for (d in dataProductos){
            binding.tvNombre.text = d.nombre
            binding.imageView.load(d.imgUrl)
            binding.tvDescripcion.text = d.descripcion
            binding.tvTotal.text = d.precio.toString()
        }
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}