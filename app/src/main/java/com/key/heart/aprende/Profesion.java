package com.key.heart.aprende;

enum Profesion {
    ABOGADO("Abogado","Abogado. Hacer la forma de un capullo y dirigirlo a la altura del cuello, moviendo hacia adelante y atrás.", R.drawable.cat_pro_abogado, R.drawable.img_abogado),
    ARQUITECTO("Arquitecto","Arquitecto. Se coloca sobre el brazo el pulgar y con los dedos índice y medio hacer un medio círculo.", R.drawable.cat_pro_arquitecto, R.drawable.img_arquitecto),
    CHEF("Chef","Chef. Con las palmas sobre la cabeza simular la forma de un gorro de chef, después se coloca la mano abierta frente a la palma de la otra mano, y se realiza un movimiento al frente y de regreso.", R.drawable.cat_pro_chef, R.drawable.img_chef),
    DENTISTA("Dentista","Dentista. Se hace una letra d y se golpea suavemente cerca de la boca.", R.drawable.cat_pro_dentista, R.drawable.img_dentista),
    DEPORTISTA("Deportista","Deportista. Con los dedos índice, medio y pulgar cubrir la barbilla, luego con los dedos índices de ambas manos moverlas hacia arriba varias veces.", R.drawable.cat_pro_deportista, R.drawable.img_deportista),
    DOCTOR("Doctor","Doctor. Sobre el dorso de la mano colocar las puntas de los dedos medio, índice y pulgar.", R.drawable.cat_pro_doctor, R.drawable.img_doctor),
    ENFERMERO("Enfermero","Enfermero. Con la palma de la mano tocarse la cabeza.", R.drawable.cat_pro_enfermero, R.drawable.img_enfermero),
    GOBERNADOR("Gobernador","Gobernador. Se hace una letra g y se toca al lado de la panza.", R.drawable.cat_pro_gobernador, R.drawable.img_gobernador),
    INVESTIGADOR("Investigador","Investigador. Se hace la letra c con ambas manos colocadas una sobre la otra, tocándose con la parte del dedo meñique, éste se mueve hacia adelante y atrás.", R.drawable.cat_pro_investigador, R.drawable.img_investigador),
    LICENCIADO("Licenciado","Licenciado. Se hace la letra c con ambas manos colocadas una sobre la otra, la mano de arriba hace una letra l moviéndose a los lados.", R.drawable.cat_pro_licenciado, R.drawable.img_licenciado),
    MAESTRO("Maestro","Maestro. Hacer una letra m en ambas manos y estas mismas tocar cada hombro, luego se estiran las manos creando una letra r uniéndose las puntas al mismo tiempo.", R.drawable.cat_pro_maestro, R.drawable.img_maestro),
    MILITAR("Militar","Militar. Con ambas manos hacer una letra a, luego simular un arma a la altura del pecho dejando un espacio una mano de la otra.", R.drawable.cat_pro_militar, R.drawable.img_militar),
    POLICIA("Policía","Policía. Con el dedo pulgar tocar el centro de los labios y tocar con el dedo índice el pulgar y despegarla varias veces.", R.drawable.cat_pro_policia, R.drawable.img_policia),
    VETERINARIO("Veterinario","Veterinario. Sobre el dorso de la mano se tocan con las puntas de los dedos medio, índice y pulgar, luego hacer un puño en ambas manos y moverlas hacia adelante y atrás, y hacer nuevamente el principio movimiento.", R.drawable.cat_pro_veterinario, R.drawable.img_veterinaria),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Profesion(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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
