public abstract class VehicleReport {
    final void generateReport(){
        collectData();
        formatReport();
        logStatus();
    }
    protected void collectData(){
        System.out.println("Fetching GPS data...");
    }
    protected abstract void formatReport();

    protected void logStatus(){

        System.out.println("Log entry created.");
    }

}
