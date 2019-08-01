package com.company.generating_patterns.factory_abstract.factories;

import com.company.generating_patterns.factory_abstract.buttons.Button;
import com.company.generating_patterns.factory_abstract.buttons.WindowsOSButton;
import com.company.generating_patterns.factory_abstract.checkboxes.Checkbox;
import com.company.generating_patterns.factory_abstract.checkboxes.WindowsOSCheckbox;

public class WindowsOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsOSCheckbox();
    }
}
