package com.key.heart.aprende;

enum Lugar {
    AUDITORIO("Auditorio","Auditorio. Se extienden ambas manos y se mueven hacia atrás y después hacia adelante.", R.drawable.cat_lug_auditorio, R.drawable.img_auditorio),
    CINE("Cine","Cine. Sobre el dorso de la mano se extiende la mano y se mueve hacia los lados.", R.drawable.cat_lug_cine, R.drawable.img_cine),
    CIUDAD("Ciudad","Ciudad. Se hace una letra a sobre la palma de la mano sin que esta pegue con la palma, se hace un cículo y después se baja de golpe.", R.drawable.cat_lug_ciudad, R.drawable.img_ciudad),
    EDIFICIO("Edificio","Edificio. Se hace una letra e con ambas manos, elevándolas al mismo tiempo en forma de una línea paralela.", R.drawable.cat_lug_edificio, R.drawable.img_edificio),
    FABRICA("Fábrica","Fábrica. Con las manos extendidas se entrelazan los dedos haciendo movimientos hacia abajo con ambas manos.", R.drawable.cat_lug_fabrica, R.drawable.img_fabrica),
    HOSPITAL("Hospital","Hospital. Se hace un puño y encima del mismo se golpean con los dedos índice y medio varias veces.", R.drawable.cat_lug_hospital, R.drawable.img_hospital),
    HOTEL("Hotel","Hotel. Se hace una letra h y se mueve hacia adelante y atrás.", R.drawable.cat_lug_hotel, R.drawable.img_hotel),
    IGLESIA("Iglesia","Iglesia. Se extiende el dedo índice en ambas manos y se tocan con las puntas al mismo tiempo.", R.drawable.cat_lug_iglesia, R.drawable.img_iglesia),
    OFICINA("Oficina","Oficina. Se hace una letra o en ambas manos, de manera que los huecos queden mirando hacia arriba, después al mismo tiempo forman una letra f, con las puntas al frente.", R.drawable.cat_lug_oficina, R.drawable.img_oficina),
    PANTEON("Panteón","Panteón. Se hace una letra p en ambas manos, mirando al frente, luego se bajan las muñecas al mismo tiempo.", R.drawable.cat_lug_panteon, R.drawable.img_panteon),
    PARQUE("Parque","Parque. Se hace una letra v, y con la punta de los dedos de esa mano se golpea la parte lateral del dedo índice de la otra.", R.drawable.cat_lug_parque, R.drawable.img_parque),
    RESTAURANTE("Restaurante","Restaurante. Se hace una letra r y se coloca en la esquina de la boca, después se mueve hacia la altura del hombre y se desliza hacia abajo.", R.drawable.cat_lug_restaurante, R.drawable.img_restaurante),
    SALON("Salón","Salón. Se hace la letra s con ambas manos unidas por los pulgares y se despegan y se unen varias veces.", R.drawable.cat_lug_salon, R.drawable.img_salon),
    TIENDA("Tienda","Tienda. Se hace una letra t en ambas manos, luego se mueven las muñecas en forma de círculo al mismo tiempo.", R.drawable.cat_lug_tienda, R.drawable.img_tienda),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Lugar(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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
