package ui.gfx.resources;

import ui.gfx.frame.Frame;
import ui.gfx.frame.FrameAnimation;
import ui.gfx.frame.Spritesheet;

public class CharacterSpritesheet {
    final Spritesheet spritesheet = new Spritesheet("sprites.png",
            new FrameAnimation("materialization", FrameAnimation.Speed.Materialization,
                    new Frame(6, 5, 9, 48, 4),
                    new Frame(23, 24, 22, 29, 11),
                    new Frame(51, 11, 30, 42, 15),
                    new Frame(88, 14, 30, 39, 15),
                    new Frame(124, 17, 30, 36, 15),
                    new Frame(160, 19, 30, 34, 15),
                    new Frame(197, 21, 30, 32, 15)),
            new FrameAnimation("idle", FrameAnimation.Speed.Idle,
                    new Frame(233, 19, 30, 34, 15),
                    new Frame(269, 19, 30, 34, 15),
                    new Frame(305, 19, 30, 34, 15)),
            new FrameAnimation("midair", FrameAnimation.Speed.MidAir,
                    new Frame(175, 71, 24, 37, 12),
                    new Frame(207, 67, 17, 41, 11),
                    new Frame(234, 62, 19, 46, 12),
                    new Frame(260, 67, 23, 41, 14),
                    new Frame(290, 66, 27, 42, 18),
                    new Frame(326, 70, 24, 38, 12),
                    new Frame(355, 76, 30, 32, 17)),
            new FrameAnimation("midair-gun", FrameAnimation.Speed.MidAirGun,
                    new Frame(399, 73, 34, 37, 12),
                    new Frame(438, 69, 31, 41, 11),
                    new Frame(475, 64, 32, 46, 14),
                    new Frame(511, 69, 36, 41, 14),
                    new Frame(551, 68, 36, 42, 14),
                    new Frame(594, 72, 35, 38, 12),
                    new Frame(634, 78, 41, 32, 16)),
            new FrameAnimation("run-start", FrameAnimation.Speed.RunStart,
                    new Frame(10, 118, 30, 34, 15)),
            new FrameAnimation("run", FrameAnimation.Speed.Run,
                    new Frame(45, 118, 20, 34, 9),
                    new Frame(69, 117, 23, 35, 12),
                    new Frame(95, 118, 32, 34, 17),
                    new Frame(131, 119, 34, 33, 18),
                    new Frame(170, 119, 26, 33, 14),
                    new Frame(202, 118, 22, 34, 11),
                    new Frame(229, 117, 25, 35, 12),
                    new Frame(259, 118, 30, 34, 14),
                    new Frame(292, 119, 34, 33, 15),
                    new Frame(330, 119, 29, 33, 13)),
            new FrameAnimation("run-gun", FrameAnimation.Speed.RunGun,
                    new Frame(10, 167, 34, 34, 9),
                    new Frame(48, 166, 37, 35, 12),
                    new Frame(89, 167, 40, 34, 17),
                    new Frame(132, 168, 43, 33, 18),
                    new Frame(180, 168, 39, 33, 14),
                    new Frame(223, 167, 36, 34, 11),
                    new Frame(263, 166, 38, 35, 12),
                    new Frame(305, 167, 40, 34, 14),
                    new Frame(349, 168, 42, 33, 15),
                    new Frame(395, 168, 40, 33, 13)),
            new FrameAnimation("pushed", FrameAnimation.Speed.Pushed,
                    new Frame(456, 167, 22, 36, 6),
                    new Frame(482, 166, 25, 36, 8)),
            new FrameAnimation("shooting", FrameAnimation.Speed.Shooting,
                    new Frame(5, 217, 32, 36, 19),
                    new Frame(43, 217, 31, 36, 19),
                    new Frame(79, 221, 36, 32, 16),
                    new Frame(119, 221, 41, 32, 16),
                    new Frame(164, 219, 28, 34, 16),
                    new Frame(199, 221, 32, 32, 16),
                    new Frame(234, 221, 29, 32, 16),
                    new Frame(268, 221, 37, 32, 18),
                    new Frame(308, 221, 43, 32, 18)),
            new FrameAnimation("basic", FrameAnimation.Speed.Basic,
                    new Frame(4, 291, 30, 34, 18),
                    new Frame(40, 292, 31, 33, 19),
                    new Frame(76, 292, 31, 33, 19),
                    new Frame(110, 287, 39, 38, 27),
                    new Frame(151, 290, 38, 35, 26),
                    new Frame(193, 270, 42, 55, 25),
                    new Frame(239, 272, 63, 53, 18),
                    new Frame(308, 292, 47, 33, 19),
                    new Frame(357, 293, 47, 32, 19),
                    new Frame(407, 293, 32, 32, 19),
                    new Frame(443, 292, 32, 33, 19)),
            new FrameAnimation("basic-air", FrameAnimation.Speed.BasicAir,
                    new Frame(5, 349, 28, 44, 17, 9),
                    new Frame(39, 350, 25, 39, 13, 13),
                    new Frame(69, 350, 30, 44, 19, 8),
                    new Frame(107, 349, 37, 49, 26, 4),
                    new Frame(150, 354, 37, 43, 28, 5),
                    new Frame(193, 340, 41, 59, 26, 3),
                    new Frame(250, 337, 51, 64, 7, 1),
                    new Frame(311, 358, 37, 44, 9, 0),
                    new Frame(356, 358, 36, 42, 10, 2),
                    new Frame(397, 358, 21, 42, 9, 2),
                    new Frame(427, 358, 22, 44, 9, 0)),
            new FrameAnimation("goal", FrameAnimation.Speed.Goal,
                    new Frame(501, 279, 28, 45, 16),
                    new Frame(537, 279, 29, 45, 16),
                    new Frame(573, 276, 34, 48, 16),
                    new Frame(612, 278, 29, 45, 16),
                    new Frame(648, 278, 31, 45, 16)),
            new FrameAnimation("climbing-start", FrameAnimation.Speed.ClimbingStart,
                    new Frame(468, 359, 21, 36)),
            new FrameAnimation("climbing-end", FrameAnimation.Speed.ClimbingEnd,
                    new Frame(616, 357, 21, 32),
                    new Frame(645, 350, 18, 34)),
            new FrameAnimation("climbig", FrameAnimation.Speed.Climbing,
                    new Frame(499, 352, 19, 49, 9),
                    new Frame(528, 357, 20, 40, 10),
                    new Frame(557, 357, 20, 40, 11),
                    new Frame(587, 352, 19, 49, 10),
                    new Frame(557, 357, 20, 40, 11),
                    new Frame(528, 357, 20, 40, 10)
            )
    );
}
