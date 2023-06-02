package S_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("NB257", 4, "not gaming", 16, "Windows", "HD", 15999, "Irbis"));
        set.add(new Notebook("NB257", 4, "not gaming", 16.5, "Windows", "HD", 15999, "Irbis"));
        set.add(new Notebook("Easy", 4, "not gaming", 15.6, "Windows", "Full HD", 24999, "Echips"));
        set.add(new Notebook("TUF Dash F15 FX517ZM-HQ104", 16, "gaming", 15.6, "absent", "Full HD", 178999, "ASUS"));
        set.add(new Notebook("Laptop 15 F515KA-EJ027", 8, "not gaming", 15.6, "absent", "Full HD", 32999, "ASUS"));
        set.add(new Notebook("Megabook T1", 12, "not gaming", 15.6, "Linux", "Full HD", 33999, "Tecno"));
        set.add(new Notebook("Aspire 7 A715-42G-R6VJ", 8, "gaming", 15.6, "absent", "Full HD", 64999, "Acer"));
        set.add(new Notebook("Laptop 14 E410KA-BV119W", 4, "not gaming", 14, "Windows", "HD", 24999, "ASUS"));
        set.add(new Notebook("GAMING NEO G17-I5ND203", 16, "gaming", 17.3, "absent", "Full HD", 77499, "ARDOR"));

        Catalog operation = new Catalog(set);
        operation.start();

    }
}
