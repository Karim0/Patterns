package com.company.factory_method.dialog;

import com.company.factory_method.button.Button;
import com.company.factory_method.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
