class Device{
    String deviceId;
    String status;

    Device(String deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus(){
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device{
    private int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}

public class SmartHomeDevices{
    public static void main(String[] args){
        Thermostat thermostat1 = new Thermostat("T123", "Active", 22);
        thermostat1.displayStatus();
    }
}
