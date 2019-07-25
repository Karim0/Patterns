package com.company.factory_abstract;

import com.company.factory_abstract.factories.GUIFactory;
import com.company.factory_abstract.factories.MacOSFactory;
import com.company.factory_abstract.factories.WindowsOSFactory;

public class Demo {
    private static Application configureApplication (){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsOSFactory();
            app = new Application(factory);
        }
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
