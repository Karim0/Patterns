package com.company.generating_patterns.factory_abstract.buttons;

public class WindowsOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsOSButton.");
    }
}
