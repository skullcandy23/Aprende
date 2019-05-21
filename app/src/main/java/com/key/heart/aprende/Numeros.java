package com.key.heart.aprende;

public enum Numeros {

    UNO("Uno","Uno. Se estira el índice con la palma al frente.", R.drawable.cat_num_uno, R.drawable.img_uno),
    DOS("Dos","Dos. Se estiran los dedos índice y medio.", R.drawable.cat_num_dos, R.drawable.img_dos),
    TRES("Tres","Tres. Se estiran los dedos índice, medio y anular con la palma al frente.", R.drawable.cat_num_tres, R.drawable.img_tres),
    CUATRO("Cuatro","Cuatro. Se estiran los dedos índice, medio, anular y meñique.", R.drawable.cat_num_cuatro, R.drawable.img_cuatro),
    CINCO("Cinco","Cinco. Se abre la mano con la palma al frente y los dedos separados.", R.drawable.cat_num_cinco, R.drawable.img_cinco),
    SEIS("Seis","Seis. Se hace la letra a con el pulgar hacia arriba.", R.drawable.cat_num_seis, R.drawable.img_seis),
    SIETE("Siete","Siete. Se hace una letra g, colocada en forma inclinada.", R.drawable.cat_num_siete, R.drawable.img_siete),
    OCHO("Ocho","Ocho. Se estiran los dedos pulgar, índice y medio, separados con la palma hacia usted", R.drawable.cat_num_ocho, R.drawable.img_ocho),
    NUEVE("Nueve","Nueve. Se hace la letra b con la palma hacia usted. Luego se cierran los dedos rodeando el pulgar.", R.drawable.cat_num_nueve, R.drawable.img_nueve),
    DIEZ("Diez","Diez. Se hace el número 5 con la palma hacia arriba, y se rota la mano rápidamente hacia abajo.", R.drawable.cat_num_diez, R.drawable.img_diez),
    ONCE("Once","Once. Se hace la letra a con la palma hacia usted y el dedo pulgar señalando hacia arriba, y se rota la mano arriba y a un lado.", R.drawable.cat_num_once, R.drawable.img_once),
    DOCE("Doce","Doce. Se hace el número 7, y se mueve la mano arriba y a un lado.", R.drawable.cat_num_doce, R.drawable.img_doce),
    TRECE("Trece","Trece. Se hace el número 8, y se rota la mano arriba y a un lado.", R.drawable.cat_num_trece, R.drawable.img_trece),
    CATORCE("Catorce","Catorce. Se estiran los dedos índice, medio, anular y meñique, y se mueve la mano arriba y a un lado.", R.drawable.cat_num_catorce, R.drawable.img_catorce),
    QUINCE("Quince","Quince. Se hace el número 5 y se rota la mano arriba y a un lado.", R.drawable.cat_num_quince, R.drawable.img_quince),
    DIECISEIS("Dieciseis","Dieciseis. Se hace el número 6 con la palma hacia abajo, y se mueve hacia adelante.", R.drawable.cat_num_dieciseis, R.drawable.img_dieciseis),
    DIECISIETE("Diecisiete","Diecisiete. Se hace el número 7 con la palma hacia abajo, y se mueve hacia adelante.", R.drawable.cat_num_diecisiete, R.drawable.img_diescisiete),
    DIECIOCHO("Dieciocho","Dieciocho. Se hace el número 8 con la punta de los dedos señalando al frente, y se mueve hacia adelante.", R.drawable.cat_num_dieciocho, R.drawable.img_dieciocho),
    DIECINUEVE("Diecinueve","Diecinueve. Se hace el número 4 con la punta de los dedos señalando al frente, y se mueve hacia adelante.", R.drawable.cat_num_diecinueve, R.drawable.img_diecinueve),
    VEINTE("Veinte","Veinte. Con la mano cerrada, el índice y el pulgar se tocan por la punta, y se unen y se separan.", R.drawable.cat_num_veinte, R.drawable.img_veinte),
    TREINTA("Treinta","Treinta. Con la punta del dedo medio se toca la punta del pulgar, mientras el índice permanece ligeramente levantado.", R.drawable.cat_num_treinta, R.drawable.img_treinta),
    CUARENTA("Cuarenta","Cuarenta. Se abre la mano, con el índice y el pulgar tocándose por las yemas, y éstos se unen y se separan.", R.drawable.cat_num_cuarenta, R.drawable.img_cuarenta),
    CINCUENTA("Cincuenta","Cincuenta. Se abre la mano con la palma hacia usted y los dedos separados, y se mueven hacia adelante y atrás uno por uno en forma alternada.", R.drawable.cat_num_cincuenta, R.drawable.img_cincuenta),
    SESENTA("Sesenta","Sesenta. Se hace una letra s, y se intenta abrir y cerrar la mano varias veces.", R.drawable.cat_num_sesenta, R.drawable.img_sesenta),
    SETENTA("Setenta","Setenta. Se hace el número 7, y el pulgar y el índice se separan y se unen varias veces.", R.drawable.cat_num_setenta, R.drawable.img_setenta),
    OCHENTA("Ochenta","Ochenta. Se estiran los dedos índice, medio y pulgar, señalando al frente, se tocan, y se separan y se unen varias veces.", R.drawable.cat_num_ochenta, R.drawable.img_ochenta),
    NOVENTA("Noventa","Noventa. Los dedos unidos y la palma al frente, se separan y se unen varias veces.", R.drawable.cat_num_noventa, R.drawable.img_noventa),
    CIEN("Cien","Cien. Se estira el índice, y se mueve a un lado hasta transformarse en c.", R.drawable.cat_num_cien, R.drawable.img_cien),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Numeros(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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
