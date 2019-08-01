package com.company.generating_patterns.factory_method.dialog;

import com.company.generating_patterns.factory_method.button.Button;
import com.company.generating_patterns.factory_method.button.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
