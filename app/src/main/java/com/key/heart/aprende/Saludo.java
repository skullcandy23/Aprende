package com.key.heart.aprende;

enum Saludo {

    ADIOS("Adiós","Adiós. Con la mano abierta, se doblan los dedos hacia abajo.", R.drawable.cat_sal_adios, R.drawable.img_adios),
    BUENAS_NOCHES("Buenas noches","Buenas noches. Se coloca una letra b sobre el corazón, y se mueve al frente. Luego se coloca una g sobre la frente, y se mueve hacia abajo.", R.drawable.cat_sal_buenasnoches, R.drawable.img_buenasnoches),
    BUENAS_TARDES("Buenas tardes","Buenas tardes. Se coloca una letra b sobre el corazón, y se mueve al frente. Luego se coloca una t sobre el antebrazo, y se mueve en línea recta hacia usted.", R.drawable.cat_sal_buenastardes, R.drawable.img_buenastardes),
    BUENOS_DIAS("Buenos días","Buenos días. Se coloca una letra b sobre el corazón, y se mueve al frente. Luego se hace una d, y se mueve en medio círculo hacia un lado.", R.drawable.cat_sal_buenosdias, R.drawable.img_buenosdias),
    GRACIAS("Gracias","Gracias. Se extiende la mano y sobre de ella se toca con el dedo medio suavemente y se retira.", R.drawable.cat_sal_gracias, R.drawable.img_gracias),
    HOLA("Hola","Hola. Se hace una letra h sobre la frente a la altura del ojo y se retira mostrando la seña de la letra.", R.drawable.cat_sal_hola, R.drawable.img_hola),
    FAVOR("Favor","Favor. Se junta una palma con la otra, y se mueven juntas al frente y atrás.", R.drawable.cat_sal_porfavor, R.drawable.img_porfavor),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Saludo(String nombre,String descripcion, int rutaSenia, int rutaImagen){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rutaSenia = rutaSenia;
        this.rutaImagen = rutaImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getRutaSenia() {
        return rutaSenia;
    }

    public int getRutaImagen() {
        return rutaImagen;
    }

}
