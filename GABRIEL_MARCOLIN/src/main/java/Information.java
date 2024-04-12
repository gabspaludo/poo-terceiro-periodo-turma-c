package mercadinhov2;

public class Information {
    String name;
    int age;
    String city;
    String district;
    String street;

    public void apresentarse() {
        System.out.println("Nome da pessoa: " + this.name);
        System.out.println("Idade da pessoa: " + this.age + " anos.");
    }
}
