package dienynas.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pazymiai")
public class Pazymys {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "studentas_id", referencedColumnName = "Id")
    private Studentas studentas;

//    @Column(name = "data")
    private LocalDate data;
    private Integer pazymys;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Studentas getStudentas() {
        return studentas;
    }

    public void setStudentas(Studentas studentas) {
        this.studentas = studentas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer getPazymys() {
        return pazymys;
    }

    public void setPazymys(Integer pazymys) {
        this.pazymys = pazymys;
    }

    @Override
    public String toString() {
        return "Pazymys{" +
                "Id=" + Id +
//                ", studentas=" + studentas +
                ", data=" + data +
                ", pazymys=" + pazymys +
                '}';
    }
}
