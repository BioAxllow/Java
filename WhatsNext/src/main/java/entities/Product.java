package entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "product_id")
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private String image;

//    @ManyToOne
//    private CartLine cartLine;

//    @OneToMany(mappedBy = "product")
//    private Set<InvLine> invLine;
//
//    public Set<InvLine> getInvLine() {
//        return invLine;
//    }
//
//    public void setInvLine(Set<InvLine> invLine) {
//        this.invLine = invLine;
//    }

    //    public InvLine getInvLine() {
//        return invLine;
//    }
//
//    public void setInvLine(InvLine invLine) {
//        this.invLine = invLine;
//    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", price=" + price +
//                '}';
//    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
