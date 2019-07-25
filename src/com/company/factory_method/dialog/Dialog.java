package com.company.factory_method.dialog;

import com.company.factory_method.button.Button;

public abstract class Dialog {

    public void renderWindow(){
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
