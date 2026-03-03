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
        System.out.println("4. GANAR ESPERIENCIA");
        System.out.println("5. SUBIR DE NIVEL");
        System.out.println("6. APLICAR DAÑO");
        System.out.println("7. CURARLO");
        System.out.println("8. MOSTRAR ESTADO FINAL");

        op = teclado.nextInt();
        switch (op) {
            case 1 -> {
                //si no hay informacion pues mostrar que no hay informacion, pero si ha
                //hay informacion pues mostrar que hay
                if (Pe2.getNombre() == null) {
                    System.out.println("No hay informacion de algun personaje");
                } else {
                    System.out.println(lstPersonaje);
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
                String experiencia = teclado.next();

                System.out.println("Ingrese la vida que tiene el personaje: ");
                int vida = teclado.nextInt();

//OJO QUE PUEDE QUE NO ESTE SIRVIENDO EL MISMO PE1
                Personaje Pe1 = new Personaje (nombre, nivel, experiencia, vida);

                Pe1.setVivo(true);
                lstPersonaje.add(Pe1);
            }
            case 3 -> {
                String bus;
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
                        """);
                int opc;
                opc = teclado.nextInt();
                switch (opc) {

                    case 1 -> {
                        System.out.println("Ingrese la cantidad de experiencia que le quiere añadir al personaje ");
                        int experiencia = teclado.nextInt();
                        Pe3.ganarExperiencia();
                        System.out.println("Ahora tiene: " + experiencia);
                    }
                    case 2 -> {

                        Pe3.subirNivel();

                        System.out.println("Ahora es nivel: " + nivel);
                        System.out.println("Su experiencia es de: " + experiencia);
                    }
                    case 3 -> {

                        Pe3.recibirDanio();
                        System.out.println("Su vida actual es: " + vida);
                    }
                    case 4 -> {
                        Pe3.curarse();
                        System.out.println("Ahora su vida es de: " + vida);
                    }

                    default -> System.out.println("opcion invalida");
                }
            }
            case 4 -> {
                if (Pe2.getNombre() == null) {
                    System.out.println("No hay informacion de algun personaje");
                } else {
                    System.out.println(lstPersonaje);
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