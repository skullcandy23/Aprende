package com.key.heart.aprende;

public enum Colores {

    AMARILLO("Amarillo","Amarillo. Se coloca una letra a sobre el dorso de la otra mano, y se mueve en círculo sin separarse.", R.drawable.cat_col_amarillo, R.drawable.img_amarillo),
    AZUL("Azul","Azul. Se coloca una letra a sobre la palma de la otra mano, tocándola con la parte lateral del dedo meñique, y se mueve en círculo sin separarla.", R.drawable.cat_col_azul, R.drawable.img_azul),
    BLANCO("Blanco","Blanco. Se coloca una letra b sobre el dorso de la otra mano, y se desliza a un lado en línea recta, sin separarse.", R.drawable.cat_col_blanco, R.drawable.img_blanco),
    CAFE("Cafe","Café. Se hace la letra c con ambas manos colocadas una sobre la otra, tocándose con la parte lateral del dedo índice y meñique, y se mueven en círculo sin separarse.", R.drawable.cat_col_cafe, R.drawable.img_cafe),
    GRIS("Gris","Gris. Se coloca una letra g sobre la palma de la otra mano, tocándola con la parte lateral del dedo meñique, y se mueve a los lados, sin separarse.", R.drawable.cat_col_gris, R.drawable.img_gris),
    NARANJA("Naranja","Naranja. Se coloca una letra c sobre la mejilla, tocándola con la parte lateral del dedo índice y pulgar, y se cierra y abre la mano", R.drawable.cat_col_naranja, R.drawable.img_naranja),
    BRILLANTE("Brillante","Brillante. Se colocan las palmas al frente, una al lado de la otra, y se mueven, uno a uno, los dedos.", R.drawable.cat_col_brillante, R.drawable.img_brillante),
    BRONCE("Bronce","Bronce. Se coloca una letra b sobre la palma de la otra mano, tocándola con la parte lateral del dedo meñique, y se golpea la palma varias veces.", R.drawable.cat_col_bronce, R.drawable.img_bronce),
    CLARO("Claro","Claro. Se hace un capullo con ambas manos, tocándose con las puntas de los dedos, y se mueven en medio círculo hacia arriba y a los lados, abriendo las manos al mismo tiempo.", R.drawable.cat_col_claro, R.drawable.img_claro),
    MORADO("Morado","Morado. Se hace una letra m, y con la punta de los dedos de esa mano se toca la parte lateral del dedo índice de la otra, y se mueven a los lados, sin separarse.", R.drawable.cat_col_morado, R.drawable.img_morado),
    NEGRO("Negro","Negro. Se coloca una letra n sobre la palma de la otra mano, tocándola con las yemas de los dedos, y se mueve en línea recta al frente y de regreso.", R.drawable.cat_col_negro, R.drawable.img_negro),
    OSCURO("Oscuro","Oscuro. Se hace la letra o con ambas manos a los lados, y se mueven al mismo tiempo al centro, hasta cruzarse al frente. Los dedos terminan señalando a los lados.", R.drawable.cat_col_oscuro, R.drawable.img_oscuro),
    ORO("Oro","Oro. Se coloca una letra o sobre la palma de la otra mano, tocándola con la parte lateral del dedo meñique, y la golpea varias veces.", R.drawable.cat_col_oro, R.drawable.img_oro),
    PLATA("Plata","Plata. Se coloca una letra p sobre la palma de la otra mano, tocándola con  la parte lateral de la mano, y la golpea varias veces, sin separarse", R.drawable.cat_col_plata, R.drawable.img_plata),
    ROJO("Rojo","Rojo. Se coloca una letra r sobre los labios, y se mueve un poco hacia abajo.", R.drawable.cat_col_rojo, R.drawable.img_rojo),
    ROSA("Rosa","Rosa. Se coloca una letra r sobre la palma de la otra mano, y se desliza al frente y a usted varias veces.", R.drawable.cat_col_rosa, R.drawable.img_rosa),
    VERDE("Verde","Verde. Se coloca una letra v sobre la palma de la otra mano, y se desliza a la punta de los dedos y de regreso.", R.drawable.cat_col_verde, R.drawable.img_verde),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Colores(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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
