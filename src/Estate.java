public class Estate extends Vehicle{

    @Override
    public void Registration(String PlateSystem) {

        if (PlateSystem.equals("APS")) {
            FlatRate =300000;
            System.out.println("The Flat rate is "+ FlatRate);
        } else if (PlateSystem.equals("DPS")) {
            FlatRate = 700000;
            System.out.println(" The Flat Rate is " + FlatRate);
        }
    }

    public Estate(double costInsuranceFreight, double seatingCapacity, double grossWeight, double engineCapacity, double ageOfCar)
    {
        super(costInsuranceFreight, seatingCapacity, grossWeight, engineCapacity, ageOfCar);
    }

    @Override
    public void runTaxes() {
        double tax = 0;

        if (SeatingCapacity > 5) {
            tax += SeatingCapacity * 250000;
        }

        if (GrossWeight < 1500) {
            tax += 0.02 * CostInsuranceFreight;
        } else if (GrossWeight >= 1500 && GrossWeight <= 2000) {
            tax += 0.05 * CostInsuranceFreight;
        } else if (GrossWeight > 2000) {
            tax += 0.10 * CostInsuranceFreight;
        }

        if (EngineCapacity > 1800) {
            tax += 0.05 * CostInsuranceFreight;
        } else {
            tax += 0.025 * CostInsuranceFreight;
        }

        if (Age >= 1 && Age <= 5) {
            tax += 0.01 * CostInsuranceFreight;
        } else if (Age > 5 && Age <= 10) {
            tax += 0.05 * CostInsuranceFreight;
        } else if (Age > 10) {
            tax += 0.15 * CostInsuranceFreight;
        }

        System.out.println("Total taxes: " + tax);
    }

    @Override
    public double tax() {
        return super.tax();
    }

    @Override
    public void ImportPay() {
        super.ImportPay();
    }
    @Override
    public void transportTaxes(String fee) {
        if (roadFee.equals("Carrier")){
            transportTax = RoadTollRate*CostInsuranceFreight;
            System.out.println("Road fee "+transportTax);
        } else if (borderFee.equals("Border")) {
            transportTax = BorderFeeRate*CostInsuranceFreight;
            System.out.println("Border fee: "+transportTax);
        }
    }

    @Override
    public void BondTax(int day) {
        super.BondTax(5);
    }

}
