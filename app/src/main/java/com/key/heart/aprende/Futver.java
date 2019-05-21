package com.key.heart.aprende;

enum Futver {
    CALABACITA("Calabacita","Calabacita. Se realiza una letra c en ambas manos, una frente a la otra, y se mueven al mismo tiempo a los lados, luego se simula que se está partiendo.", R.drawable.cat_fyv_calabacita, R.drawable.img_calabacita),
    CEBOLLA("Cebolla","Cebolla. Se colocan los dedos índice, medio y pulgar estirados sobre la nariz, tocándola con la muñeca, y se mueven en círculo al frente.", R.drawable.cat_fyv_cebolla, R.drawable.img_cebolla),
    CHILE("Chile","Chile. Se coloca la mano, con el índice y el meñique estirados, sobre la barbilla, tocándola con la parte lateral del índice, y se desliza a un lado y abajo, sacudiendo la mano.", R.drawable.cat_fyv_chile, R.drawable.img_chile),
    COCO("Coco","Coco. Con la mano cerrada sobre la cabeza, se golpea sobre ella ligeramente y se separa.", R.drawable.cat_fyv_coco, R.drawable.img_coco),
    DURAZNO("Durazno","Durazno. Se coloca una letra d sobre el dorso del antebrazo, y se desliza hacia la muñeca varias veces.", R.drawable.cat_fyv_durazno, R.drawable.img_durazno),
    FRESA("Fresa","Fresa. Se coloca una letra f sobre la nariz, y se mueve al frente y de regreso sobre la cara varias veces.", R.drawable.cat_fyv_fresa, R.drawable.img_fresa),
    HONGOS("Hongos","Hongos. Se coloca la mano abierta con la palma hacia abajo sobre el dedo índice de la otra mano.", R.drawable.cat_fyv_hongos, R.drawable.img_hongos),
    JITOMATE("Jitomate","Jitomate. Se coloca el índice sobre la nariz, luego junto con el pulgar hacer una garra sobre la mejilla y hacer la letra r sobre los labios y se mueve hacia abajo.", R.drawable.cat_fyv_jitomate, R.drawable.img_jitomate),
    LIMON("Limón","Limón. Se coloca la mano abierta sobre la mejilla, y se mueve hacia abajo hasta quedar en capullo, mientras se hace el gesto de probar algo agrio.", R.drawable.cat_fyv_limon, R.drawable.img_limon),
    MANZANA("Manzana","Manzana. Se coloca una letra m sobre la mejilla, tocándola con las yemas de los dedos, y se mueve en círculo en su lugar.", R.drawable.cat_fyv_manzana, R.drawable.img_manzana),
    MELON("Melón","Melón. Con los dedos medio, índice y pulgar de ambas manos hacer la forma de una rebanada.", R.drawable.cat_fyv_melon, R.drawable.img_melon),
    NARANJA("Naranja","Naranja. Se coloca una letra c sobre la mejilla, tocándola con la parte lateral del índice y el pulgar, y se cierra y abre la mano.", R.drawable.cat_fyv_naranja, R.drawable.img_naranjas),
    NOPALES("Nopales","Nopales. Se coloca la mano abierta con los dedos unidos y la palma hacia abajo sobre la muñeca de la otra, y se desliza al frente sobre la palma. Luego se gira la mano de abajo, y se repite la misma acción.", R.drawable.cat_fyv_nopales, R.drawable.img_nopales),
    PAPAS("Papas","Papas. Con el puño cerrado y con el pulgar se simula pelar una papa.", R.drawable.cat_fyv_papas, R.drawable.img_papas),
    PERA("Pera","Pera. Se estiran el índice y el pulgar unidos por las yemas con la palma al frente, y se mueve la muñeca al frente y de regreso.", R.drawable.cat_fyv_pera, R.drawable.img_pera),
    PINIA("Piña","Piña. Con las manos abiertas unidas por las muñecas, se rotan en su lugar sin separarse.", R.drawable.cat_fyv_pinia, R.drawable.img_pinia),
    PLATANO("Plátano","Plátano. Con la mano cerrada, se simula pelar un plátano, sostenido con la otra mano en posición cóncava con la palma hacia usted.", R.drawable.cat_fyv_platano, R.drawable.img_platano),
    SANDIA("Sandía","Sandía. Con las manos abiertas y las palmas hacia arriba, se simula sostener una rebanada de sandía, y se mueven al mismo tiempo a los lados hasta acercarse a la boca, luego se simula escupir una semilla.", R.drawable.cat_fyv_sandia, R.drawable.img_sandia),
    TOMATE("Tomate","Tomate. Se coloca el índice sobre la nariz, luego junto con el pulgar hacer una garra sobre la mejilla y hacer la letra u  sobre la palma de la otra mano, y se desliza al frente y atrás.", R.drawable.cat_fyv_tomate, R.drawable.img_tomate),
    ZANAHORIA("Zanahoria","Zanahoria. Se coloca la mano cerrada simulando sostener una zanahoria, que se acerca a la boca, como dándole una mordida.", R.drawable.cat_fyv_zanahoria, R.drawable.img_zanahoria),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Futver(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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

