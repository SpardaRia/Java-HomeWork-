package S_06;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {
    private String name;

    private int amountRAM;
    private String laptopType;
    private String operatingSystem;
    private double screen;
    private String screenResolution;
    private int price;
    private String model;

    public Notebook(String name, int amountRAM, String laptopType, double screen, String operatingSystem,
            String screenResolution, int price, String model) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.laptopType = laptopType;
        this.screen = screen;
        this.operatingSystem = operatingSystem;
        this.screenResolution = screenResolution;
        this.price = price;
        this.model = model;
    }

    public Notebook(String string, int i, String string2, Float d, String string3, String string4, int j,
            String string5) {
    }

    public boolean validateObject() {
        return true;
    }

    public static List<String> propertiesForFilter() {
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("laptopType");
        list.add("screen");
        list.add("operatingSystem");
        list.add("screenResolution");
        list.add("price");
        list.add("model");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + amountRAM +
                ", тип ноутбук:" + laptopType +
                ", диагональ экрана:" + screen +
                ", операционная система: " + operatingSystem + '\'' +
                ", разрешение экрана:" + screenResolution +
                ", цена: " + price +
                ", модель: " + model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getLaptopType() {
        return laptopType;
    }

    public void setLaptopType(String laptopType) {
        this.laptopType = laptopType;
    }

    public float getScreen() {
        return (float) screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
