package com.company.structural_patterns.bridge;

import com.company.structural_patterns.bridge.devices.Device;
import com.company.structural_patterns.bridge.devices.Radio;
import com.company.structural_patterns.bridge.devices.Tv;
import com.company.structural_patterns.bridge.remotes.AdvancedRemote;
import com.company.structural_patterns.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        System.out.println("Test with basic remote");
        BasicRemote basicRemote= new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Test with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.mute();
        advancedRemote.power();
        device.printStatus();
    }
}
