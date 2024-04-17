package content;

import arc.graphics.Color;
import arc.math.Mathf;
import arc.math.geom.Rect;
import mindustry.content.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;

public class CPUnitTypes {
    public static UnitType
            //legs
            aegisPrime;
    public static void load() {
        aegisPrime = new ErekirUnitType("aegis-prime"){{
            health = 22000;
            hitSize = 48f;
            speed = 0.4f;
            rotateSpeed = 1.4f;
            armor = 45f;

            lockLegBase = true;
            legContinuousMove = true;
            legGroupSize = 3;
            legStraightness = 0.4f;
            baseLegStraightness = 0.75f;
            legMaxLength = 1.75f;
            legCount = 6;
            legLength = 15f;
            legForwardScl = 0.45f;
            legMoveSpace = 2f;
            stepShake = 1f;
            legExtension = -5f;
            legBaseOffset = 9f;

            legSplashDamage = 50;
            legSplashRange = 30;
            drownTimeMultiplier = 3f;

            abilities.add(new ShieldArcAbility(){{
                region = "cp-aegis-prime-shield";
                radius = 47f;
                width = 3f;
                y = -20f;
                angle = 90f;
                regen = 40f;
                cooldown = 60f * 6f;
                max = 6500f;
                whenShooting = true;
            }});
        }};
    }
}