package com.key.heart.aprende;

enum Animal {
    AGUILA("Águila","Águila. Se colocan el índice y el pulgar en posición de garra sobre la boca, tocándola con el dorso de la mano, y se hace un movimiento hacia adelante y atrás.", R.drawable.cat_ani_aguila, R.drawable.img_aguila),
    ALACRAN("Alacrán","Alacrán. Con la punta del dedo índice se toca el dorso de la otra mano, simulando el piquete del alacrán.", R.drawable.cat_ani_alacran, R.drawable.img_alacran),
    ARANIA("Araña","Araña. Se abre una mano en posición de garra y se mueven los dedos", R.drawable.cat_ani_arania, R.drawable.img_arania),
    BUHO("Búho","Búho. Se unen por la punta los índices y pulgares de cada mano y se colocan alrededor de los ojos.", R.drawable.cat_ani_buho, R.drawable.img_buho),
    BURRO("Burro","Burro. Se hace una letra b, y se coloca en la parte lateral de la cabeza, tocándola con la muñeca. Luego se realiza un movimiento hacia adelante y atrás, sin separarse. Se pueden utilizar las dos manos.", R.drawable.cat_ani_burro, R.drawable.img_burro),
    CABALLO("Caballo","Caballo. Se hace una letra d, y se coloca en la parte lateral de la frente. Se realiza un movimiento de muñeca hacia adelante y atrás sin separarse.", R.drawable.cat_ani_caballo, R.drawable.img_caballo),
    DELFIN("Delfín","Delfín. Con la mano abierta en posición vertical, se realiza un movimiento hacia arriba y hacia abajo en forma ondulatoria.", R.drawable.cat_ani_delfin, R.drawable.img_delfin),
    ELEFANTE("Elefante","Elefante. Con la mano abierta colocada por la muñeca a la altura de la nariz, se realiza un movimiento hacia abajo y al frente, simulando la trompa de un elefante.", R.drawable.cat_ani_elefante, R.drawable.img_elefante),
    GORILA("Gorila","Gorila. Se colocan las manos a la altura del pecho, y lo golpean en forma alternada varias veces.", R.drawable.cat_ani_gorila, R.drawable.img_gorila),
    HIPOPOTAMO("Hipopótamo","Hipopótamo. Con los dedos índice, meñique y pulgar en ambas manos, ponerla una sobre la otra y una mordida de un hipopótamo sin despegarse las manos de las muñecas.", R.drawable.cat_ani_hipopotamo, R.drawable.img_hipopotamo),
    HORMIGA("Hormiga","Hormiga. Se hace una letra v, y se coloca, por el dorso, sobre la frente. Luego se hace un movimiento alternado de los dedos hacia adelante y atrás.", R.drawable.cat_ani_hormiga, R.drawable.img_hormiga),
    JIRAFA("Jirafa","Jirafa. Se estiran el índice y el meñique, mientras las yemas del medio, anular y pulgar se unen. El codo de este brazo se coloca sobre la palma de la otra mano.", R.drawable.cat_ani_jirafa, R.drawable.img_jirafa),
    LEON("León","León. Se coloca la mano en posición de garra sobre la cabeza, y se realiza un movimiento hacia abajo, rodeando la cara.", R.drawable.cat_ani_leon, R.drawable.img_leon),
    LOBO("Lobo","Lobo. Con la punta de los dedos alrededor de la nariz, señalando hacia el rostro, se hace un movimiento hacia el frente hasta unir los dedos en capullo.", R.drawable.cat_ani_lobo, R.drawable.img_lobo),
    MARIPOSA("Mariposa","Mariposa. Se cruzan los brazos con los pulgares entrelazados, y se realiza un movimiento hacia adelante y atrás.", R.drawable.cat_ani_mariposa, R.drawable.img_mariposa),
    PATO("Pato","Pato. Se coloca la mano abierta sobre la boca, tocándola con el dorso, y los dedos se unen y se separan.", R.drawable.cat_ani_pato, R.drawable.img_pato),
    PERRO("Perro","Perro. Los dedos índice, medio y pulgar se tocan con las yemas, y se realiza un movimiento de chasquido, simulando llamar a un perro.", R.drawable.cat_ani_perro, R.drawable.img_perro),
    RINOCERONTE("Rinoceronte","Rinoceronte. Se coloca una letra i sobre la nariz, simulando el cuerno de un rinoceronte.", R.drawable.cat_ani_rinoceronte, R.drawable.img_rinoceronte),
    TORTUGA("Tortuga","Tortuga. Se coloca una letra a debajo de la palma de la otra mano, y el pulgar se dobla y estira.", R.drawable.cat_ani_tortuga, R.drawable.img_tortuga),
    VIBORA("Víbora","Víbora. Los dedos índice y medio se colocan, estirados, sobre la nariz, tocándola por el dorso de la muñeca, y se realiza un movimiento circular corto.", R.drawable.cat_ani_vibora, R.drawable.img_vibora),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Animal(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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
