package com.key.heart.aprende;

enum Calendario {

    DOMINGO("Domingo","Domingo. Se hace una letra d, y se mueve en círculo.", R.drawable.cat_cal_domingo, R.drawable.img_domingo),
    LUNES("Lunes","Lunes. Se hace una letra l, y se mueve en círculo.", R.drawable.cat_cal_lunes, R.drawable.img_lunes),
    MARTES("Martes","Martes. Se hace una letra l con el dedo medio estirado, y se mueve en círculo.", R.drawable.cat_cal_martes, R.drawable.img_martes),
    MIERCOLES("Miércoles","Miércoles. Se hace una letra l con los dedos medio, anular y meñique estirados, y se mueve en círculo.", R.drawable.cat_cal_miercoles, R.drawable.img_miercoles),
    JUEVES("Jueves","Jueves. Se hace una letra j, y se mueve en círculo.", R.drawable.cat_cal_jueves, R.drawable.img_jueves),
    VIERNES("Viernes","Viernes. Se hace una letra v, y se mueve en círculo.", R.drawable.cat_cal_viernes, R.drawable.img_viernes),
    SABADO("Sábado","Sábado. Se hace una letra s, y se mueve en círculo.", R.drawable.cat_cal_sabado, R.drawable.img_sabado),
    ENERO("Enero","Enero. Se hace una letra e, y se rota la muñeca a los lados.", R.drawable.cat_cal_enero, R.drawable.img_enero),
    FEBRERO("Febrero","Febrero. Se hace una letra f, y se rota la muñeca a los lados.", R.drawable.cat_cal_febrero, R.drawable.img_febrero),
    MARZO("Marzo","Marzo. Se hace una letra m, y se mueve en círculo alrededor de la oreja.", R.drawable.cat_cal_marzo, R.drawable.img_marzo),
    ABRIL("Abril","Abril. Se hace una letra a, y se mueve en círculo alrededor de la oreja.", R.drawable.cat_cal_abril, R.drawable.img_abril),
    MAYO("Mayo","Mayo. Se hace una letra m, y se rota la muñeca a los lados.", R.drawable.cat_cal_mayo, R.drawable.img_mayo),
    JUNIO("Junio","Junio. Se hace una letra i, y se rota la muñeca a los lados.", R.drawable.cat_cal_junio, R.drawable.img_junio),
    JULIO("Julio","Julio. Se hace una letra i con el pulgar y el índice estirados, y se rota la muñeca a los lados.", R.drawable.cat_cal_julio, R.drawable.img_julio),
    AGOSTO("Agosto","Agosto. Se hace una letra a, y se rota la muñeca a los lados.", R.drawable.cat_cal_agosto, R.drawable.img_agosto),
    SEPTIEMBRE("Septiembre","Septiembre. Se hace una letra s, y se rota la muñeca a los lados.", R.drawable.cat_cal_septiembre, R.drawable.img_septiembre),
    OCTUBRE("Octubre","Octubre. Se hace una letra o, y se rota la muñeca a los lados.", R.drawable.cat_cal_octubre, R.drawable.img_octubre),
    NOVIEMBRE("Noviembre","Noviembre. Se hace una letra u, y se rota la muñeca a los lados.", R.drawable.cat_cal_noviembre, R.drawable.img_noviembre),
    DICIEMBRE("Diciembre","Diciembre. Se hace una letra d, y se rota la muñeca a los lados.", R.drawable.cat_cal_diciembre, R.drawable.img_diciembre),;

    private final String nombre;
    private final String descripcion;
    private final int rutaSenia;
    private final int rutaImagen;

    Calendario(String nombre,String descripcion, int rutaSenia, int rutaImagen){
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
