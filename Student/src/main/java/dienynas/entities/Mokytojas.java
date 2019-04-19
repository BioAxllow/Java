package dienynas.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "mokytojai")
public class Mokytojas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String vardas;
    private String pavarde;

    @OneToMany(mappedBy = "mokytojas", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<Studentas> studentasSet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Set<Studentas> getStudentasSet() {
        return studentasSet;
    }

    public void setStudentasSet(Set<Studentas> studentasSet) {
        this.studentasSet = studentasSet;
    }
}

