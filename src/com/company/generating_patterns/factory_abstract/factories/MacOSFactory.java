package com.company.generating_patterns.factory_abstract.factories;

import com.company.generating_patterns.factory_abstract.buttons.Button;
import com.company.generating_patterns.factory_abstract.buttons.MacOSButton;
import com.company.generating_patterns.factory_abstract.checkboxes.Checkbox;
import com.company.generating_patterns.factory_abstract.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
