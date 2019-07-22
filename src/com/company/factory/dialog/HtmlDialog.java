package com.company.factory.dialog;

import com.company.factory.button.Button;
import com.company.factory.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
