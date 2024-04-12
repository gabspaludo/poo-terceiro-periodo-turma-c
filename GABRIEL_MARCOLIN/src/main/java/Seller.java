package mercadinhov2;

public class Seller extends Information {
    private String name = "Igor Felipe";
    private int age = 20;
    private Store store;
    private String city = "Curitiba";
    private String district = "Santo Amaro";
    private String rua = "Leide Rocha";
    private double baseSalary = 1700;
    private double[] receivedSalaries = {1300, 1500, 1700};

    @Override
    public void apresentarse() {
        System.out.println("Nome do funcionário: " + this.name);
        System.out.println("Idade do funcionário: " + this.age + " anos");
        System.out.println("Loja onde o funcionário trabalho: " + this.store);

        /*Fiquei confuso, o que necessariamente deve ser printado de Loja? Tudo?*/
    }

    public void calculateAverage() {
        int average = 0;

        for (int i = 0; i < receivedSalaries.length; i++) {
            average += receivedSalaries[i];
        }

        average = average / receivedSalaries.length;
        System.out.println("Média dos salários recebidos: " + average);
    }

    public void calculateBonus() {
        System.out.println("O bônus que o funcionário irá receber é de " + (baseSalary * 0.2) + " reais");
    }
}
