package com.example.evaluacion1_pdm_00195316;

public class JSON {

    private String nombre;
    private String email;
    private String producto1;
    private String producto2;
    private String producto3;
    private String producto4;
    private String producto5;
    private String producto6;
    private String producto7;
    private String producto8;
    private String producto9;

    public JSON (){}

    public JSON(String nombre, String email, String producto1, String producto2, String producto3, String producto4, String producto5, String producto6, String producto7, String producto8, String producto9) {
        this.nombre = nombre;
        this.email = email;
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
        this.producto4 = producto4;
        this.producto5 = producto5;
        this.producto6 = producto6;
        this.producto7 = producto7;
        this.producto8 = producto8;
        this.producto9 = producto9;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProducto1() {
        return producto1;
    }

    public void setProducto1(String producto1) {
        this.producto1 = producto1;
    }

    public String getProducto2() {
        return producto2;
    }

    public void setProducto2(String producto2) {
        this.producto2 = producto2;
    }

    public String getProducto3() {
        return producto3;
    }

    public void setProducto3(String producto3) {
        this.producto3 = producto3;
    }

    public String getProducto4() {
        return producto4;
    }

    public void setProducto4(String producto4) {
        this.producto4 = producto4;
    }

    public String getProducto5() {
        return producto5;
    }

    public void setProducto5(String producto5) {
        this.producto5 = producto5;
    }

    public String getProducto6() {
        return producto6;
    }

    public void setProducto6(String producto6) {
        this.producto6 = producto6;
    }

    public String getProducto7() {
        return producto7;
    }

    public void setProducto7(String producto7) {
        this.producto7 = producto7;
    }

    public String getProducto8() {
        return producto8;
    }

    public void setProducto8(String producto8) {
        this.producto8 = producto8;
    }

    public String getProducto9() {
        return producto9;
    }

    public void setProducto9(String producto9) {
        this.producto9 = producto9;
    }

    public String ImprimirJSON (){
        return "{ Nombre: " + getNombre() + "\n" +
                "Correo: " + getEmail() + "\n" +
                "Producto1: " + getProducto1() + "\n" +
                "Producto2: " + getProducto2() +"\n" +
                "Producto3: " + getProducto3() + "\n" +
                "Producto4: " + getProducto4() + "\n" +
                "Producto5: " + getProducto5() + "\n" +
                "Producto6: " + getProducto6() + "\n" +
                "Producto7: " + getProducto7() + "\n" +
                "Producto8: " + getProducto8() + "\n" +
                "Producto9: " + getProducto9() + "}" ;
      }
}

