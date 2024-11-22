package dev.ofiucoder.pj_santaclaus_toysfactory.view;

import dev.ofiucoder.pj_santaclaus_toysfactory.controllers.ToyController;
import dev.ofiucoder.pj_santaclaus_toysfactory.dtos.GoodToyDto;
import dev.ofiucoder.pj_santaclaus_toysfactory.dtos.BadToyDto;

public class ElfView extends View {

    private static final ToyController controller = new ToyController();

    public static void index() {
        System.out.println("-----------------------------------------");
        System.out.println("Gestor de juguetes (Tip de sessión: Elfo)");
        System.out.println("1. Añadir juguete");
        System.out.println("2. Ver todos los juguetes");
        System.out.println("4. Cerrar sesión");
        System.out.println("Seleccione una opción:");

        int option = scanner.nextInt();

        if (option == 1) selectChild();
        if (option == 4) closeSession();
    }

    public static void selectChild() {
        System.out.println("-----------------------------------------");
        System.out.println("Para niño ...:");
        System.out.println("1. Bueno");
        System.out.println("2. Malo");
        int option = scanner.nextInt();

        if (option == 1) postGoodToy();
        if (option == 2) postBadToy();
    }

    public static void postGoodToy() {
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese el título:");
        String title = scanner.next();
        System.out.println("Ingrese la marca:");
        String brand = scanner.next();
        System.out.println("Ingrese la edad recomendada:");
        int age = scanner.nextInt();
        System.out.println("Ingrese la categoria:");
        String category = scanner.next();

        // Dto - Data Transfert Object
        controller.postGoodToy(new GoodToyDto(title, brand, age, category));
    }

    public static void postBadToy() {
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese el título:");
        scanner.nextLine();
        String title = scanner.nextLine();
        System.out.println("Ingrese el contenido:");
        String content = scanner.nextLine();

        controller.postBadToy(new BadToyDto(title, content));
    }

    public static void addToyResponse() {
        System.out.println("Juguete añadido con éxito");
        index();
    }

    public static void closeSession() {
        HomeView.index();
    }


}
