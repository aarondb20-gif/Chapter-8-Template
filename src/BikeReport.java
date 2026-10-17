public class BikeReport extends VehicleReport{
    @Override
    protected void formatReport() {
        System.out.println("Bike Report: Formatting lightweight parcel dimensions.");
    }
    @Override
    protected boolean shouldCheckMaintenance(){
        return false;
    }
}
