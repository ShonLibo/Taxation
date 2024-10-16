public class SUV extends Vehicle{
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

    public SUV(double costInsuranceFreight, double seatingCapacity, double grossWeight, double engineCapacity, double ageOfCar)
    {
        super(costInsuranceFreight, seatingCapacity, grossWeight, engineCapacity, ageOfCar);
    }

    @Override
    public void ImportPay() {
        super.ImportPay();
    }

    @Override
    public void runTaxes() {
        double totalTax = 0.0;

        if (SeatingCapacity > 5) {
            totalTax = (SeatingCapacity - 5) * 350000;
        }

        if (GrossWeight > 5000) {
            totalTax = 0.15 * CostInsuranceFreight;
        }

        if (Age >= 1 && Age < 5) {
            totalTax = 0.01 * CostInsuranceFreight;
        } else if (Age >= 5 && Age <= 10) {
            totalTax = 0.15 * CostInsuranceFreight;
        } else if (Age > 10) {
            totalTax = 0.25 * CostInsuranceFreight;
        }
        System.out.println("Total taxes: "+totalTax);
    }

    @Override
    public double tax() {
        return super.tax();
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
        super.BondTax(10);
    }
}
