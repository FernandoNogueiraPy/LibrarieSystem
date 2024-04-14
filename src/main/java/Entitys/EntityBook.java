package Entitys;
import java.util.UUID;

/* @author Moltt */


public class EntityBook {
    
    private UUID id;
    private String title;
    private String autor;
    private int anoPublic;
    private int quantPaginas;
    

    public EntityBook(UUID id ,String title, String autor, int anoPublic, int quantPaginas) {
        
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.anoPublic = anoPublic;
        this.quantPaginas = quantPaginas;
        
    }
    
  
    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublic() {
        return anoPublic;
    }

    public int getQuantPaginas() {
        return quantPaginas;
    }

    
    public void setId(UUID id) {
        this.id = id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublic(int anoPublic) {
        this.anoPublic = anoPublic;
    }

    public void setQuantPaginas(int quantPaginas) {
        this.quantPaginas = quantPaginas;
    }
    
            
    public EntityBook ShowEntity(EntityBook entity) {
       
        return new EntityBook(entity.getId(), entity.getTitle(), entity.getAutor(), entity.getAnoPublic(), entity.getQuantPaginas());
    }
    
    @Override
    public String toString() {
        return "EntityBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublic=" + anoPublic +
                ", quantPaginas=" + quantPaginas +
                '}';
    }
    
    
}
