public abstract class VehicleReport {
    final void generateReport(){
        collectData();
        formatReport();
        logStatus();
        if(shouldCheckMaintenance()){
            performMaintenanceCheck();
        }
    }
    protected void collectData(){
        System.out.println("Fetching GPS data...");
    }
    protected abstract void formatReport();

    protected void logStatus(){

        System.out.println("Log entry created.");
    }
    protected void performMaintenanceCheck(){
        System.out.println("Performing Maintenance Check.");
    }
    protected boolean shouldCheckMaintenance(){
        return true;
    }
}
