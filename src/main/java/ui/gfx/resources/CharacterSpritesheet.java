package ui.gfx.resources;

import ui.gfx.frame.Animation;
import ui.gfx.frame.Frame;
import ui.gfx.frame.FrameAnimation;
import ui.gfx.frame.Spritesheet;

import java.util.HashMap;
import java.util.Map;

import static ui.gfx.frame.Animation.BASIC;
import static ui.gfx.frame.Animation.BASIC_AIR;
import static ui.gfx.frame.Animation.CLIMBING;
import static ui.gfx.frame.Animation.CLIMBING_END;
import static ui.gfx.frame.Animation.CLIMBING_START;
import static ui.gfx.frame.Animation.GOAL;
import static ui.gfx.frame.Animation.IDLE;
import static ui.gfx.frame.Animation.MATERIALIZATION;
import static ui.gfx.frame.Animation.MIDAIR;
import static ui.gfx.frame.Animation.MIDAIR_GUN;
import static ui.gfx.frame.Animation.PUSHED;
import static ui.gfx.frame.Animation.RUN;
import static ui.gfx.frame.Animation.RUN_GUN;
import static ui.gfx.frame.Animation.RUN_START;
import static ui.gfx.frame.Animation.SHOOTING;

class CharacterSpritesheet {
    private final static String name = "sprites.png";

    static Spritesheet spritesheet() {
        return new Spritesheet(getMap());
    }

