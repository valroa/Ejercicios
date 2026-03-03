public class Personaje {

private String nombre;
private int nivel;
private int experiencia;
private int vida;
private boolean vivo;

public Personaje(){

}

    public Personaje(String nombre, int nivel, int experiencia, int vida, boolean vivo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vida = vida;
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", experiencia=" + experiencia +
                ", vida=" + vida +
                ", vivo=" + vivo +
                '}';
    }

    //METODOS

    //Experiencia
    public int ganarExperiencia(){
        experiencia = experiencia + experiencia;
    }

    //NIVEL
    public int subirNivel(){
        nivel = nivel + 1;
        experiencia = 0;
    }
    //DAÑO
    public void recibirDanio(){
        vida = vida - 15;
        if (vida <= 0){
    vivo = false;
        }
    }
    //CURARSE
    public int curarse(){
        vida = vida + 20;
    }


}
