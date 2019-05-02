package _00_Objektinis_Programavimas_2019._15_Nested_Klases;

public class Emploee {
    private String name;
    private Double atlyginimas;
    private Address add;

    public Emploee(String name, Double atlyginimas, String city, String street, Integer nr) {
        this.name = name;
        this.atlyginimas = atlyginimas;
        this.add = new Address(city, street, nr);
    }

    static class Address {
        private String city;
        private String street;
        private Integer nr;

        public Address(String city, String street, Integer nr) {
            this.city = city;
            this.street = street;
            this.nr = nr;
        }
        public Integer getNr2(){
            return this.nr;
        }

    }
    public String getCityMain(){
        return add.city;
    }
    public String getStreet(){
        return add.street;
    }
    public Double getAtlyginimas(){
        return atlyginimas;
    }
}
