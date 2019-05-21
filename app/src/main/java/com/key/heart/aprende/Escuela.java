package com.key.heart.aprende;

enum Escuela {

    ALUMNO("Alumno","Alumno. Se hace una letra a frente a la boca, y se mueve en círculo.", R.drawable.cat_esc_alumno, R.drawable.img_alumno),
    BANDERA("Bandera","Bandera. Se coloca una mano sobre el codo y luego con la otra se simula el ondeado de la bandera con la palma abierta hacia enfrente.", R.drawable.cat_esc_bandera, R.drawable.img_bandera),
    BORRADOR("Borrador","Borrador. Se hace una letra b y se simula que se está borrando.", R.drawable.cat_esc_borrador, R.drawable.img_borrador),
    COMPAS("Compás","Compás. Se estiran los dedos índice y medio, con la punta de este último se toca la palma de la otra mano, y se mueve en medio círculo, imitando el movimiento del compás.", R.drawable.cat_esc_compas, R.drawable.img_compas),
    COMPUTADORA("Computadora","Computadora. Se colocan ambas manos en posición de garra con las palmas al frente, y se mueven en círculo al mismo tiempo.", R.drawable.cat_esc_computadora, R.drawable.img_computadora),
    CUADERNO("Cuaderno","Cuaderno. Se hace una letra c, y con ella se golpea varias veces la palma de la otra mano.", R.drawable.cat_esc_cuaderno, R.drawable.img_cuaderno),
    DICCIONARIO("Diccionario","Diccionario. Se coloca una letra d sobre la palma de la otra mano, y se  mueve en línea recta al frente.", R.drawable.cat_esc_diccionario, R.drawable.img_diccionario),
    EXAMEN("Examen","Examen. Se hace una letra e, y se rota la muñeca sobre la cara.", R.drawable.cat_esc_examen, R.drawable.img_examen),
    GOMA("Goma","Goma. Se colocan los dedos índice y medio de ambas manos en posición de garra, y se golpean, luego se hace letra b pegando sobre la palma abierta.", R.drawable.cat_esc_goma, R.drawable.img_goma),
    HOJA("Hoja","Hoja. Se simula agarrando las esquinas de una hoja y moviéndolas con el dedo pulgar e índice.", R.drawable.cat_esc_hoja, R.drawable.img_hoja),
    LAPICERO("Lapicero","Lapicero. Se coloca una letra p sobre la palma de la otra mano, tocándola con la punta del dedo medio, y se mueve en ondas sobre ésta.", R.drawable.cat_esc_lapicero, R.drawable.img_lapicero),
    LAPIZ("Lápiz","Lápiz. Con la parte lateral del dedo índice se golpea varias veces la barbilla.", R.drawable.cat_esc_lapiz, R.drawable.img_lapiz),
    LIBRO("Libro","Libro. Se coloca una letra g sobre la palma de la otra mano, tocándola con la parte lateral del dedo meñique, y se mueve a los lados, sin separarse.", R.drawable.cat_esc_libro, R.drawable.img_libro),
    MAPA("Mapa","Mapa. Se estiran el índice y el meñique, y se mueven al mismo tiempo en línea recta al frente y de regreso varias veces.", R.drawable.cat_esc_mapa, R.drawable.img_mapa),
    MESA("Mesa","Mesa. Se hace una letra a y con la punta del dedo pulgar se toca debajo de la palma de la otra mano.", R.drawable.cat_esc_mesa, R.drawable.img_mesa),
    PEGAMENTO("Pegamento","Pegamento. Se tocan el dedo medio y el pulgar, luego se forma la letra s haciendo círculos sobre la palma.", R.drawable.cat_esc_pegamento_prit, R.drawable.img_pegamento),
    PIZARRON("Pizarrón","Pizarrón. Con ambas manos se hace la letra p y después se simula la forma de un rectángulo", R.drawable.cat_esc_pizarron, R.drawable.img_pizarron),
    REGLA("Regla","Regla. Se hace una letra r, y se coloca sobre el brazo moviéndose de arriba a abajo.", R.drawable.cat_esc_regla, R.drawable.img_regla),
    SILLA("Silla","Silla. Con el índice y el medio estirados, se golpea en forma cruzada el dorso del índice y el medio de la otra mano que están en la misma posición.", R.drawable.cat_esc_silla, R.drawable.img_silla),
    TIJERAS("Tijeras","Tijeras. Se estiran el índice y el medio, y se separan y se unen varias veces.", R.drawable.cat_esc_tijeras, R.drawable.img_tijeras),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Escuela(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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

