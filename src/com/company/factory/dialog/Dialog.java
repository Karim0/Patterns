package com.company.factory.dialog;

import com.company.factory.button.Button;

public abstract class Dialog {

    public void renderWindow(){
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
