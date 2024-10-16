

public class VehicleTaxation {

    public static void main(String[] args) {

        Ambulance ambulance = new Ambulance(3450,4,2000,3000,2020);
        System.out.println("CIF:"+ ambulance.CostInsuranceFreight +"Seating Capacity:" +ambulance.SeatingCapacity+"Gross Weight:"+ambulance.GrossWeight+"Engine Capacity:"+ambulance.EngineCapacity+"Age:"+ambulance.AgeOfCar);
        ambulance.Registration("DPS");
        ambulance.ImportPay();
        ambulance.BondTax(10);
        ambulance.tax();
        ambulance.runTaxes();


        Estate estate = new Estate(4000,5,3000,2000,2013);
        System.out.println("CIF:"+ estate.CostInsuranceFreight +"Seating Capacity:" + " " + estate.SeatingCapacity+"Gross Weight:" + " " + estate.GrossWeight+"Engine Capacity:" + " " +estate.EngineCapacity+"Age:" + " " + estate.AgeOfCar);
        estate.Registration("APS");
        estate.ImportPay();
        estate.BondTax(20);
        estate.tax();
        estate.runTaxes();

        Sedan sedan = new Sedan(4450,5,2000,3000,2019);
        System.out.println("CIF:"+ sedan.CostInsuranceFreight +"Seating Capacity:" +sedan.SeatingCapacity+"Gross Weight:"+sedan.GrossWeight+"Engine Capacity:"+sedan.EngineCapacity+"Age:"+sedan.AgeOfCar);
        sedan.Registration("DPS");
        sedan.ImportPay();
        sedan.BondTax(30);
        sedan.tax();
        sedan.runTaxes();


       SUV suv = new SUV(5230,5,3000,5000,2024);
        System.out.println("CIF:"+ suv.CostInsuranceFreight +"Seating Capacity:" +suv.SeatingCapacity+"Gross Weight:"+suv.GrossWeight+"Engine Capacity:"+suv.EngineCapacity+"Age:"+suv.AgeOfCar);
        suv.Registration("APS");
        suv.ImportPay();
        suv.BondTax(40);
        suv.tax();
        suv.runTaxes();

        Trailer trailer = new Trailer(6745,15,7000,5000,2010);
        System.out.println("CIF:"+ trailer.CostInsuranceFreight +"Seating Capacity:" +trailer.SeatingCapacity+"Gross Weight:"+trailer.GrossWeight+"Engine Capacity:"+trailer.EngineCapacity+"Age:"+trailer.AgeOfCar);
        trailer.Registration("DPS");
        trailer.ImportPay();
        trailer.BondTax(50);
        trailer.tax();
        trailer.runTaxes();

        otherVehicle other = new otherVehicle(233,7,333,1000,2017);
        System.out.println("CIF:"+ other.CostInsuranceFreight +"Seating Capacity:" +other.SeatingCapacity+"Gross Weight:"+other.GrossWeight+"Engine Capacity:"+other.EngineCapacity+"Age:"+other.AgeOfCar);
        other.Registration("DPS");
        other.ImportPay();
        other.BondTax(60);
        other.tax();
        other.runTaxes();

    }
}