package com.company.factory_abstract.checkboxes;

public class WindowsOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsOSCheckbox.");
    }
}
