package com.company.factory_abstract;

import com.company.factory_abstract.buttons.Button;
import com.company.factory_abstract.checkboxes.Checkbox;
import com.company.factory_abstract.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(Button button, Checkbox checkbox){
        this.button = button;
        this.checkbox = checkbox;
    }

    public Application(GUIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
