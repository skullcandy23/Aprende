package com.key.heart.aprende;

enum Verbo {
    APRENDER("Aprender","Aprender. Se coloca la mano abierta a la altura de la frente, tocándola con el dorso del dedo pulgar, y se cierra la mano en capullo.", R.drawable.cat_ver_aprender, R.drawable.img_aprender),
    BAILAR("Bailar","Bailar. Se hace la letra b con ambas manos, una al lado de la otra con las palmas hacia arriba, y se mueven en círculo a los lados.", R.drawable.cat_ver_bailar, R.drawable.img_bailar),
    CAMINAR("Caminar","Caminar. Con los dedos índice y medio se mueven simulando que caminan.", R.drawable.cat_ver_caminar, R.drawable.img_caminar),
    CANTAR("Cantar","Cantar. Se hace una letra c en ambas manos, después se mueven en círculo una mano detrás de la otra.", R.drawable.cat_ver_cantar, R.drawable.img_cantar),
    COMER("Comer","Comer. Se hace la forma de un capullo y se acerca a la boca simulando que va a comer.", R.drawable.cat_ver_comer, R.drawable.img_comer),
    CORRER("Correr","Correr. Se hace la forma de un puño en ambas manos y se agitan al mismo tiempo.", R.drawable.cat_ver_correr, R.drawable.img_correr),
    CRECER("Crecer","Crecer. Con el dedo índice tocarse la frente y después con la punta del dedo se toca la palma.", R.drawable.cat_ver_crecer, R.drawable.img_crecer),
    DORMIR("Dormir","Dormir. Se hace una letra d y se recorre por la mejilla hacia abajo y arriba.", R.drawable.cat_ver_dormir, R.drawable.img_dormir),
    ESCRIBIR("Escribir","Escribir. Se unen los dedos índice y pulgar y se simula estar escribiendo sobre la palma de la mano extendida. ", R.drawable.cat_ver_escribir, R.drawable.img_escribir),
    ESTUDIAR("Estudiar","Estudiar. Se hace la letra b con ambas manos, una al lado de la otra con las palmas hacia arriba, y se mueven hacia arriba y abajo alternadamente.", R.drawable.cat_ver_estudiar, R.drawable.img_estudiar),
    JUGAR("Jugar","Jugar. Se colocan los meñiques al frente, y se mueven en círculo en forma alternada.", R.drawable.cat_ver_jugar, R.drawable.img_jugar),
    LEER("Leer","Leer. Sobre la palma de la mano extendida, usar los dedos índice, medio, anular y meñique para moverlos al mismo tiempo hacia los lados de la palma.", R.drawable.cat_ver_leer, R.drawable.img_leer),
    PENSAR("Pensar","Pensar. Se hace una letra b sobre la frente golpeando ligeramente, y luego hacer un gesto pensativo.", R.drawable.cat_ver_pensar, R.drawable.img_pensar),
    SONIAR("Soñar","Soñar. Se hace una letra v en ambas manos, colocarlas a la altura de la cabeza y doblar los dedos y extenderlos alternadamente.", R.drawable.cat_ver_soniar, R.drawable.img_soniar),
    TRABAJAR("Trabajar","Trabajar. Se hace una letra t en ambas manos, mirando las puntas hacia abajo y moviéndolas alternadamente.", R.drawable.cat_ver_trabajar, R.drawable.img_trabajar),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Verbo(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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
