package mercadinhov2;

public class Client extends Information {

    private String name = "Gabriel Marcolin";
    private int age = 21;
    private String city = "Cascavel";
    private String district = "Parque Verde";
    private String street = "Jatobá";

    @Override
    public void apresentarse() {
        System.out.println("Nome do cliente: " + this.name);
        System.out.println("Idade do cliente: " + this.age + " anos.");
    }
}
