package com.company.factory_abstract.factories;

import com.company.factory_abstract.buttons.Button;
import com.company.factory_abstract.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
