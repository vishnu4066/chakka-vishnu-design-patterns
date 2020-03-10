package design.patterns;

import TemplatePattern.*;
import SingletonPattern.*;
import AdapterPattern.*;
import CommandPattern.*;
import PrototypePattern.*;
import BridgePattern.*;

public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
		TemplatePatternDemo t = new TemplatePatternDemo();
		DriverSingleton s = new DriverSingleton();
		DriverAdapter a = new DriverAdapter();
		DriverCommand c = new DriverCommand();
		DriverBridge b = new DriverBridge();
		DriverPrototype p = new DriverPrototype();
    }
}
