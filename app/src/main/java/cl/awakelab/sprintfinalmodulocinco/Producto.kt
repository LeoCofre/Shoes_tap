package cl.awakelab.sprintfinalmodulocinco

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
                    "https://www.nike.cl/fb2557-200-nike-air-max-plus/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Air Force 1 LX",
                    132990,
                    "https://www.nike.cl/dz2789-200-nike-air-force-1-lx/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Zoom Bella 6",
                    87990,
                    "https://www.nike.cl/dr5720-500-nike-zoom-bella-6/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Court Legacy Lift",
                    99990,
                    "https://www.nike.cl/fd0558-100-nike-court-legacy-lift/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Air Max Excee",
                    106990,
                    "https://www.nike.cl/cd5432-127-nike-air-max-excee/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Air Force 1 07 Mid",
                    126990,
                    "https://www.nike.cl/dd9625-103-nike-air-force-1-07-mid/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Air Jordan 1 Mid",
                    142990,
                    "https://www.nike.cl/bq6472-186-air-jordan-1-mid/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Air Jordan 1 Mid SE",
                    137990,
                    "https://www.nike.cl/dv0427-102-air-jordan-1-mid-se/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Air Jordan 1 Low SE",
                    116990,
                    "https://www.nike.cl/dv0426-200-air-jordan-1-low-se/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Air Jordan 1 Low",
                    112990,
                    "https://www.nike.cl/dc0774-416-air-jordan-1-low/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike SB Zoom Blazer Mid",
                    106990,
                    "https://www.nike.cl/dv5467-001-nike-sb-zoom-blazer-mid/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Air Jordan 1 Mid SE",
                    137990,
                    "https://www.nike.cl/dv0427-100-air-jordan-1-mid-se/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "W Nike Pegasus 40",
                    129990,
                    "https://www.nike.cl/dv3854-102-nike-pegasus-40/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Gamma Force",
                    94990,
                    "https://www.nike.cl/dx9176-100-nike-gamma-force/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Gamma Force",
                    94990,
                    "https://www.nike.cl/dx9176-102-nike-gamma-force/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Vaporfly 3",
                    2269990,
                    "https://www.nike.cl/dv4130-600-nike-vaporfly-3/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "W Air Jordan 3 Retro",
                    204990,
                    "https://www.nike.cl/ck9246-136-air-jordan-3-retro/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike Free Metcon 5",
                    124990,
                    "https://www.nike.cl/dv3950-001-nike-free-metcon-5/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike City Classic",
                    126990,
                    "https://www.nike.cl/dq5601-001-nike-city-classic/p",
                    "Zapatillas para Mujer"
                )
            )
            add(
                Producto(
                    "Nike City Classic",
                    126990,
                    "https://www.nike.cl/dq5601-710-nike-city-classic/p",
                    "Zapatillas para Mujer"
                )
            )


        }
    }
}