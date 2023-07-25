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
import cl.awakelab.sprintfinalmodulocinco.modelo.SharedApp


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
        binding.recyclerViewCarroNO.getAdapter()?.notifyItemInserted(DataProductos.dataProductos.size)
       // adapter.setData(listaProductosCarro)
        adapter.callback = this
        binding.recyclerViewCarroNO.adapter = adapter

        binding.btnVaciarCarrito.setOnClickListener {
            SharedApp.prefer.clean()
            adapter.carroConProductos.clear()
            adapter.notifyDataSetChanged()
        }
    }

    companion object {

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