public class otherVehicle extends Vehicle{
    public otherVehicle(double costInsuranceFreight, double seatingCapacity, double grossWeight, double engineCapacity, double ageOfCar) {
        super(costInsuranceFreight, seatingCapacity, grossWeight, engineCapacity, ageOfCar);
    }

    @Override
    public void Registration(String PlateSystem) {
        if (PlateSystem.equals("APS")) {
            FlatRate =300000;
            System.out.println("The Flat rate is "+ FlatRate);
        } else if (PlateSystem.equals("DPS")) {
            FlatRate =700000;
            System.out.println(" The Flat Rate is " + FlatRate);
        }
    }

    @Override
    public void ImportPay() {
        super.ImportPay();
    }

    @Override
    public void runTaxes() {
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
        super.BondTax(9);
    }
}
