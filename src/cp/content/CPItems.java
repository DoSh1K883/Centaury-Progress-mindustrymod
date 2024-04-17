package content;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.type.Item;

public class CPItems {

    public static Item

            palladium, cobalt, chrome, silinor, magnetite, pelner, densatum;

    public static final Seq<Item> snewerusItems = new Seq<>();

    public static final Seq<Item> KatorItems = new Seq<>();

    public static void load(){
        palladium = new Item("palladium", Color.valueOf("7c515c")){{
            cost = 1f;
            hardness = 4;
        }};

        cobalt = new Item("cobalt", Color.valueOf("74747c")){{
            cost = 1.2f;
            hardness = 4;
        }};

        chrome = new Item("chrome", Color.valueOf("768a9a")){{
            cost = 1.8f;
            hardness = 6;
        }};

        silinor = new Item("silinor", Color.valueOf("768a9a")){{
            cost = 0.9f;
        }};

        magnetite = new Item("magnetite", Color.valueOf("51557c")){{
            cost = 1.4f;
        }};

        pelner = new Item("pelner", Color.valueOf("7a7c65")){{
            cost = 1f;
        }};

        densatum = new Item("densatum", Color.valueOf("66616e")){{
            cost = 1.6f;
            healthScaling = 1.2f;
        }};
    }
}