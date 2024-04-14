package Functions;

import Entitys.EntityBook;
import java.util.UUID;
import java.util.List;
import java.util.Scanner;


/*@author Moltt*/
public class MethodsLibrarie {

    private static Scanner scanner = new Scanner(System.in);

    /* methods application : ["insert","delete","viewer"] */
    public static void BookInsert(List<EntityBook> storage) {
        System.out.println("============================================================");
        System.out.println("Inserir um novo livro:");

        System.out.print("Titulo: ");
        String title = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ano de publicacao: ");
        int anoPublic = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Quantidade de paginas: ");
        int quantPaginas = scanner.nextInt();
        scanner.nextLine();

        UUID id = UUID.randomUUID();

        EntityBook newBook = new EntityBook(id, title, autor, anoPublic, quantPaginas);
        storage.add(newBook);

        System.out.println("Livro adicionado com sucesso!");
        System.out.println("============================================================");
    }

    public static void BookDelete(List<EntityBook> storage) {
        System.out.println("============================================================");
        int decision;

        System.out.println("Escolha o metodo para deletar o livro.");
        System.out.println("1 - Deletar por Nome");
        System.out.println("2 - Deletar por ID");

        decision = scanner.nextInt();
        scanner.nextLine();

        switch (decision) {
            case 1 -> {
                System.out.print("Nome: ");
                String name = scanner.nextLine();
                deleteByName(storage, name);
            }
            case 2 -> {
                System.out.print("ID: ");
                UUID id = UUID.fromString(scanner.nextLine());
                deleteById(storage, id);
            }
            default ->
                System.out.println("Opcao invalida.");
        }
        System.out.println("============================================================");
    }

    private static void deleteByName(List<EntityBook> storage, String name) {
        boolean found = false;
        for (EntityBook book : storage) {
            if (book.getTitle().equalsIgnoreCase(name)) {
                storage.remove(book);
                found = true;
                System.out.println("Livro excluido com sucesso!");
                break;
            }
        }
        if (!found) {
            System.out.println("Livro nao encontrado.");
        }
    }

    private static void deleteById(List<EntityBook> storage, UUID id) {
        boolean found = false;
        for (EntityBook book : storage) {
            if (book.getId().equals(id)) {
                storage.remove(book);
                found = true;
                System.out.println("Livro excluído com sucesso!");
                break;
            }
        }
        if (!found) {
            System.out.println("Livro nao encontrado.");
        }
    }

    public static void BookSearch(List<EntityBook> storage) {

        System.out.println("============================================================");
        int decision;

        System.out.println("Escolha a forma de buscar o livro");
        System.out.println("1 - Buscar por Nome");
        System.out.println("2 - Buscar por ID");

        decision = scanner.nextInt();
        scanner.nextLine();

        switch (decision) {
            case 1 -> {
                System.out.print("Nome: ");
                String name = scanner.nextLine();
                EntityBook view = BookSearchByName(storage, name);
                System.out.println("============================================================\n");
                System.out.println("Livro encontrado:\n");
                
                System.out.println("ID: " + view.getId());
                System.out.println("Titulo: " + view.getTitle());
                System.out.println("Autor: " + view.getAutor());
                System.out.println("Ano Publicado" + view.getAnoPublic());
                System.out.println("Quantidade de Paginas" + view.getQuantPaginas());
                
                System.out.println("============================================================\n");
            }
            case 2 -> {
                System.out.print("ID: ");
                UUID id = UUID.fromString(scanner.nextLine());
                EntityBook view = BookSearchById(storage, id);
                System.out.println("============================================================");
                System.out.println("Livro encontrado:\n");
                
                System.out.println("ID: " + view.getId());
                System.out.println("Titulo: " + view.getTitle());
                System.out.println("Autor: " + view.getAutor());
                System.out.println("Ano Publicado" + view.getAnoPublic());
                System.out.println("Quantidade de Paginas" + view.getQuantPaginas());
                
                System.out.println("============================================================\n");
            }
            default ->
                System.out.println("Opcao invalida.");
        }

        System.out.println("============================================================");

    }

    public static EntityBook BookSearchById(List<EntityBook> storage, UUID id) {
        for (EntityBook book : storage) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public static EntityBook BookSearchByName(List<EntityBook> storage, String name) {
        for (EntityBook book : storage) {
            if (book.getTitle().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    public static void AllBooks(List<EntityBook> availableBooks) {

        System.out.println("============================================================");
        for (EntityBook livro : availableBooks) {
            System.out.println(livro.toString());
        }
        System.out.println("============================================================");

    }
}
