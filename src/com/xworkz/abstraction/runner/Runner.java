package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.internal.*;
import com.xworkz.abstraction.external.*;

public class Runner {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        PrinterUser printerUser = new PrinterUser(printer);
        printerUser.execute();
        System.out.println("");

        Scanner scanner = new ScannerImpl();
        ScannerUser scannerUser = new ScannerUser(scanner);
        scannerUser.execute();
        System.out.println("");

        Monitor monitor = new MonitorImpl();
        MonitorUser monitorUser = new MonitorUser(monitor);
        monitorUser.execute();
        System.out.println("");

        Speaker speaker = new SpeakerImpl();
        SpeakerUser speakerUser = new SpeakerUser(speaker);
        speakerUser.execute();
        System.out.println("");

        Keyboard keyboard = new KeyboardImpl();
        KeyboardUser keyboardUser = new KeyboardUser(keyboard);
        keyboardUser.execute();
        System.out.println("");

        Mouse mouse = new MouseImpl();
        MouseUser mouseUser = new MouseUser(mouse);
        mouseUser.execute();
        System.out.println("");

        Camera camera = new CameraImpl();
        CameraUser cameraUser = new CameraUser(camera);
        cameraUser.execute();
        System.out.println("");

        Projector projector = new ProjectorImpl();
        ProjectorUser projectorUser = new ProjectorUser(projector);
        projectorUser.execute();
        System.out.println("");

        Router router = new RouterImpl();
        RouterUser routerUser = new RouterUser(router);
        routerUser.execute();
        System.out.println("");

        Modem modem = new ModemImpl();
        ModemUser modemUser = new ModemUser(modem);
        modemUser.execute();
        System.out.println("");

        Mic mic = new MicImpl();
        MicUser micUser = new MicUser(mic);
        micUser.execute();
        System.out.println("");

        Tablet tablet = new TabletImpl();
        TabletUser tabletUser = new TabletUser(tablet);
        tabletUser.execute();
        System.out.println("");

        Laptop laptop = new LaptopImpl();
        LaptopUser laptopUser = new LaptopUser(laptop);
        laptopUser.execute();
        System.out.println("");

        Desktop desktop = new DesktopImpl();
        DesktopUser desktopUser = new DesktopUser(desktop);
        desktopUser.execute();
        System.out.println("");

        Smartwatch smartwatch = new SmartwatchImpl();
        SmartwatchUser smartwatchUser = new SmartwatchUser(smartwatch);
        smartwatchUser.execute();
        System.out.println("");

        Television television = new TelevisionImpl();
        TelevisionUser televisionUser = new TelevisionUser(television);
        televisionUser.execute();
        System.out.println("");

        Fan fan = new FanImpl();
        FanUser fanUser = new FanUser(fan);
        fanUser.execute();
        System.out.println("");

        AC ac = new ACImpl();
        ACUser acUser = new ACUser(ac);
        acUser.execute();
        System.out.println("");

        Heater heater = new HeaterImpl();
        HeaterUser heaterUser = new HeaterUser(heater);
        heaterUser.execute();
        System.out.println("");

        Bulb bulb = new BulbImpl();
        BulbUser bulbUser = new BulbUser(bulb);
        bulbUser.execute();
        System.out.println("");

        Switch switch1 = new SwitchImpl();
        SwitchUser switchUser = new SwitchUser(switch1);
        switchUser.execute();
        System.out.println("");

        Door door = new DoorImpl();
        DoorUser doorUser = new DoorUser(door);
        doorUser.execute();
        System.out.println("");

        Window window = new WindowImpl();
        WindowUser windowUser = new WindowUser(window);
        windowUser.execute();
        System.out.println("");

        Fridge fridge = new FridgeImpl();
        FridgeUser fridgeUser = new FridgeUser(fridge);
        fridgeUser.execute();
        System.out.println("");

        Oven oven = new OvenImpl();
        OvenUser ovenUser = new OvenUser(oven);
        ovenUser.execute();
        System.out.println("");

        Toaster toaster = new ToasterImpl();
        ToasterUser toasterUser = new ToasterUser(toaster);
        toasterUser.execute();
        System.out.println("");

