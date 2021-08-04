package ru.skillbox.ex9;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
}

class Car {
    Engine engine;

    void start(String key) throws CheckEngineException, AccessException {
        if (key == null || key.length() < 5)
            throw new AccessException();
        var liquids = new ArrayList<String>();
        liquids.add("fuel");
        liquids.add("antifreeze");
        try {
            engine.startEngine(key, liquids);
        } catch (FuelInjectionException e) {
            e.printStackTrace();
            throw new CheckEngineException();
        }
    }
}

class Engine {
    void startEngine(String key, List<String> liquids) throws FuelInjectionException {
        System.out.println(key.charAt(9));
        liquids.remove(0);
        throw new FuelInjectionException();
    }
}

class FuelInjectionException extends Exception {
}

class CheckEngineException extends Exception {
}

class AccessException extends Exception {
}

