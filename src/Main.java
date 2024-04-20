import articuloselectronicos.ArtículoElectrónico;
import articuloselectronicos.Laptop;
import articuloselectronicos.Telefono;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static ArrayList<ArtículoElectrónico> listaArticulosElectronicos = new ArrayList<>();
    public static void main(String[] args) {

        menuPrincipal();

    }

    private static void menuPrincipal() {
        Scanner in = new Scanner(System.in);
        int opcion;
        while (true){
            try {
            imprimirMenu();
            opcion = in.nextInt();
            in.nextLine();

            if(opcion == 4){
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (opcion){
                case 1:
                    agregarArticulo();
                    break;
                case 2:
                    modificarArticulo();
                    break;
                case 3:
                    consultarListado();
                    break;
                default:
                    System.out.println("Por favor,seleccione una opcion del menu");
            }
        }catch (InputMismatchException e){
                System.out.println("Ingrese un dato valido");
                in.nextLine();
            }
        }

    }

    private static void consultarListado() {
        int counter = 1;
        for (ArtículoElectrónico a: listaArticulosElectronicos){
            System.out.println("=========================================");
            System.out.println("Numero de articulo: " + counter + "\n"
            + "Nombre del articulo: " + a.getNombre() + "\n"
            +"Modelo del articulo: " + a.getModelo() + "\n"
            +"Precio del articulo: " + a.obtenerPrecio() + "\n"
            + "Descripcion: " + a.obtenerDescripcion() + "\n"
            + "==========================================");

            counter++;
        }
    }

    private static void modificarArticulo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo que desea modificar: ");
        String nombre = in.nextLine();
        for(ArtículoElectrónico a: listaArticulosElectronicos){

            if (a.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Ingrese el nuevo modelo del articulo");
                String nuevoModelo = in.nextLine();
                a.setModelo(nuevoModelo);
                break; //check later
            }

        }
    }

    private static void agregarArticulo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo electronico: ");
        String nombre = in.nextLine();
        System.out.println("Ingrese el modelo del articulo electronico: ");
        String modelo = in.nextLine();
        ArtículoElectrónico articulo = null;
        int tipoArticulo = obtenerTipo();
        switch (tipoArticulo){
            case 1:
                System.out.println("Ingrese la cantidad de camaras: ");
                int cantidadCamaras  = in.nextInt();
                System.out.println("Ingrese el peso del telefono: ");
                double peso = in.nextDouble();
                articulo = new Telefono(nombre,modelo,peso,cantidadCamaras);
                break;
            case 2:
                System.out.println("Ingresar el color de la laptop: ");
                String color = in.nextLine();
                System.out.println("Ingrese el ancho de la laptop: ");
                double ancho = in.nextDouble();
                articulo = new Laptop(nombre,modelo,color,ancho);
                break;
            default:
                System.out.println("Ingrese una opcion del menu.");

        }

        listaArticulosElectronicos.add(articulo);
        System.out.println("¡Articulo agregado exitosamente!");

    }

    private static int obtenerTipo() {
        Scanner in = new Scanner(System.in);
        int opcion;
        while(true){
            try{
                System.out.println("Ingrese un tipo de articulo: \n"
                +"\t 1. Telefono\n"
                +"\t 2. Laptop \n" );
                opcion = in.nextInt();

                if(opcion>= 1 && opcion <= 2){
                    return opcion;
                }else{
                    System.out.println("Ingrese una opcion del menu");
                }
            }catch (Exception e){
                System.out.println("Ingrese un dato valido por favor");
            }finally {
                in.nextLine();
            }
        }
    }

    private static void imprimirMenu() {
        System.out.println("Seleccione una opcion del menu: \n"
        + "\t 1. Agregar articulo electronico.\n"
        + "\t 2. Modificar articulo electronico.\n"
        + "\t 3. Consultar listado de articulos\n"
        + "\t 4. Salir.");

        System.out.println("Opcion -> ");
    }
}
