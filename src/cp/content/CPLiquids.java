package mindustry.content;

import arc.graphics.*;
import mindustry.type.*;

public class CPLiquids{
    public static Liquid ammonia, bluphia;

    public static void load(){

        ammonia = new Liquid("ammonia", Color.valueOf("596ab8")){{
            heatCapacity = 0.4f;
            effect = StatusEffects.wet;
            boilPoint = 0.1f;
        }};

        bluphia = new Liquid("bluphia", Color.valueOf("544c67")){{
            temperature = 0.35f;
            viscosity = 1.4f;
            effect = StatusEffects.slow;
        }};
    }
}