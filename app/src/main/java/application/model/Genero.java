package application.model;

import javax.swing.Spring;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "genero")
public class Genero {
    @Id //Adribulto Identificador//
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Spring nome;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Spring getNome() {
        return nome;
    }
    public void setNome(Spring nome) {
        this.nome = nome;
    }
    
    
}
