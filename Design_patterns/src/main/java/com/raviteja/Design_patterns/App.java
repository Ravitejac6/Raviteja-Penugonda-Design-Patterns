package com.raviteja.Design_patterns;

import AdapterPattern.*;
import BridgePattern.*;
import CommandPattern.*;
import PrototypePattern.*;
import TemplatePattern.*;
import SIngletonPattern.*;

public class App 
{
    @SuppressWarnings("UnUsed")
	public static void main( String[] args )
    {
        DriverAdapter adapter_pattern = new DriverAdapter();
        DrawBridge bridge_pattern = new DrawBridge();
        DriverCommand command_pattern = new DriverCommand();
        DriverPrototype prototype_pattern = new DriverPrototype();
        DriverSingleton singleton_pattern = new DriverSingleton();
        DriverTemplate template_pattern = new DriverTemplate();
        
    }
}