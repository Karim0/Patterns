package com.company.generating_patterns.factory_abstract.factories;

import com.company.generating_patterns.factory_abstract.buttons.Button;
import com.company.generating_patterns.factory_abstract.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
