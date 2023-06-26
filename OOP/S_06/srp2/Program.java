package srp2;

public class Program {

    private static Order order;

    public static void main(String[] args) {

        SetValue setValue = new SetValue(order);
        setValue.inputFromConsole();

        SaveFile saveFile = new SaveFile(order);
        saveFile.saveToJson();

    }

}
