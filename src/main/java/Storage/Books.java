package Storage;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import Entitys.EntityBook;

/* @author Moltt */
public class Books {
    
    public static List<EntityBook> AvailableBooks() {
        
        // Criar uma lista de livros
        List<EntityBook> library = new ArrayList<>();

        library.add(new EntityBook(UUID.randomUUID(), "Clean Code", "Robert C. Martin", 2008, 464));
        library.add(new EntityBook(UUID.randomUUID(), "Estruturas de Dados e Algoritmos em Java", "Michael T. Goodrich", 2004, 736));
        library.add(new EntityBook(UUID.randomUUID(), "Introducao a Programacao com Python", "Nilo Ney Coutinho Menezes", 2019, 320));
        
        return library;
        
    }
}