package com.key.heart.aprende;

enum Alimento {
    ARROZ("Arroz","Arroz. Con una mano se hace una a y se coloca sobre la palma de la otra mano con el pulgar hacia arriba, luego la golpea varias veces a los lados.", R.drawable.cat_ali_arroz, R.drawable.img_arroz),
    ATUN("Atún","Atún. Hacer puños en ambas manos mirando hacia arriba con los pulgares de fuera y juntar los mismos varias veces.", R.drawable.cat_ali_atun, R.drawable.img_atun),
    CARNE("Carne","Carne. Con los dedos índice y pulgar de una mano se pellizca el dorso de la otra.", R.drawable.cat_ali_carne, R.drawable.img_carne),
    ESPAGUETI("Espagueti","Espagueti. Se hace una letra y, con el dedo pulgar tocar la esquina de la boca y bajar con el meñique la mano.", R.drawable.cat_ali_espagueti, R.drawable.img_espagueti),
    FRIJOLES("Frijoles","Frijoles. Hacer un capullo y con el dedo índice introducir el mismo en el capullo.", R.drawable.cat_ali_frijoles, R.drawable.img_frijoles),
    GELATINA("Gelatina","Gelatina. Se colocan los dedos en garra sobre la palma de la otra mano con un movimiento vibratorio en su lugar.", R.drawable.cat_ali_gelatina, R.drawable.img_gelatina),
    HAMBURGUESA("Hamburguesa","Hamburguesa. Se hace la letra c con ambas manos colocando una mano arriba de la otra, dejando un espacio.", R.drawable.cat_ali_hamburguesa, R.drawable.img_hamburguesa),
    HOT_DOG("Hot dog","Hot dog. Se coloca el índice estirado sobre la palma de la otra mano. Se cierra esta mano.", R.drawable.cat_ali_hotdog, R.drawable.img_hotdog),
    HUEVO("Huevo","Huevo. Se colocan el índice, el medio y el pulgar en posición de garra, y con el dorso del pulgar se golpea varias veces el dedo índice estirado de la otra mano.", R.drawable.cat_ali_huevo, R.drawable.img_huevo),
    JAMON("Jamón","Jamón. Se hace una letra c sobre la palma de la otra mano en posición vertical. Se realiza un movimiento hacia el frente y abajo, como rebanando jamón.", R.drawable.cat_ali_jamon, R.drawable.img_jamon),
    PAN("Pan","Pan. Con las manos cerradas y unidas por los dorsos de los dedos, se hace un movimiento al frente, girando las muñecas y separándolas.", R.drawable.cat_ali_pan, R.drawable.img_pan),
    PASTEL("Pastel","Pastel. Se hace una letra l con ambas manos, y se mueven hacia abajo al mismo tiempo, como delineando el pastel.", R.drawable.cat_ali_pastel, R.drawable.img_pastel),
    POLLO("Pollo","Pollo. Se colocan el índice y el pulgar por el dorso de la mano sobre la boca, y los dedos se unen y se separan.", R.drawable.cat_ali_pollo, R.drawable.img_pollo),
    QUESADILLA("Quesadilla","Quesadilla. Con las palmas abiertas hacia arriba, tocándose por los meñiques, se hace un movimiento simultáneo de unir las palmas, simulando cerrar una quesadilla.", R.drawable.cat_ali_quesadilla, R.drawable.img_quesadilla),
    SANDWICH("Sándwich","Sándwich. Se simula agarrar un sándwich y se acerca a la boca.", R.drawable.cat_ali_sandwich, R.drawable.img_sandwich),
    SOPA("Sopa","Sopa. Se colocan las palmas en posición cóncava, una sobre la otra.", R.drawable.cat_ali_sopa, R.drawable.img_sopa),
    TACO("Taco","Taco. Una mano abierta se coloca sobre la palma de la otra, y la golpea tocándola con el meñique.", R.drawable.cat_ali_taco, R.drawable.img_taco),
    TAMAL("Tamal","Tamal. Se hace la letra t con ambas manos, una sobre la otra, señalando al frente; luego, se juntan.", R.drawable.cat_ali_tamal, R.drawable.img_tamal),
    TORTA("Torta","Torta. Se colocan las manos en posición cóncava, simulando comerse una torta.", R.drawable.cat_ali_torta, R.drawable.img_torta),
    TORTILLAS("Tortillas","Tortillas. Se unen las manos por las palmas en posición cruzada una sobre la otra, y se hace un movimiento de muñeca para colocarse en forma inversa, varias veces.", R.drawable.cat_ali_tortillas, R.drawable.img_tortillas),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Alimento(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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
