/**
 * Returns an Image object that can then be painted on the screen.
 * The url argument must specify an absolute {@link URL}. The name
 * argument is a specifier that is relative to the url argument.
 * <p>
 * This method always returns immediately, whether or not the
 * image exists. When this applet attempts to draw the image on
 * the screen, the data will be loaded. The graphics primitives
 * that draw the image will incrementally paint on the screen.
 *
 * @param  id gjfjgkflajgksolute URL giving the base location of the image
 * @param  name the location of the image, relative to the url argument
 * @return      the image at the specified URL
 * @see         Image
 */

package dienynas.entities;


import javax.persistence.*;
import java.util.Comparator;
import java.util.Set;

@Entity
@Table(name = "studentai")
public class Studentas implements Comparable<Studentas> {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "vardas", length = 20)
    private String name;

    @Column(name = "pavarde", length = 30)
    private String surname;

    @Column(name = "el_pastas", length = 50)
    private String email;

    @ManyToOne
//    @JoinColumn(name = "studentas_id", referencedColumnName = "id")
    private Mokytojas mokytojas;

    @OneToMany(mappedBy = "studentas", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    Set<Pazymys> pazymiai;

    public Mokytojas getMokytojas() {
        return mokytojas;
    }

    public void setMokytojas(Mokytojas mokytojas) {
        this.mokytojas = mokytojas;
    }

    public Set<Pazymys> getPazymiai() {
        return pazymiai;
    }

    public void setPazymiai(Set<Pazymys> pazymiai) {
        this.pazymiai = pazymiai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Studentas{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", mokytojas=" + mokytojas +
                ", pazymiai=" + pazymiai +
                '}';
    }

    @Override
    public int compareTo(Studentas o) {
        int compare = getSurname().compareTo(o.getSurname());
        if (compare<=0) return compare;

        return getName().compareTo(o.getName());

    }

}
