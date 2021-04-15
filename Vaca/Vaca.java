public class Vaca
{
    String nombre;
    int peso;
    int edad;
    String colorDePiel;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        nombre=nombre;
    }
    
    public int getPeso(){
        return peso;
    }
    public void setpeso(int peso){
        peso=peso;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        edad=edad;
    }
    
    public String getColorDePiel(){
        return colorDePiel;
    }
    public void setColorDePiel(String colorDePiel){
        colorDePiel=colorDePiel;
    }
    
    public Vaca(int peso, int edad, String nombre, String color){
        this.peso=peso;
        this.edad=edad;
        this.nombre=nombre;
        colorDePiel=color;
    }
    Vaca(){
        nombre="vaca lola xd";
        edad=6;
        peso=220;
        colorDePiel="blanco y negro";
    }
    String vacaCantante(){
        String canto;
        canto="la vaca lola la vaca lola tiene cabeza y tiene cola y hace muu";
        return canto;
    }
    String vacaQueSaluda(){
     String saludo;
     saludo="yo soy la " + nombre + " y peso " + peso + " ya estoy vieja tengo " + edad + " anios ";
     return saludo;
    }
    
}
