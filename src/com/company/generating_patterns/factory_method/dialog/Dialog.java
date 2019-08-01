package com.company.generating_patterns.factory_method.dialog;

import com.company.generating_patterns.factory_method.button.Button;

public abstract class Dialog {

    public void renderWindow(){
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
