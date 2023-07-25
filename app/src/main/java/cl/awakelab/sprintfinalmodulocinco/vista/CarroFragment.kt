package cl.awakelab.sprintfinalmodulocinco.vista

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.awakelab.sprintfinalmodulocinco.R
import cl.awakelab.sprintfinalmodulocinco.databinding.FragmentCarroBinding
import cl.awakelab.sprintfinalmodulocinco.modelo.Carrito.Companion.crearListaCarrito
import cl.awakelab.sprintfinalmodulocinco.modelo.DataProductos
import cl.awakelab.sprintfinalmodulocinco.modelo.Producto
import cl.awakelab.sprintfinalmodulocinco.modelo.SharedApp

/**
 * A simple [Fragment] subclass.
 * Use the [CarroFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class CarroFragment : Fragment(), AdapterCarro.EliminarItem {

    private lateinit var binding: FragmentCarroBinding
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarroBinding.inflate(LayoutInflater.from(activity))
        initAdapter()
        return (binding.root)
    }

    private fun initAdapter() {
        val adapter = AdapterCarro()
       // val listaProductosCarro = crearListaCarrito()
        binding.recyclerViewCarro.getAdapter()?.notifyItemInserted(DataProductos.dataProductos.size)
     //   adapter.setData(listaProductosCarro)
        adapter.callback = this
        binding.recyclerViewCarro.adapter = adapter

        binding.btnVaciarCarro.setOnClickListener {
            SharedApp.prefer.clean()
            adapter.carroConProductos.clear()
            adapter.notifyDataSetChanged()
        }
    }

    companion object {

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RecyclerFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CarroFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun eliminarItem(key: String) {
        SharedApp.prefer.removeItem(key)
    }
}