package cl.awakelab.sprintfinalmodulocinco.vista

data class Producto(
    val nombre: String,
    val precio: Int,
    val imgUrl: String,
    val descripcion: String
)

class DataProductos {
    companion object {
        //fun getProductos(): List<Producto> {
        val dataProductos = mutableListOf<Producto>().apply {


            add(
                Producto(
                    "Nike Air Max Plus",
                    196990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/770638-1000-1000/FB2557_200_A_PREM.jpg?v=638253938579770000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Air Force 1 LX",
                    132990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/724895-1000-1000/DZ2789_200_A_PREM.jpg?v=638241066996300000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Zoom Bella 6",
                    87990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/723151-1000-1000/DR5720_500_A_PREM.jpg?v=638241046121830000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Court Legacy Lift",
                    92990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/722672-1000-1000/DM7590_103_A_PREM.jpg?v=638241040457100000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Air Max Excee",
                    106990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/720862-1000-1000/CD5432_127_A_PREM.jpg?v=638241018670930000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Air Force 1 07 Mid",
                    126990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/721774-1000-1000/DD9625_103_A_PREM.jpg?v=638241029675430000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Air Jordan 1 Mid",
                    142990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/714243-1000-1000/BQ6472_186_A_PREM.jpg?v=638193274840870000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Air Jordan 1 Mid SE",
                    137990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/714356-1000-1000/DV0427_102_A_PREM.jpg?v=638193276169270000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Air Jordan 1 Low SE",
                    116990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/714344-1000-1000/DV0426_012_A_PREM.jpg?v=638193276025070000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Air Jordan 1 Low",
                    112990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/711402-1000-1000/DV0426_200_A_PREM.jpg?v=638187438546870000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike SB Zoom Blazer Mid",
                    106990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/714383-1000-1000/DV5467_001_A_PREM.jpg?v=638193276508470000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Air Jordan 1 Mid SE",
                    137990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/711413-1000-1000/DV0427_100_A_PREM.jpg?v=638187438736600000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "W Nike Pegasus 40",
                    129990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/673713-1000-1000/FJ2974_001_A_PREM.jpg?v=638158949356330000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Gamma Force",
                    94990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/673554-1000-1000/DX9176_100_A_PREM.jpg?v=638158947193630000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Gamma Force",
                    94990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/673580-1000-1000/DX9176_102_A_PREM.jpg?v=638158947574800000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Vaporfly 3",
                    2269990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/673208-1000-1000/DV4130_600_A_PREM.jpg?v=638158942349200000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "W Air Jordan 3 Retro",
                    204990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/673208-1000-1000/DV4130_600_A_PREM.jpg?v=638158942349200000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Free Metcon 5",
                    124990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/673129-1000-1000/DV3950_001_A_PREM.jpg?v=638158941296430000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike City Classic",
                    126990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/671415-1000-1000/DQ5601_001_A_PREM.jpg?v=638151039609100000",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike City Classic",
                    126990,
                    "https://nikeclprod.vteximg.com.br/arquivos/ids/685783-1000-1000/DQ5601_710_A_PREM.jpg?v=638162156710830000",
                    "Zapatillas para Mujer"
                )
            )


        }
    }
}