        Washer washer = new WasherImpl();
        WasherUser washerUser = new WasherUser(washer);
        washerUser.execute();
        System.out.println("");

        Dryer dryer = new DryerImpl();
        DryerUser dryerUser = new DryerUser(dryer);
        dryerUser.execute();
        System.out.println("");

        Pump pump = new PumpImpl();
        PumpUser pumpUser = new PumpUser(pump);
        pumpUser.execute();
        System.out.println("");

        Valve valve = new ValveImpl();
        ValveUser valveUser = new ValveUser(valve);
        valveUser.execute();
        System.out.println("");

        Sensor sensor = new SensorImpl();
        SensorUser sensorUser = new SensorUser(sensor);
        sensorUser.execute();
        System.out.println("");

        Drone drone = new DroneImpl();
        DroneUser droneUser = new DroneUser(drone);
        droneUser.execute();
        System.out.println("");

        Robot robot = new RobotImpl();
        RobotUser robotUser = new RobotUser(robot);
        robotUser.execute();
        System.out.println("");

        Charger charger = new ChargerImpl();
        ChargerUser chargerUser = new ChargerUser(charger);
        chargerUser.execute();
        System.out.println("");

        PowerBank powerbank = new PowerBankImpl();
        PowerBankUser powerbankUser = new PowerBankUser(powerbank);
        powerbankUser.execute();
        System.out.println("");

        MonitorStand monitorstand = new MonitorStandImpl();
        MonitorStandUser monitorstandUser = new MonitorStandUser(monitorstand);
        monitorstandUser.execute();
        System.out.println("");

        Tripod tripod = new TripodImpl();
        TripodUser tripodUser = new TripodUser(tripod);
        tripodUser.execute();
        System.out.println("");

        Flashlight flashlight = new FlashlightImpl();
        FlashlightUser flashlightUser = new FlashlightUser(flashlight);
        flashlightUser.execute();
        System.out.println("");

        Remote remote = new RemoteImpl();
        RemoteUser remoteUser = new RemoteUser(remote);
        remoteUser.execute();
        System.out.println("");

        Alarm alarm = new AlarmImpl();
        AlarmUser alarmUser = new AlarmUser(alarm);
        alarmUser.execute();
        System.out.println("");

        Bell bell = new BellImpl();
        BellUser bellUser = new BellUser(bell);
        bellUser.execute();
        System.out.println("");

        Lock lock = new LockImpl();
        LockUser lockUser = new LockUser(lock);
        lockUser.execute();
        System.out.println("");

        Keypad keypad = new KeypadImpl();
        KeypadUser keypadUser = new KeypadUser(keypad);
        keypadUser.execute();
        System.out.println("");

        Wheel wheel = new WheelImpl();
        WheelUser wheelUser = new WheelUser(wheel);
        wheelUser.execute();
        System.out.println("");

        Lever lever = new LeverImpl();
        LeverUser leverUser = new LeverUser(lever);
        leverUser.execute();
        System.out.println("");

        Joystick joystick = new JoystickImpl();
        JoystickUser joystickUser = new JoystickUser(joystick);
        joystickUser.execute();
        System.out.println("");

        Stand stand = new StandImpl();
        StandUser standUser = new StandUser(stand);
        standUser.execute();
        System.out.println("");

        Board board = new BoardImpl();
        BoardUser boardUser = new BoardUser(board);
        boardUser.execute();
        System.out.println("");

        Pad pad = new PadImpl();
        PadUser padUser = new PadUser(pad);
        padUser.execute();
        System.out.println("");

        Device device = new DeviceImpl();
        DeviceUser deviceUser = new DeviceUser(device);
        deviceUser.execute();
        System.out.println("");


        Icc icc=new IndianCricketTeamIccImpl();
        BccIuser bcci=new BccIuser(icc);
        bcci.execute();
        System.out.println("");

        Constitution constitution=new CitizenConstitutionImpl();
        Government government=new Government(constitution);
        government.execute();
        System.out.println("");
    }
}
