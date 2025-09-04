class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000; // class variable

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
