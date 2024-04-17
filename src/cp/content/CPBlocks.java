package cp.content;

import arc.Core;
import arc.graphics.Color;
import arc.struct.Seq;
import arc.util.*;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import mindustry.entities.bullet.ContinuousFlameBulletType;

import static mindustry.type.ItemStack.with;

public class CPBlocks {
    public static Block
    //turret
    slash, hurricane, vortex, horizon, destruction,
    //storage
    coreQuant, corePhoton, coreNova,
    //transport
    isolatedConveyor, isolatedRouter, isolatedJunction, isolatedSorter,
    //production
    highFrequencyDrill, ammoniaCondenser, oreCrusher,
    //power
    powerTower, reinforcedBattery,
    //crafting
    silinorCrucible, impactPress;
    public static void load() {

        //turret

        slash = new PowerTurret("slash"){{
            requirements(Category.turret, with(Items.graphite, 50));
            size = 3;
            scaledHealth = 230;
            range = 200f;
            reload = 60f;
            liquidCapacity = 10f;
            shootType = new ContinuousFlameBulletType(){{
                damage = 200f;
                length = range + 25f;
                width = 2;
                knockback = 1f;
                pierce = true;
                buildingDamageMultiplier = 0.35f;

                colors = new Color[]{Color.valueOf("c88ed6").a(0.55f), Color.valueOf("c6ace8").a(0.7f), Color.valueOf("dfd1f1").a(0.8f), Color.white.a(0.95f), Color.white};
            }};
        }};
    }
}