    private static Map<Animation, FrameAnimation> getMap() {
        Map<Animation, FrameAnimation> animations = new HashMap<>();

        animations.put(MATERIALIZATION, new FrameAnimation(FrameAnimation.Speed.Materialization,
                new Frame(name, 6, 5, 9, 48, 4),
                new Frame(name, 23, 24, 22, 29, 11),
                new Frame(name, 51, 11, 30, 42, 15),
                new Frame(name, 88, 14, 30, 39, 15),
                new Frame(name, 124, 17, 30, 36, 15),
                new Frame(name, 160, 19, 30, 34, 15),
                new Frame(name, 197, 21, 30, 32, 15)));
        animations.put(IDLE, new FrameAnimation(FrameAnimation.Speed.Idle,
                new Frame(name, 233, 19, 30, 34, 15),
                new Frame(name, 269, 19, 30, 34, 15),
                new Frame(name, 305, 19, 30, 34, 15)));
        animations.put(MIDAIR, new FrameAnimation(FrameAnimation.Speed.MidAir,
                new Frame(name, 175, 71, 24, 37, 12),
                new Frame(name, 207, 67, 17, 41, 11),
                new Frame(name, 234, 62, 19, 46, 12),
                new Frame(name, 260, 67, 23, 41, 14),
                new Frame(name, 290, 66, 27, 42, 18),
                new Frame(name, 326, 70, 24, 38, 12),
                new Frame(name, 355, 76, 30, 32, 17)));
        animations.put(MIDAIR_GUN, new FrameAnimation(FrameAnimation.Speed.MidAirGun,
                new Frame(name, 399, 73, 34, 37, 12),
                new Frame(name, 438, 69, 31, 41, 11),
                new Frame(name, 475, 64, 32, 46, 14),
                new Frame(name, 511, 69, 36, 41, 14),
                new Frame(name, 551, 68, 36, 42, 14),
                new Frame(name, 594, 72, 35, 38, 12),
                new Frame(name, 634, 78, 41, 32, 16)));
        animations.put(RUN_START, new FrameAnimation(FrameAnimation.Speed.RunStart,
                new Frame(name, 10, 118, 30, 34, 15)));
        animations.put(RUN, new FrameAnimation(FrameAnimation.Speed.Run,
                new Frame(name, 45, 118, 20, 34, 9),
                new Frame(name, 69, 117, 23, 35, 12),
                new Frame(name, 95, 118, 32, 34, 17),
                new Frame(name, 131, 119, 34, 33, 18),
                new Frame(name, 170, 119, 26, 33, 14),
                new Frame(name, 202, 118, 22, 34, 11),
                new Frame(name, 229, 117, 25, 35, 12),
                new Frame(name, 259, 118, 30, 34, 14),
                new Frame(name, 292, 119, 34, 33, 15),
                new Frame(name, 330, 119, 29, 33, 13)));
        animations.put(RUN_GUN, new FrameAnimation(FrameAnimation.Speed.RunGun,
                new Frame(name, 10, 167, 34, 34, 9),
                new Frame(name, 48, 166, 37, 35, 12),
                new Frame(name, 89, 167, 40, 34, 17),
                new Frame(name, 132, 168, 43, 33, 18),
                new Frame(name, 180, 168, 39, 33, 14),
                new Frame(name, 223, 167, 36, 34, 11),
                new Frame(name, 263, 166, 38, 35, 12),
                new Frame(name, 305, 167, 40, 34, 14),
                new Frame(name, 349, 168, 42, 33, 15),
                new Frame(name, 395, 168, 40, 33, 13)));
        animations.put(PUSHED, new FrameAnimation(FrameAnimation.Speed.Pushed,
                new Frame(name, 456, 167, 22, 36, 6),
                new Frame(name, 482, 166, 25, 36, 8)));
        animations.put(SHOOTING, new FrameAnimation(FrameAnimation.Speed.Shooting,
                new Frame(name, 5, 217, 32, 36, 19),
                new Frame(name, 43, 217, 31, 36, 19),
                new Frame(name, 79, 221, 36, 32, 16),
                new Frame(name, 119, 221, 41, 32, 16),
                new Frame(name, 164, 219, 28, 34, 16),
                new Frame(name, 199, 221, 32, 32, 16),
                new Frame(name, 234, 221, 29, 32, 16),
                new Frame(name, 268, 221, 37, 32, 18),
                new Frame(name, 308, 221, 43, 32, 18)));
        animations.put(BASIC, new FrameAnimation(FrameAnimation.Speed.Basic,
                new Frame(name, 4, 291, 30, 34, 18),
                new Frame(name, 40, 292, 31, 33, 19),
                new Frame(name, 76, 292, 31, 33, 19),
                new Frame(name, 110, 287, 39, 38, 27),
                new Frame(name, 151, 290, 38, 35, 26),
                new Frame(name, 193, 270, 42, 55, 25),
                new Frame(name, 239, 272, 63, 53, 18),
                new Frame(name, 308, 292, 47, 33, 19),
                new Frame(name, 357, 293, 47, 32, 19),
                new Frame(name, 407, 293, 32, 32, 19),
                new Frame(name, 443, 292, 32, 33, 19)));
        animations.put(BASIC_AIR, new FrameAnimation(FrameAnimation.Speed.BasicAir,
                new Frame(name, 5, 349, 28, 44, 17, 9),
                new Frame(name, 39, 350, 25, 39, 13, 13),
                new Frame(name, 69, 350, 30, 44, 19, 8),
                new Frame(name, 107, 349, 37, 49, 26, 4),
                new Frame(name, 150, 354, 37, 43, 28, 5),
                new Frame(name, 193, 340, 41, 59, 26, 3),
                new Frame(name, 250, 337, 51, 64, 7, 1),
                new Frame(name, 311, 358, 37, 44, 9, 0),
                new Frame(name, 356, 358, 36, 42, 10, 2),
                new Frame(name, 397, 358, 21, 42, 9, 2),
                new Frame(name, 427, 358, 22, 44, 9, 0)));
        animations.put(GOAL, new FrameAnimation(FrameAnimation.Speed.Goal,
                new Frame(name, 501, 279, 28, 45, 16),
                new Frame(name, 537, 279, 29, 45, 16),
                new Frame(name, 573, 276, 34, 48, 16),
                new Frame(name, 612, 278, 29, 45, 16),
                new Frame(name, 648, 278, 31, 45, 16)));
        animations.put(CLIMBING_START, new FrameAnimation(FrameAnimation.Speed.ClimbingStart,
                new Frame(name, 468, 359, 21, 36)));
        animations.put(CLIMBING_END, new FrameAnimation(FrameAnimation.Speed.ClimbingEnd,
                new Frame(name, 616, 357, 21, 32),
                new Frame(name, 645, 350, 18, 34)));
        animations.put(CLIMBING, new FrameAnimation(FrameAnimation.Speed.Climbing,
                new Frame(name, 499, 352, 19, 49, 9),
                new Frame(name, 528, 357, 20, 40, 10),
                new Frame(name, 557, 357, 20, 40, 11),
                new Frame(name, 587, 352, 19, 49, 10),
                new Frame(name, 557, 357, 20, 40, 11),
                new Frame(name, 528, 357, 20, 40, 10)));
        return animations;
    }
}
