import taxes.TaxEarnings;
import taxes.TaxEarningsMinusSpendings;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("ООО Вектор", new TaxEarnings());
        company1.shiftMoney(10000000);
        company1.shiftMoney(-70000);
        company1.payTaxes();

        Company company2 = new Company("ООО Ромашка", new TaxEarningsMinusSpendings());
        company2.shiftMoney(100000);
        company2.shiftMoney(-70000);
        company2.payTaxes();

        company2.setTaxSystem(new TaxEarnings());
        company2.shiftMoney(70000);
        company2.payTaxes();
    }
}
