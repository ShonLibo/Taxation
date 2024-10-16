public abstract class Vehicle {

    double CostInsuranceFreight;
    public double SeatingCapacity;
    public double GrossWeight;
    public double EngineCapacity;
    public double AgeOfCar;
    int Age;

     static final double ImportDuty = 0.25;
     static final double ValueAddedTax = 0.18;
    static final double WithHoldingTax = 0.06;
    static final double InfrastructureLevy = 150000;
    static final double StampDuty = 35000;
    static final double FormFees = 20000;
    static final double ExciseDuty = 200000;

     static final double RoadTollRate = 0.005;
     static final double BorderFeeRate = 0.015;
    static final double ParkingFee = 15000;

    public String roadFee;
    public String borderFee;
    public double transportTax;

    double FlatRate;

    public abstract void Registration(String PlateSystem);



    public Vehicle(double costInsuranceFreight, double seatingCapacity, double grossWeight, double engineCapacity, double ageOfCar) {
        CostInsuranceFreight = costInsuranceFreight;
        SeatingCapacity = seatingCapacity;
        GrossWeight = grossWeight;
        EngineCapacity = engineCapacity;
        AgeOfCar = ageOfCar;
    }

    public void ImportPay(){
            double Tax=StampDuty + FormFees+ExciseDuty;
        System.out.println(" Import pay is " + Tax);
    }

    public abstract void runTaxes();
    public double tax() {
        return WithHoldingTax+ValueAddedTax+ImportDuty;
    }
   
    public abstract void transportTaxes(String fee);
    public void BondTax(int day){
        double bond = day*ParkingFee;
        System.out.println("Bond fee:"+bond);
    }

}
