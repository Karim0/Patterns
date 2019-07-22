package com.company.factory.dialog;

import com.company.factory.button.Button;
import com.company.factory.button.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
