package com.key.heart.aprende;

enum Casa {
    BANIO("Baño","Baño. Se hace una letra b, se coloca sobre el pecho y se mueve de arriba a abajo.", R.drawable.cat_cas_banio, R.drawable.img_banio),
    BATIDORA("Batidora","Batidora. Se gira la mano cerrada hacia abajo con el índice y el pulgar estirados, simulando el movimiento de una batidora.", R.drawable.cat_cas_batidora, R.drawable.img_batidora),
    BOTE("Bote","Bote. Se coloca una palma sobre la otra sin tocarse, simulando tener un bote entre las manos.", R.drawable.cat_cas_bote, R.drawable.img_bote),
    CAJON("Cajón","Cajón. Se coloca la mano en posición de garra con la palma hacia arriba, sobre la palma de la otra mano, tocándola por el dorso de los dedos, y se simula el movimiento de abrir un cajón.", R.drawable.cat_cas_cajon, R.drawable.img_cajon),
    CAMA("Cama","Cama. Se hace una letra c y se coloca al lado de la cara, tocándola con la punta de los dedos.", R.drawable.cat_cas_cama, R.drawable.img_cama),
    CASA("Casa","Casa. Se unen las manos abiertas por las yemas de los dedos y se mantienen las palmas separadas.", R.drawable.cat_cas_casa, R.drawable.img_casas),
    CEPILLO_DE_DIENTES("Cepillo de dientes","Cepillo de dientes. Se coloca el dedo índice estirado frente a los dientes, y se simula que se cepillan.", R.drawable.cat_cas_cepillo_dientes, R.drawable.img_cepillo_dientes),
    CHAMPU("Champú","Champú. Se simula tomar con la mano un frasco de champú y echar un poco sobre la otra mano. Luego se imita el movimiento de lavar el cabello.", R.drawable.cat_cas_champu, R.drawable.img_champu),
    COCINA("Cocina","Cocina. Se coloca la mano abierta frente a la palma de la otra mano, y se realiza un movimiento al frente y de regreso.", R.drawable.cat_cas_cocina, R.drawable.img_cocina),
    COMEDOR("Comedor","Comedor. Se hace un capullo frente a la boca y se mueve al frente y de regreso varias veces. Luego se hace una r sobre el dorso de la otra mano.", R.drawable.cat_cas_comedor, R.drawable.img_comedor),
    CUARTO("Cuarto","Cuarto. Se hace una letra c con la palma hacia abajo, y se coloca sobre la palma de la otra mano.", R.drawable.cat_cas_cuarto, R.drawable.img_cuarto),
    CUCHARA("Cuchara","Cuchara. Se coloca la mano como si se sostuviera una cuchara, y se simula que se lleva a la boca.", R.drawable.cat_cas_cuchara, R.drawable.img_cuchara),
    CUCHILLO("Cuchillo","Cuchillo. Se colocan los dedos índice y medio de ambas manos estirados y cruzados unos sobre los otros por la parte lateral, y se deslizan al frente y atrás.", R.drawable.cat_cas_cuchillo, R.drawable.img_cuchillo),
    ESPEJO("Espejo","Espejo. Se coloca la mano abierta con la palma dirigida a usted, y se rota ligeramente la muñeca a los lados.", R.drawable.cat_cas_espejo, R.drawable.img_espejo),
    ESTUFA("Estufa","Estufa. Con los índices estirados se dibuja la parte superior y lateral de una estufa. Luego, se mueven los dedos alternadamente hacia arriba, para simular el fuego.", R.drawable.cat_cas_estufa, R.drawable.img_estufa),
    FOCO("Foco","Foco. Se coloca la mano en posición cóncava con la palma hacia arriba, y se realiza un movimiento giratorio, simulando colocar un foco.", R.drawable.cat_cas_foco, R.drawable.img_foco),
    JABON("Jabón","Jabón. Se hace una letra a sobre la mejilla, y se realiza un movimiento circular sin separarse.", R.drawable.cat_cas_jabon, R.drawable.img_jabon),
    LAVADORA("Lavadora","Lavadora. Se abre la mano con los dedos unidos, y se realiza un movimiento rotatorio hacia los lados.", R.drawable.cat_cas_lavadora, R.drawable.img_lavadora),
    LICUADORA("Licuadora","Licuadora. Se estira el índice, y se realiza un movimiento circular, rozando con el dedo la palma de la otra mano en posición cóncava.", R.drawable.cat_cas_licuadora, R.drawable.img_licuadora),
    PEINE("Peine","Peine. Se coloca una mano como si tomara un peine sobre la cabeza y, con un movimiento hacia atrás, se simula peinarse.", R.drawable.cat_cas_peine, R.drawable.img_peine),
    REGADERA("Regadera","Regadera. Se pone la mano en capullo arriba de la cabeza y se mueve hacia abajo, abriendo la mano al mismo tiempo.", R.drawable.cat_cas_regadera, R.drawable.img_regadera),
    SALA("Sala","Sala. Se hace la letra s con ambas manos unidas por los pulgares, y se mueven en medio círculo hacia usted hasta unirse de nuevo.", R.drawable.cat_cas_sala, R.drawable.img_sala),
    TENEDOR("Tenedor","Tenedor. Con la punta de los dedos índice, medio y anular estirados, se toca la palma de la otra mano, y se dirigen hacia los labios.", R.drawable.cat_cas_tenedor, R.drawable.img_tenedor),
    VENTANA("Ventana","Ventana. Se colocan los antebrazos uno sobre el otro, con las palmas hacia abajo, y se golpean varias veces.", R.drawable.cat_cas_ventana, R.drawable.img_ventana),;


    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Casa(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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

