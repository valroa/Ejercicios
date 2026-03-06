import java.util.*;
void main() {

    Scanner teclado = new Scanner(System.in);

    Personaje Pe2 = new Personaje();
    Personaje Pe3 = new Personaje();
    List<Personaje> lstPersonaje = new ArrayList<>();
    int op;
    do {
        System.out.println("1. MOSTRAR ESTADO INICIAL");
        System.out.println("2. CREAR PERSONAJE");
        System.out.println("3. BUSCAR");
        System.out.println("4. MOSTRAR ESTADO FINAL");

        op = teclado.nextInt();
        switch (op) {
            case 1 -> {
                //si no hay informacion pues mostrar que no hay informacion, pero si ha
                //hay informacion pues mostrar que hay
                if (lstPersonaje.isEmpty()) {
                    System.out.println("No hay informacion de algun personaje");
                } else {
                    for (Personaje Pe8 : lstPersonaje) {
                        System.out.println(Pe8);
                    }

                }
            }
            case 2 -> {
                System.out.println("Ingrese el nombre del personaje: ");
                String nombre = teclado.next();

                System.out.println("Ingrese el nivel que tiene el personaje: ");
                int nivel = teclado.nextInt();

                System.out.println("Ingrese la experiencia que tiene el personaje: ");
                int experiencia = teclado.nextInt();

                System.out.println("Ingrese la vida que tiene el personaje: ");
                int vida = teclado.nextInt();

//OJO QUE PUEDE QUE NO ESTE SIRVIENDO EL MISMO PE1
                Personaje Pe1 = new Personaje(nombre, nivel, experiencia, vida, true);

                Pe1.setVivo(true);
                lstPersonaje.add(Pe1);
            }
            case 3 -> {
                String bus;
                if (lstPersonaje.isEmpty()) {
                    System.out.println("No hay informacion de algun personaje");
                }else {
                System.out.println("Ingrese el nombre del personaje");
                bus = teclado.next();

                Personaje Perso = null;

                for (Personaje p1 : lstPersonaje) {
                    if (p1.getNombre().equalsIgnoreCase(bus)) {
                        Perso = p1;
                    }

                }
                System.out.println("""
                        1.Ganar experiencia
                         2.Subir de nivel
                         3.Aplicar daño
                         4.Curarlo
                         5.Mostrar todo
                        """);
                int opc;
                opc = teclado.nextInt();
                switch (opc) {

                    case 1 -> {

                        Perso.ganarExperiencia();
                        System.out.println("se le subio 10, ahora su personaje tiene: " + Perso.getExperiencia());
                    }
                    case 2 -> {

                        Perso.subirNivel();

                        System.out.println("se le subio 1, ahora es nivel: " + Perso.getNivel());
                        System.out.println("Su experiencia se reinicio, ahora tiene: " + Perso.getExperiencia());
                    }
                    case 3 -> {

                        Perso.recibirDanio();
                        System.out.println("Su vida es: " + Perso.getVida() + ", El estado de vida es: " + Perso.isVivo());

                    }
                    case 4 -> {
                        Perso.curarse();
                        System.out.println("Ahora su vida es de: " + Perso.getVida());
                    }
                    case 5 -> {
                        for (Personaje p : lstPersonaje) {
                            Perso.mostrarEstado();
                        }
                    }

                    default -> System.out.println("opcion invalida");
                }
            }}
            case 4 -> {
                if (lstPersonaje.isEmpty()) {
                    System.out.println("No hay informacion de algun personaje");
                } else {
                    for (Personaje Pe8 : lstPersonaje) {
                        System.out.println(Pe8);
                    }

                }
            }
            default -> System.out.println("opcion invalida");

        }}
        while (op != 4) ;
        System.out.println("Saliendo");


}