package com.key.heart.aprende;

enum Humano {
    BOCA("Boca","Boca. Con el índice se señala la boca, y se mueve en círculo alrededor de ella.", R.drawable.cat_hum_boca, R.drawable.img_boca),
    BRAZO("Brazo","Brazo. Se coloca la mano abierta sobre el otro brazo, y se desliza hacia la muñeca.", R.drawable.cat_hum_brazo, R.drawable.img_brazo),
    CARA("Cara","Cara. Con el índice se señala la frente, y se mueve el dedo alrededor de la cara.", R.drawable.cat_hum_cara, R.drawable.img_cara),
    CEJA("Ceja","Ceja. Con el índice se recorre la ceja.", R.drawable.cat_hum_ceja, R.drawable.img_ceja),
    CODO("Codo","Codo. Con la mano abierta se rodea el codo del otro brazo doblado, y se mueve en círculo alrededor de éste.", R.drawable.cat_hum_codo, R.drawable.img_codo),
    CUELLO("Cuello","Cuello. Con las yemas de la mano abierta se toca el cuello.", R.drawable.cat_hum_cuello, R.drawable.img_cuello),
    DIENTE("Diente","Diente. Con el índice se señala un diente, y lo golpea ligeramente.", R.drawable.cat_hum_diente, R.drawable.img_diente),
    LENGUA("Lengua","Lengua. Con el índice se señala la lengua.", R.drawable.cat_hum_lengua, R.drawable.img_lengua),
    MANO("Mano","Mano. Se muestra la mano abierta a la persona con quien se habla.", R.drawable.cat_hum_mano, R.drawable.img_mano),
    MEJILLA("Mejilla","Mejilla. Con el índice y el pulgar se pellizca la mejilla, y los dedos vibran en su lugar.", R.drawable.cat_hum_mejilla, R.drawable.img_mejilla),
    MUNECA("Muñeca","Muñeca. Con la mano abierta se rodea la muñeca de la otra mano.", R.drawable.cat_hum_muneca, R.drawable.img_muneca),
    NARIZ("Nariz","Nariz. Con la punta del índice se señala la nariz.", R.drawable.cat_hum_nariz, R.drawable.img_nariz),
    OJO("Ojo","Ojo. Con el índice se señala el ojo.", R.drawable.cat_hum_ojo, R.drawable.img_ojo),
    OREJA("Oreja","Oreja. Con el índice y el pulgar se jala la oreja.", R.drawable.cat_hum_oreja, R.drawable.img_oreja),
    PECHO("Pecho","Pecho. Con la mano se golpea el pecho ligeramente.", R.drawable.cat_hum_pecho, R.drawable.img_pecho),
    PELO("Pelo","Pelo. Con el índice y el pulgar se toma un mechón de pelo, y se muestra.", R.drawable.cat_hum_pelo, R.drawable.img_pelo),
    PESTANIAS("Pestañas","Pestañas. Se coloca la mano abierta frente al ojo, tocando la cara con el dorso de la muñeca, y se mueve hacia arriba, levantándose.", R.drawable.cat_hum_pestanias, R.drawable.img_pestanias),
    UNIA("Uña","Uña. Con el índice y el pulgar tocándose por las yemas, se rodea la uña del índice de la otra mano.", R.drawable.cat_hum_unia, R.drawable.img_unia),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Humano(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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
