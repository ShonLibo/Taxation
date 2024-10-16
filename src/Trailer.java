public class Trailer extends  Vehicle {

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

    public Trailer(double costInsuranceFreight, double seatingCapacity, double grossWeight, double engineCapacity, double ageOfCar)
    {
        super(costInsuranceFreight, seatingCapacity, grossWeight, engineCapacity, ageOfCar);
    }

    @Override
    public void runTaxes() {

        double totalTax = 0.0;

        if (GrossWeight < 15000) {
            totalTax = 0.05 * CostInsuranceFreight;
        } else if (GrossWeight >= 15000 && GrossWeight <= 20000) {
            totalTax = 0.15 * CostInsuranceFreight;
        } else if (GrossWeight > 20000) {
            totalTax = 0.25 * CostInsuranceFreight;
        }

        if (EngineCapacity > 20000) {
            totalTax = 0.10 * CostInsuranceFreight;
        } else if (EngineCapacity >= 15000) {
            totalTax = 0.05 * CostInsuranceFreight;
        } else if (EngineCapacity < 15000) {
            totalTax = 0.025 * CostInsuranceFreight;
        }

        if (Age > 15) {
            System.out.println("Trailers older than 15 years cannot be imported.");
        }
            if (Age >= 10 && Age <= 15) {
                totalTax = 0.10 * CostInsuranceFreight;
            } else if (Age >= 5 && Age < 10) {
                totalTax = 0.05 * CostInsuranceFreight;
            } else if (Age < 5) {
                totalTax = 0.015 * CostInsuranceFreight;
            }
        System.out.println("Total taxes: "+totalTax);
        }
    @Override
    public void ImportPay() {
        super.ImportPay();
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
        super.BondTax(2);
    }

    }
