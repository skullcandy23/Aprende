package com.key.heart.aprende;

enum Familia {

    ABUELA("Abuela","Abuela. Se coloca una letra a sobre el puño de la otra mano, golpeándolo varias veces con la parte lateral del dedo meñique. Luego, se desliza el índice sobre la mejilla hacia abajo.", R.drawable.cat_fam_abuela, R.drawable.img_abuela),
    ABUELO("Abuelo","Abuelo. Se coloca una letra a sobre el puño de la otra mano, golpeándolo varias veces con la parte lateral del dedo meñique.", R.drawable.cat_fam_abuelo, R.drawable.img_abuelo),
    BEBE("Bebé","Bebé. Se coloca una palma sobre la otra con los brazos en posición de arrullo, y se mueven a los lados.", R.drawable.cat_fam_bebe, R.drawable.img_bebe),
    ESPOSA("Esposa","Esposa. Se unen las manos por las palmas. Luego, se desliza el índice sobre la mejilla hacia abajo.", R.drawable.cat_fam_esposa, R.drawable.img_esposa),
    ESPOSO("Esposo","Esposo. Se unen las manos por las palmas.", R.drawable.cat_fam_esposo, R.drawable.img_esposo),
    HERMANA("Hermana","Hermana. Se juntan los dedos índices por la parte lateral, y se deslizan al frente y de regreso alternadamente. Luego, se desliza el índice sobre la mejilla hacia abajo.", R.drawable.cat_fam_hermana, R.drawable.img_hermana),
    HERMANO("Hermano","Hermano. Se juntan los dedos índices por la parte lateral, y se deslizan al frente y de regreso alternadamente.", R.drawable.cat_fam_hermano, R.drawable.img_hermano),
    HIJA("Hija","Hija. Se coloca la mano abierta sobre el corazón, y se recorre al pecho, uniendo los dedos en capullo. Luego, se desliza el índice sobre la mejilla hacia abajo.", R.drawable.cat_fam_hija, R.drawable.img_hija),
    HIJO("Hijo","Hijo. Se coloca la mano abierta sobre el corazón, y se recorre al pecho, uniendo los dedos en capullo.", R.drawable.cat_fam_hijo, R.drawable.img_hijo),
    MAMA("Mamá","Mamá. Se coloca una letra m sobre la barba, tocándola con el dorso de los dedos, y la golpea ligeramente.", R.drawable.cat_fam_mama, R.drawable.img_mama),
    NIETA("Nieta","Nieta. Se hace la letra n con ambas manos, unidas por la parte lateral de los índices, y se golpean ligeramente. Luego se desliza el índice sobre la mejilla hacia abajo.", R.drawable.cat_fam_nieta, R.drawable.img_nieta),
    NIETO("Nieto","Nieto. Se hace la letra n con ambas manos, unidas por la parte lateral de los índices, y se golpean ligeramente.", R.drawable.cat_fam_nieto, R.drawable.img_nieto),
    PAPA("Papá","Papá. Se coloca una letra p sobre la barbilla, y la golpea ligeramente.", R.drawable.cat_fam_papa, R.drawable.img_papa),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Familia(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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
