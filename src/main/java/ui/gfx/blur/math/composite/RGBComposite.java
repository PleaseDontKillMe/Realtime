package ui.gfx.blur.math.composite;

import lombok.RequiredArgsConstructor;

import java.awt.*;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

import static java.lang.Math.max;
import static java.lang.Math.min;

public abstract class RGBComposite implements Composite {

    protected float extraAlpha;

    public RGBComposite() {
        this(1.0f);
    }

    public RGBComposite(float alpha) {
        if (alpha < 0.0f || alpha > 1.0f)
            throw new IllegalArgumentException("RGBComposite: alpha must be between 0 and 1");
        this.extraAlpha = alpha;
    }

    public float getAlpha() {
        return extraAlpha;
    }

    public int hashCode() {
        return Float.floatToIntBits(extraAlpha);
    }

    public boolean equals(Object o) {
        if (!(o instanceof RGBComposite))
            return false;
        RGBComposite c = (RGBComposite) o;

        if (extraAlpha != c.extraAlpha)
            return false;
        return true;
    }

    @RequiredArgsConstructor
    public abstract static class RGBCompositeContext implements CompositeContext {
        private final float alpha;
        private final ColorModel srcColorModel;
        private final ColorModel dstColorModel;

        // Multiply two numbers in the range 0..255 such that 255*255=255
        static int multiply255(int a, int b) {
            int t = a * b + 0x80;
            return ((t >> 8) + t) >> 8;
        }

        static int clamp(int a) {
            return min(max(0, a), 255);
        }

        public abstract void composeRGB(int[] src, int[] dst, float alpha);

        public void compose(Raster src, Raster dstIn, WritableRaster dstOut) {
            float alpha = this.alpha;

            int[] srcPix = null;
            int[] dstPix = null;

            int x = dstOut.getMinX();
            int w = dstOut.getWidth();
            int y0 = dstOut.getMinY();
            int y1 = y0 + dstOut.getHeight();

            for (int y = y0; y < y1; y++) {
                srcPix = src.getPixels(x, y, w, 1, srcPix);
                dstPix = dstIn.getPixels(x, y, w, 1, dstPix);
                composeRGB(srcPix, dstPix, alpha);
                dstOut.setPixels(x, y, w, 1, dstPix);
            }
        }
    }
}
